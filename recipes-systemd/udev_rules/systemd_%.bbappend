FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://80-xvc.rules"

do_install:append() {
    install -d ${D}${sysconfdir}/udev/rules.d
    install -m 0644 ${WORKDIR}/80-xvc.rules ${D}${sysconfdir}/udev/rules.d/80-xvc.rules
}
