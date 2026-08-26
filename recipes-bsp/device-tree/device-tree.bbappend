FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# Keep your custom module DTSI if needed
SRC_URI:append:aarch64 = " file://uscope_module_zynqmp.dtsi"
EXTRA_DT_INCLUDE_FILES:append:aarch64 = " uscope_module_zynqmp.dtsi"