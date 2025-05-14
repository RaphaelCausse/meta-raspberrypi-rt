SUMMARY = "WiringPi - GPIO Interface library for Raspberry Pi"
HOMEPAGE = "https://github.com/WiringPi/WiringPi"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/WiringPi/WiringPi.git;branch=master;protocol=https \
           file://fix-symlink.patch \
           "

SRCREV = "4639b7ac45ff87a9c2271a3d44f7fccb618c88ff"

S = "${WORKDIR}/git"

DEPENDS += "libxcrypt"
RDEPENDS:${PN} += "libxcrypt"

inherit pkgconfig

# Variables pour cross-compilation propre
EXTRA_OEMAKE += "CC='${CC}' AR='${AR}' RANLIB='${RANLIB}' LDFLAGS='${LDFLAGS}'"
EXTRA_OEMAKE += "DESTDIR='${D}' PREFIX='/usr'"

do_compile() {
    oe_runmake -C wiringPi
}

do_install() {
    oe_runmake -C wiringPi install
}

FILES:${PN} += " \
    /usr/lib/libwiringPi.so* \
    /usr/include \
"
