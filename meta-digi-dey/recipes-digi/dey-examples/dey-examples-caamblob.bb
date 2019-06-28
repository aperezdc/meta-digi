# Copyright (C) 2017-2019, Digi International Inc.

require recipes-digi/dey-examples/dey-examples-src.inc

SUMMARY = "DEY examples: CAAM blob example application"
SECTION = "examples"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "${DEY_EXAMPLES_GIT_URI};branch=${SRCBRANCH}"

S = "${WORKDIR}/git/caam-blob-example"

inherit pkgconfig

do_install() {
	oe_runmake DESTDIR=${D} install
}
