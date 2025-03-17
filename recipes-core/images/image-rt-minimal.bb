SUMMARY = "Image Linux minimale avec patch PREEMPT_RT"
LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL:append = " glibc-utils kbd"
IMAGE_INSTALL:append = " bash bash-completion vim tree htop"
IMAGE_INSTALL:append = " busybox"
IMAGE_INSTALL:append = " rt-tests"

# Formats de l'image generee par Yocto
IMAGE_FSTYPE = "wic.bz2 wic wic.bmap"
