FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# Keep your custom module DTSI if needed
SRC_URI:append:aarch64 = " file://uscope_module_zynqmp.dtsi file://uscope_r5_0.dtsi file://uscope_r5_1.dtsi"
EXTRA_DT_INCLUDE_FILES:append:aarch64 = " uscope_module_zynqmp.dtsi uscope_r5_0.dtsi uscope_r5_1.dtsi"
