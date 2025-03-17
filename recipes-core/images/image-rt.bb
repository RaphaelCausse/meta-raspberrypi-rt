SUMMARY = "Image Linux avec patch PREEMPT_RT"
LICENSE = "MIT"

include recipes-core/images/image-rt-minimal.bb

IMAGE_FEATURES:append = " ssh-server-openssh"

IMAGE_INSTALL:append = " gdbserver"
IMAGE_INSTALL:append = " rsyslog"

#IMAGE_FEATURES:remove = ""

#IMAGE_INSTALL:remove = ""
