FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://80-xvc.rules \
            file://81-uscope.rules \
          "

do_install:append() {
    install -d ${D}${sysconfdir}/udev/rules.d
    install -m 0644 ${WORKDIR}/80-xvc.rules ${D}${sysconfdir}/udev/rules.d/80-xvc.rules
    install -m 0644 ${WORKDIR}/81-uscope.rules ${D}${sysconfdir}/udev/rules.d/81-uscope.rules
}
