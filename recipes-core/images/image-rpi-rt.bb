SUMMARY = "Image Linux avec patch PREEMPT_RT pour Raspberry Pi 4"
LICENSE = "MIT"

inherit core-image

IMAGE_FEATURES:append = " ssh-server-openssh"

IMAGE_INSTALL:append = " bash bash-completion"
IMAGE_INSTALL:append = " busybox"
IMAGE_INSTALL:append = " vim nano htop"
IMAGE_INSTALL:append = " gdbserver"
IMAGE_INSTALL:append = " rsyslog"
IMAGE_INSTALL:append = " rt-tests"

#IMAGE_FEATURES:remove = ""

#IMAGE_INSTALL:remove = ""

# Formats de l'image generee par Yocto
IMAGE_FSTYPE = "wic.bz2 wic wic.bmap ext3"

# Espace supplementaire pour le rootfs
IMAGE_ROOTFS_EXTRA_SPACE = "100000"