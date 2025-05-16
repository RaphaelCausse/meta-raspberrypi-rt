SUMMARY = "Image Linux minimale avec PREEMPT_RT"
LICENSE = "MIT"

inherit core-image

# Ajouter des features
IMAGE_FEATURES:append = " ssh-server-openssh"

# Supprimer des features
IMAGE_FEATURES:remove = "debug-tweaks package-management splash"

# Ajouter des packages
IMAGE_INSTALL:append = " util-linux"
IMAGE_INSTALL:append = " bash bash-completion sudo tree vim nano"
IMAGE_INSTALL:append = " busybox"
IMAGE_INSTALL:append = " rt-tests htop"
IMAGE_INSTALL:append = " gdbserver rsyslog"
IMAGE_INSTALL:append = " wiringpi"

# Supprimer des packages
IMAGE_INSTALL:remove = "wpa-supplicant"
IMAGE_INSTALL:remove = "bluez bluez5-compat bluez5-utils bluez-firmware-rpidistro"

# Formats de l'image generee par Yocto
IMAGE_FSTYPES = "wic.bz2 wic.bmap"

# Taille minimal de la partition rootfs (en Kbytes)
IMAGE_ROOTFS_SIZE = "10240"
