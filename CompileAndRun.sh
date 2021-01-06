#!/bin/sh
#http://www.sergiy.ca/how-to-compile-and-launch-java-code-from-command-line/

#export CLASSPATH=/home/turtlegod/Java_Project/Directory/bin:.
#export CLASSPATH=/home/turtlegod/Java_Project/Directory/src/resources:.
#export CLASSPATH=/home/turtlegod/Java_Project/Directory/src/resources:.

rm bin/* -rf

#javac -d bin -s src/ directory/Demo.java
#javac -d bin src/directory/*.java src/directory/login/*java
#javac -d bin src/directory/login/*java
#javac -d bin src/directory/fileIO/*java
#javac -d bin src/directory/functions/*/*java

javac -d bin src/directory/*.java src/directory/login/*java src/directory/fileIO/*java src/directory/data/*java src/directory/functions/*java src/directory/functions/basic/*java

#java -classpath ./bin:/res directory.Demo
java -classpath ./bin directory.Demo

