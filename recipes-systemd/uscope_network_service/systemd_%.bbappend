FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://00-wired.network"

FILES_${PN} += "${systemd_unitdir}/network/*"

do_install:append() {
    install -d ${D}${systemd_unitdir}/network/
    install -m 0644 ${WORKDIR}/*.network ${D}${systemd_unitdir}/network/
}
