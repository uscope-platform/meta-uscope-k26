inherit core-image

SSH_SERVER_DEFAULT = "ssh-server-openssh"
COMMON_FEATURES ?= "${SSH_SERVER_DEFAULT}"

IMAGE_FEATURES += "${COMMON_FEATURES}"

SYSTEMD_DEFAULT_TARGET = "multi-user.target"

COMMON_INSTALL = " \
    packagegroup-core-boot \
    tcf-agent \
    mtd-utils \
    bridge-utils \
    can-utils \
    pciutils \
    kernel-modules \
    nfs-utils \
    nfs-utils-client \
    htop \
    iperf3 \
    u-boot-tools \
    e2fsprogs \
    parted \
    e2fsprogs-resize2fs \
    "

IMAGE_INSTALL = " \
    ${COMMON_INSTALL} \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    "
