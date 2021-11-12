FROM openjdk:11

RUN mkdir -p /srv/app
WORKDIR /srv/app
RUN curl --output ot-platform-api-beta-latest.zip -sL https://github.com/opentargets/platform-api-beta/releases/download/21.09.5/ot-platform-api-beta-latest.zip
RUN unzip -q ot-platform-api-beta-latest.zip
COPY production.conf /srv/app/production.conf
COPY production.xml /srv/app/production.xml
ENTRYPOINT ot-platform-api-beta-latest/bin/ot-platform-api-beta \
  -J-Xms2g \
  -J-Xmx7g \
  -J-server \
  -Dconfig.file=/srv/app/production.conf \
  -Dlogger.file=/srv/app/production.xml
