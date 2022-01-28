FROM mozilla/sbt:8u292_1.5.4

RUN mkdir -p /platform-api-beta /srv/app
COPY . /platform-api-beta
WORKDIR /platform-api-beta
RUN sbt dist
RUN mv /platform-api-beta/target/universal/ot-platform-api-beta-latest.zip /srv/app/ot-platform-api-beta-latest.zip
WORKDIR /srv/app
RUN unzip -q ot-platform-api-beta-latest.zip
COPY production.conf /srv/app/production.conf
COPY production.xml /srv/app/production.xml
RUN rm -rf /platform-api-beta
ENTRYPOINT ot-platform-api-beta-latest/bin/ot-platform-api-beta \
  -J-Xms2g \
  -J-Xmx7g \
  -J-server \
  -Dconfig.file=/srv/app/production.conf \
  -Dlogger.file=/srv/app/production.xml \
  -Dpidfile.path=/dev/null
