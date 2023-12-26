FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
 
SYSTEM_USER_DTSI_zynq ?= "uscope_module_zynq.dtsi"
SYSTEM_USER_DTSI_zynqmp ?= "uscope_module_zynqmp.dtsi"

SRC_URI:append = "file://${SYSTEM_USER_DTSI_zynq} \
                  file://${SYSTEM_USER_DTSI_zynqmp}"
 
do_configure:append() {

        if [ ${MACHINE} = "zynq"]; then
                cp ${WORKDIR}/${SYSTEM_USER_DTSI_zynq} ${B}/device-tree
                echo "/include/ \"${SYSTEM_USER_DTSI_zynq}\"" >> ${B}/device-tree/system-top.dts
        else
                cp ${WORKDIR}/${SYSTEM_USER_DTSI_zynqmp} ${B}/device-tree
                echo "/include/ \"${SYSTEM_USER_DTSI_zynqmp}\"" >> ${B}/device-tree/system-top.dts
        fi
      
}