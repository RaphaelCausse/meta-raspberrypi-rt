FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://locale/fr_FR"

do_install:append() {
    install -d ${D}${sysconfdir}/default
    install -m 0644 ${WORKDIR}/locale/fr_FR ${D}${sysconfdir}/default/locale
}
