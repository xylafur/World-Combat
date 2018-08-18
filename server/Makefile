BUILD_DIR=build

CC=javac
CFLAGS=-d
DIR=.
FILES=startup.java

JAR=jar
JFLAGS=cvfe
JNAME=WCServer.jar
MAIN=Main
JFILES=*.class

build:
	$(CC) $(CFLAGS) $(DIR) $(FILES)
	$(JAR) $(JFLAGS) $(JNAME) $(MAIN)  $(JFILES)

run: build
	java -jar $(JNAME)

clean:
	rm $(JNAME) *.class
