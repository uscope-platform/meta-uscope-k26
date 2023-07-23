FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
 
SYSTEM_USER_DTSI ?= "uscope_module.dtsi"
 
SRC_URI:append = " file://${SYSTEM_USER_DTSI}"
 
do_configure:append() {
        cp ${WORKDIR}/${SYSTEM_USER_DTSI} ${B}/device-tree
        echo "/include/ \"${SYSTEM_USER_DTSI}\"" >> ${B}/device-tree/system-top.dts
}