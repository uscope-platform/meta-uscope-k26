SUMMARY = "uScope Image"
DESCRIPTION = "Custom image for uscope"

require uscope.inc

# Ensure Dropbear is stripped and OpenSSH is used exclusively
IMAGE_FEATURES:remove = "ssh-server-dropbear"
IMAGE_FEATURES:append = " ssh-server-openssh"

# Install application packages
IMAGE_INSTALL:append = " \
    docker \
    bootgen \
    vim \
    python3-pip \
    python3-pynacl \
    python3-cryptography \
    python3-bcrypt \
    vim \
    lrzsz \
    git \
    avahi-daemon \
    ucube_lkm \
    xvc-driver \
    open-amp \
    gcc-arm-none-eabi \
    packagegroup-openamp \
    docker-compose \
    "

inherit extrausers
EXTRA_USERS_PARAMS:append = " usermod -a -G docker,uscope amd-edf;"

LICENSE = "CLOSED"
