do_install:prepend:nativesdk() {
    # Empêche make d'entrer dans le dossier elf (où les erreurs apparaissent)
    sed -i '/^install-others += elf$/d' ${S}/Makefile
    sed -i '/^subdirs += elf$/d' ${S}/Makefile
}
