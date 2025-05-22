# UART pour une console sur /dev/ttyS0
ENABLE_UART ??= "0"

# Isoler et optimiser les CPU pour le temps reel
ISOLATED_CPUS = "1-3"

# Activation des fonctionnalites materielles
MACHINE_FEATURES:append = " serial"

# Desactivation des fonctionnalites materielles inutiles
MACHINE_FEATURES:remove = "wifi bluetooth alsa audio touchscreen apm phone qemu-usermode"
MACHINE_EXTRA_RRECOMMENDS:remove = "bluez-firmware-rpidistro"

# Desactivation des fonctionnalites logicielles inutiles
DISTRO_FEATURES:remove = "wifi bluetooth alsa pulseaudio x11 wayland opengl vulkan nfc 3g ptest pcmcia"

# Systeme d'init
INIT_MANAGER = "sysvinit"
DISTRO_FEATURES:remove = "systemd"
DISTRO_FEATURES:append = " sysvinit"
VIRTUAL-RUNTIME_init_manager = "sysvinit"
VIRTUAL-RUNTIME_initscripts = "initscripts"
