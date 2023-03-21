FROM sbtscala/scala-sbt:eclipse-temurin-jammy-11.0.17_8_1.9.3_2.13.11 as build
RUN apt-get update \
    && apt-get install -y unzip \
    && rm -rf /var/lib/apt/lists/*
# the Scala release that works in .travis.yml
RUN echo 2.13.7 >/root/scala-version

RUN mkdir /platform-api /platform-api/project
WORKDIR /platform-api
# fetch dependencies in a layer that stays cached if the source changes
COPY build.sbt sbt-launch.jar .
COPY project/build.properties project/plugins.sbt project
RUN sbt ++$(cat /root/scala-version) update
# build the SBT compiler bridge (by having sbt make scalac parse something)
RUN touch a.scala \
    && sbt ++$(cat /root/scala-version) compile \
    && rm a.scala

COPY . .
# clean any accidentally included intermediate files and compile into a zip
RUN sbt ++$(cat /root/scala-version) clean dist
RUN unzip -q target/universal/ot-platform-api-latest.zip

FROM eclipse-temurin:11
COPY --from=build /platform-api/ot-platform-api-latest /srv/app/ot-platform-api-latest
COPY production.conf /srv/app/production.conf
COPY production.xml /srv/app/production.xml
WORKDIR /srv/app
ENTRYPOINT ot-platform-api-latest/bin/ot-platform-api \
    -J-Xms2g \
    -J-Xmx7g \
    -J-server \
    -Dconfig.file=/srv/app/production.conf \
    -Dlogger.file=/srv/app/production.xml \
    -Dlogback.debug=true \
    -Dcom.sun.management.jmxremote \
    -Dcom.sun.management.jmxremote.port=31238 \
    -Dcom.sun.management.jmxremote.ssl=false \
    -Dcom.sun.management.jmxremote.authenticate=false \
