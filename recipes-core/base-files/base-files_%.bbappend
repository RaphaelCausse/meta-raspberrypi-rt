FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://locale/fr_FR \
            file://keymap/fr \
            "

do_install:append() {
    install -d ${D}${sysconfdir}/default
    install -m 0644 ${WORKDIR}/locale/fr_FR ${D}${sysconfdir}/default/locale
    install -m 0644 ${WORKDIR}/keymap/fr ${D}${sysconfdir}/default/keyboard
}
