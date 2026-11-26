SUMMARY = "ucube_lkm"
DESCRIPTION = "Kernel driver exposing the uScope scope channels (AXI DMA), FPGA \
programming and PL clock control to userspace."
HOMEPAGE = "https://github.com/uscope-platform/uscope_module"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "git://github.com/uscope-platform/uscope_module.git;protocol=https;branch=main"
SRCREV = "ad5068e226d431f0e3758c1a9022ec6578d9bfc7"

PV = "2.2+git"
S = "${WORKDIR}/git/src"

RPROVIDES:${PN} += "ucube_lkm"

inherit module
inherit useradd

USERADD_PACKAGES = "${PN}"
GROUPADD_PARAM:${PN} = "-g 1006 uscope"
