FROM sbtscala/scala-sbt:eclipse-temurin-21.0.8_9_1.12.7_3.8.2 AS build
RUN apt-get update \
    && apt-get install -y unzip \
    && rm -rf /var/lib/apt/lists/*
# The scala version also specified in build.sbt
RUN echo 3.5.0 >/root/scala-version

RUN mkdir /platform-api /platform-api/project
WORKDIR /platform-api
# fetch dependencies in a layer that stays cached if the source changes
COPY build.sbt sbt-launch.jar ./
COPY project/build.properties project/plugins.sbt project/
RUN sbt ++$(cat /root/scala-version) update
# build the SBT compiler bridge (by having sbt make scalac parse something)
RUN touch a.scala \
    && sbt ++$(cat /root/scala-version) compile \
    && rm a.scala

COPY . .
# clean any accidentally included intermediate files and compile into a zip
RUN sbt ++$(cat /root/scala-version) clean dist
RUN unzip -q target/universal/ot-platform-api-latest.zip

FROM eclipse-temurin:21.0.10_7-jdk-noble

ARG USER_ID=10001
ARG GROUP_ID=10001
ARG USER_NAME=nginxuser

RUN groupadd --system -g ${GROUP_ID} otapigroup && \
    useradd --system -u ${USER_ID} -g otapigroup -M ${USER_NAME}

RUN mkdir -p /srv/app

RUN apt-get update \
    && apt-get install -y --no-install-recommends bash build-essential \
    && rm -rf /var/lib/apt/lists/*

COPY --from=build /platform-api/ot-platform-api-latest /srv/app/ot-platform-api-latest
COPY production.xml /srv/app/production.xml

RUN chown -R ${USER_NAME}:otapigroup /srv/app

USER ${USER_NAME}

WORKDIR /srv/app

RUN chmod +x ot-platform-api-latest/bin/ot-platform-api

ENTRYPOINT ["bash", "-c", "ot-platform-api-latest/bin/ot-platform-api \
    ${JAVA_OPTS} \
    -J-server \
    -Dlogger.file=/srv/app/production.xml \
    -Dlogback.debug=true \
    -Dcom.sun.management.jmxremote \
    -Dcom.sun.management.jmxremote.port=31238 \
    -Dcom.sun.management.jmxremote.ssl=false \
    -Dcom.sun.management.jmxremote.authenticate=false \
    -Dpidfile.path=/dev/null"]
