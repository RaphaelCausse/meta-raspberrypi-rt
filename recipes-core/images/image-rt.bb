SUMMARY = "Image Linux minimale pour un noyau avec le patch PREEMPT_RT"
LICENSE = "MIT"

inherit core-image


IMAGE_FEATURES:append = " ssh-server-openssh"

IMAGE_FEATURES:remove = "splash package-management"

IMAGE_INSTALL:append = " util-linux"
IMAGE_INSTALL:append = " bash bash-completion tree vim nano"
IMAGE_INSTALL:append = " busybox"
IMAGE_INSTALL:append = " rt-tests htop"
IMAGE_INSTALL:append = " gdbserver"
IMAGE_INSTALL:append = " rsyslog"
IMAGE_INSTALL:append = " wiringpi"

IMAGE_INSTALL:remove = "wpa-supplicant"
IMAGE_INSTALL:remove = "bluez bluez5-compat bluez5-utils bluez-firmware-rpidistro"

# Formats de l'image generee par Yocto
IMAGE_FSTYPES = "wic.bz2 wic.bmap"

# Taille minimal de la partition rootfs (en Kbytes)
IMAGE_ROOTFS_SIZE = "10240"

