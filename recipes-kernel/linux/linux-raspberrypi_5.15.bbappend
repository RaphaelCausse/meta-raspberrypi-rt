LINUX_VERSION ?= "5.15.92"

FILESEXTRAPATHS:prepend := "${THISDIR}/files:${THISDIR}/files/cfg:${THISDIR}/files/patches:"

SRC_URI += "file://patches/patch-5.15.92-rt57.patch \
            file://cfg/preempt-rt.cfg \
            file://cfg/bluetooth.cfg \
            "

COMPATIBLE_MACHINE = "raspberrypi4-64-rt"
