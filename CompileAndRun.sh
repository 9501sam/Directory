#!/bin/sh
#http://www.sergiy.ca/how-to-compile-and-launch-java-code-from-command-line/
#https://stackoverflow.com/questions/4764768/java-how-can-i-compile-an-entire-directory-structure-of-code
rm bin/* -rf

#javac -d bin src/directory/*.java src/directory/login/*java src/directory/fileIO/*java src/directory/data/*java src/directory/functions/*java src/directory/functions/basic/*java src/directory/functions/advanced/*java
javac -d bin $(find src -name "*.java")

java -classpath ./bin directory.Demo

