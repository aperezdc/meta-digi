COG_PACKAGECONFIG := " \
    ${@bb.utils.contains('PREFERRED_PROVIDER_virtual/wpebackend', 'wpebackend-fdo', 'wl', '', d)} \
"

require recipes-browser/cog/cog.inc
require conf/include/devupstream.inc

FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

SRC_URI = " \
    https://wpewebkit.org/releases/${P}.tar.xz \
    file://0001-wl-Start-fullscreened-by-default.patch \
"
SRC_URI[sha256sum] = "a32732d91bf6297fa974aa9bf6d2dab10f7b2a00f2cc3076b2b786d39fa8e129"

PACKAGECONFIG[wl] = "-DCOG_PLATFORM_WL=ON,-DCOG_PLATFORM_WL=OFF,wpebackend-fdo"

SRC_URI:class-devupstream = "git://github.com/Igalia/cog.git;protocol=https;branch=master"
SRCREV:class-devupstream = "8baeb2e7ee60861eb1aa6c7aae5b32747af3f87d"

DEPENDS += "wpewebkit (>= 2.34) wpebackend-fdo (>= 1.12)"
