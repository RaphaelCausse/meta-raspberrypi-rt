SUMMARY = "Image Linux avec patch PREEMPT_RT"
LICENSE = "MIT"

inherit core-image

IMAGE_FEATURES:append = " ssh-server-openssh"

IMAGE_INSTALL:append = " util-linux"
IMAGE_INSTALL:append = " bash bash-completion"
IMAGE_INSTALL:append = " vim tree htop"
IMAGE_INSTALL:append = " busybox"
IMAGE_INSTALL:append = " rt-tests"
IMAGE_INSTALL:append = " gdbserver"
IMAGE_INSTALL:append = " rsyslog"

# Formats de l'image generee par Yocto
IMAGE_FSTYPES = "wic.bz2 wic wic.bmap"

IMAGE_ROOTFS_EXTRAP_SPACE = "100000"

# Partitionnement de l'image
WKS_FILE = "sdimage-raspberrypi4-64.wks"
WKS_FILES_PATH = "${LAYERDIR}/wic"
