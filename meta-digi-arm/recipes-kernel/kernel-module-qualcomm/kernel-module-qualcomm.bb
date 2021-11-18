# Copyright (C) 2016-2021 Digi International.

SUMMARY = "Qualcomm's wireless driver for qca65xx"
DESCRIPTION = "qcacld-2.0 module"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/ISC;md5=f3b90e78ea0cffb20bf5cca7947a896d"

# Reference Qualcomm tag/version
PV = "v4.2.80.63"
PV_ccimx8x = "v4.0.11.208Q"

SRCBRANCH = "qca6564/dey-2.4/maint"
SRCBRANCH_ccimx8x = "qca6574/dey-2.4/maint"
SRCREV = "93222374d5a6d8254ffee72b84b38b59e0ce63a8"
SRCREV_ccimx8x = "9110d2e6d35b7a57019c03037fd7ee756653c3d3"

QCOM_GIT_URI = "${@base_conditional('DIGI_INTERNAL_GIT', '1' , '${DIGI_MTK_GIT}linux/qcacld-2.0.git;protocol=ssh', '${DIGI_GITHUB_GIT}/qcacld-2.0.git', d)}"

SRC_URI = " \
    ${QCOM_GIT_URI};nobranch=1 \
"

# Selects whether the interface is SDIO or PCI
QUALCOMM_WIFI_INTERFACE ?= "sdio"
QUALCOMM_WIFI_INTERFACE_ccimx8x = "pci"

SRC_URI_append = " \
    file://81-qcom-wifi.rules \
    file://qualcomm.sh \
"

FILES_SDIO = " \
    file://modprobe-qualcomm.conf \
"

SRC_URI_append = "${@base_conditional('QUALCOMM_WIFI_INTERFACE', 'sdio' , '${FILES_SDIO}', '', d)}"

S = "${WORKDIR}/git"

inherit module

EXTRA_OEMAKE += "CONFIG_LINUX_QCMBR=y WLAN_OPEN_SOURCE=1"
# Explicity state it is not a QC platform, if not the driver will try to remap
# memory that is not allowed in ARMv6 (kernel commit
# 309caa9cc6ff39d261264ec4ff10e29489afc8f8)
EXTRA_OEMAKE += "CONFIG_NON_QC_PLATFORM=y"
# Flag to compile the debug version (1 - enabled, rest of values - disabled)
EXTRA_OEMAKE += "BUILD_DEBUG_VERSION=0"
# Flags for SDIO interface with wifi
FLAGS_SDIO = "CONFIG_CLD_HL_SDIO_CORE=y"
EXTRA_OEMAKE += "${@base_conditional('QUALCOMM_WIFI_INTERFACE', 'sdio' , '${FLAGS_SDIO}', '', d)}"
# Flags for PCI interface with wifi
FLAGS_PCI = "CONFIG_ROME_IF=pci CONFIG_HIF_PCI=1 CONFIG_ATH_PCIE_ACCESS_DEBUG=1 CONFIG_ATH_PCIE_MAX_PERF=1"
EXTRA_OEMAKE += "${@base_conditional('QUALCOMM_WIFI_INTERFACE', 'pci' , '${FLAGS_PCI}', '', d)}"
# Flags required for QCA6574
EXTRA_OEMAKE_append_ccimx8x = " CONFIG_ARCH_MSM=n CONFIG_ARCH_QCOM=n CONFIG_ATH_11AC_TXCOMPACT=1"

do_compile_prepend() {
	export BUILD_VER=${PV}
}

do_install_append() {
	if [ "${QUALCOMM_WIFI_INTERFACE}" = "sdio" ]; then
		install -d ${D}${sysconfdir}/modprobe.d
		install -m 0644 ${WORKDIR}/modprobe-qualcomm.conf ${D}${sysconfdir}/modprobe.d/qualcomm.conf
	fi

	install -d ${D}${base_libdir}/firmware/wlan/
	install -m 0644 ${WORKDIR}/git/firmware_bin/WCNSS_cfg.dat ${D}${base_libdir}/firmware/wlan/cfg.dat
	install -m 0644 ${WORKDIR}/git/firmware_bin/WCNSS_qcom_cfg.ini ${D}${base_libdir}/firmware/wlan/qcom_cfg.ini
	install -d ${D}${sysconfdir}/udev/scripts
	install -m 0755 ${WORKDIR}/qualcomm.sh ${D}${sysconfdir}/udev/scripts/
	install -d ${D}${sysconfdir}/udev/rules.d
	install -m 0644 ${WORKDIR}/81-qcom-wifi.rules ${D}${sysconfdir}/udev/rules.d/
}

FILES_${PN} += " \
    ${sysconfdir}/modprobe.d/qualcomm.conf \
    ${sysconfdir}/udev/ \
    ${base_libdir}/firmware/wlan/cfg.dat \
    ${base_libdir}/firmware/wlan/qcom_cfg.ini \
"

COMPATIBLE_MACHINE = "(ccimx6$|ccimx6ul|ccimx8x)"
