SUMMARY = "ucube_lkm"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=56816f07fb4e1322186fa0841a4c3f13"

inherit module

SRC_URI = "file://Makefile \
           file://ucube_lkm.c \
           file://COPYING \
          "

S = "${WORKDIR}"

RPROVIDES:${PN} += "ucube_lkm"

inherit useradd

USERADD_PACKAGES = "${PN}"
GROUPADD_PARAM:${PN} = "-g 1006 uscope"