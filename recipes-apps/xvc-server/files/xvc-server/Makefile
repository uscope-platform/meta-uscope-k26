XVCSERVER := xvc-server

.PHONY: ioctl 
ioctl: $(XVCSERVER)

.PHONY: mmap
mmap: $(XVCSERVER)_mmap

.PHONY: all
all: ioctl mmap

$(XVCSERVER): $(XVCSERVER).c
	$(CC) -Wall -DUSE_IOCTL -o $@ $^

$(XVCSERVER)_mmap: $(XVCSERVER).c
	$(CC) -Wall -o $@ $^


.PHONY: clean
clean:
	rm -f $(XVCSERVER)_mmap
	rm -f $(XVCSERVER)