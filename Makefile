#The way make files work is they check if a file is created, for the case of my
#server recursive make file call it checks if server is defined, and it is as
#a directory.  The .PHONY target below tells make that 'server' is not the name
#of a file but rather just some recipie
.PHONY: server client

all: server client

server:
	$(MAKE) -C server

client:
	$(MAKE) -C client

run:
	$(MAKE) -C $(target) run

clean:
	-$(MAKE) -C server clean
	-$(MAKE) -C client clean
