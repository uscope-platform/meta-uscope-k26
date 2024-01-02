#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Xilinx Virtual Cable server"
SECTION = "development"
DEPENDS = ""
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d0a0d8970522d85bf898ca41ec59c9dc"

# This tells bitbake where to find the files we're providing on the local filesystem
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# Use local tarball
SRC_URI = "file://xvc-server.tar.gz"

# Make sure our source directory (for the build) matches the directory structure in the tarball
S = "${WORKDIR}/xvc-server"

do_install() {
    install -d ${D}${bindir}
    install -Dm 0755 ${S}/xvc-server ${D}${bindir}
}

FILES_${PN} = "${bindir}/xvc-server"
TARGET_CC_ARCH += "${LDFLAGS}"