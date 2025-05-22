SUMMARY = "WiringPi - GPIO Interface library for Raspberry Pi"
HOMEPAGE = "https://github.com/WiringPi/WiringPi"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=e6a600fd5e1d9cbde2d983680233ad02"

PV = "3.4"

inherit pkgconfig

SRCREV = "8960cc91b911db8ec0c272781edf34b8aedb60d9"
SRC_URI = "git://github.com/WiringPi/WiringPi.git;branch=master;protocol=https \
           file://fix-symlink.patch \
           "

S = "${WORKDIR}/git"

DEPENDS += "libxcrypt"
RDEPENDS:${PN} += "libxcrypt"

# Variables pour cross-compilation propre
EXTRA_OEMAKE += "CC='${CC}' AR='${AR}' RANLIB='${RANLIB}' LDFLAGS='${LDFLAGS}'"
EXTRA_OEMAKE += "DESTDIR='${D}' PREFIX='/usr'"

do_compile() {
    oe_runmake -C wiringPi
}

do_install() {
    oe_runmake -C wiringPi install
}

do_install:append() {
    ln -sf libwiringPi.so.${PV} ${D}${libdir}/libwiringPi.so
}

FILES:${PN} += "${libdir}"
FILES:${PN}-dev += "${includedir}"
