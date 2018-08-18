CC=javac
FILES=main.java
RUN=java -cp
build:
	$(CC) $(FILES)

run: build
	$(RUN) . Main

