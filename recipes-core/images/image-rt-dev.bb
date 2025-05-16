require recipes-core/images/image-rt.bb

SUMMARY = "Image Linux minimale avec PREEMPT_RT (dev)"

# Ajouter des features
IMAGE_FEATURES:append = " debug-tweaks"
