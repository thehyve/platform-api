FROM mozilla/sbt:8u292_1.5.4

RUN mkdir -p /platform-api /srv/app
COPY . /platform-api
WORKDIR /platform-api
RUN sbt dist
RUN mv /platform-api/target/universal/ot-platform-api-latest.zip /srv/app/ot-platform-api-latest.zip
WORKDIR /srv/app
RUN unzip -q ot-platform-api-latest.zip
COPY production.conf /srv/app/production.conf
COPY production.xml /srv/app/production.xml
RUN rm -rf /platform-api
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
    -Dpidfile.path=/dev/null
