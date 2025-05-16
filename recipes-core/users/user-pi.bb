SUMMARY = "Ajout de l'utilisateur `pi`"
DESCRIPTION = "Utilisateur `pi` appartenant au groupe `sudo` et `dialout`"
LICENSE = "MIT"

inherit useradd

USER = "pi"
# Definir le hash du password 'azerty' (via la commande `openssl passwd -6 <password>`)
PASSWORD_HASH = "$6$G4FqZm6nWcaXNbZe$Zq/yXX5n2roG2BAiKjtKe36NRizlRXRD3gan3uYBjKEc7ErVGkLnMc0y33O7hPYb0myGC0IyP5bhL1ySuwy020"

USERADD_PACKAGES = "${PN}"

USERADD_PARAM:${PN} = "--create-home --shell /bin/bash --uid 1000 --groups sudo,dialout --password '${PASSWORD_HASH}' ${USER}"
GROUPADD_PARAM:${PN} = ""

do_install() {
    install -d ${D}/home/${USER}
    chown 1000:1000 ${D}/home/${USER}
}

FILES:${PN} += "/home/${USER}"
