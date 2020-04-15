require telegraf.inc

DESCRIPTION = "Telegraf 1.13.3"
SUMMARY = "Telegraf is the open source server agent to help you collect metrics from your stacks, sensors and systems."
HOMEPAGE = "https://www.influxdata.com/time-series-platform/telegraf/"

PR = "r1"

LICENSE = "CLOSED"

SRC_URI = "https://dl.influxdata.com/telegraf/releases/telegraf-1.13.3_linux_armhf.tar.gz"
SRC_URI[sha256sum] = "e069dd404b20a16a05f11cfca1eda0e8f3206cfc1255225166a1611776f36a79"

S = "${WORKDIR}/telegraf"