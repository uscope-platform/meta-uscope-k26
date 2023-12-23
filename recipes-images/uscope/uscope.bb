SUMMARY = "uScope Image"
DESCRIPTION = "Custom image for uscope"

require uscope.inc

#THIS PACKAGE NEEDS TO BE REMOVED AS IT CONFLICTS WITH OPENSSH
COMMON_FEATURES:remove = "ssh-server-dropbear"

PREFERRED_RPROVIDER:virtual/sshd = "openssh"
PREFERRED_RPROVIDER:virtual/ssh = "openssh"

IMAGE_INSTALL:append = " docker python3-pip python3-pynacl python3-cryptography kernel-modules vim lrzsz git openssh ssh sshd avahi-daemon"
IMAGE_INSTALL:append = " ucube_lkm e2fsprogs parted e2fsprogs-resize2fs python3-bcrypt"

LICENSE="CLOSED"
LIC_FILES_CHKSUM=""

IMAGE_CLASSES += " xilinx-bootbin"

