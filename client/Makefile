CC=javac
CFLAGS=-d
DIR=.
FILES=client.java

JAR=jar
JFLAGS=cvfe
JNAME=WCClient.jar
MAIN=Main
JFILES=*.class

RUN_FLAGS=-Dprogram.name=$(JNAME)

build:
	$(CC) $(CFLAGS) $(DIR) $(FILES)
	$(JAR) $(JFLAGS) $(JNAME) $(MAIN) $(JFILES)

run: build
	printf "\n\n"
	java $(RUN_FLAGS) -jar $(JNAME)

clean:
	rm $(JNAME) *.class
