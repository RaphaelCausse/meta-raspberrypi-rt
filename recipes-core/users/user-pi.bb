SUMMARY = "Ajout de l'utilisateur `pi`"
DESCRIPTION = "Utilisateur `pi` appartenant au groupe `sudo` et `dialout`"
LICENSE = "MIT"

inherirt useradd

USER = "pi"
# Definir le hash du password 'azerty' (via la commande `mkpasswd -m sha-512 <password>`)
PASSWORD_HASH = "$6$TPtiX7HpeFSf9geH$1.FAhkq/cMm08PkQh7s.t8jXDEAGa.hKLNqJelyTUiZh2EyzbYGartuJihg1JUm8TbX8rjxQ8MAioC/6MEqNO."

USERADD_PACKAGES = "${PN}"

USERADD_PARAMS:${PN} = "-u 1000 -d '/home/${USER}' -s /bin/bash -G sudo,dialout -p '${PASSWORD_HASH}' ${USER}"

do_install() {
    install -d ${D}/home/${USER}
    chown 1000:1000 ${D}/home/${USER}
}

FILES:${PN} += "${D}/home/${USER}"