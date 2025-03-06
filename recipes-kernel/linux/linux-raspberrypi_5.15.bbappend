LINUX_VERSION ?= "5.15.92"

FILESEXTRAPATHS:prepend := "${THISDIR}/files:${THISDIR}/files/cfg:"

# Ajout du patch RT spécifique à la version 5.15.92
SRC_URI += "file://patch-5.15.92-rt57.patch \
            file://cfg/enable-rt.scc \
            file://cfg/preempt-rt.cfg \
            "

# Activation des configs PREEMPT_RT avec SCC
KERNEL_FEATURES:append = " cfg/enable-rt.scc"

# Appliquer le patch PREEMPT_RT uniquement pour notre machine
COMPATIBLE_MACHINE = "raspberrypi4-64-rt"