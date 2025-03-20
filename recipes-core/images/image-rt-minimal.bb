SUMMARY = "Image Linux minimale avec patch PREEMPT_RT"
LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL:append = " util-linux"
IMAGE_INSTALL:append = " bash bash-completion"
IMAGE_INSTALL:append = " vim tree htop"
IMAGE_INSTALL:append = " busybox"
IMAGE_INSTALL:append = " rt-tests"

# Formats de l'image generee par Yocto
IMAGE_FSTYPE = "wic.bz2 wic wic.bmap"
