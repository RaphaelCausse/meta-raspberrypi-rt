# Activer l'UART
ENABLE_UART = "1"

# Isoler et optimiser les CPU pour le temps reel
ISOLATED_CPUS = "1-3"

# Desactivation des fonctionnalites materielles inutiles
MACHINE_FEATURES:remove = "wifi bluetooth alsa audio touchscreen apm phone qemu-usermode"

# Desactivation des fonctionnalites logicielles inutiles
DISTRO_FEATURES:remove = "wifi bluetooth alsa pulseaudio x11 wayland opengl vulkan nfc 3g"
