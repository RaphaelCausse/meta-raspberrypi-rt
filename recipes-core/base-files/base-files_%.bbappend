SUMMARY = "Configurer la locale FR et la disposition du clavier FR"

do_install:append() {
    # Configuration de la locale
    echo 'LANG="fr_FR.UTF-8"' > ${D}${sysconfdir}/default/locale
    echo 'LC_ALL="fr_FR.UTF-8"' >> ${D}${sysconfdir}/default/locale

    # Configuration du clavier
    echo 'KEYMAP="fr"' > ${D}${sysconfdir}/default/keymap
}