#!/bin/sh

clear
tree src/directory/

echo
echo "(de)Demo (da)data  (fi)fileIO  (fu)functions  (lo)login:"
read dir

if [ "$dir" = "de" ] 
then
	vim ~/Java_Project/Directory/src/directory/*.java -p
elif [ "$dir" = "da" ] 
then
	vim ~/Java_Project/Directory/src/directory/data/*java -p
elif [ "$dir" = "fi" ] 
then
	vim ~/Java_Project/Directory/src/directory/fileIO/*java -p
elif [ "$dir" = "fu" ] 
then
	vim ~/Java_Project/Directory/src/directory/functions/*java -p
elif [ "$dir" = "lo" ] 
then
	vim ~/Java_Project/Directory/src/directory/login/*.java -p
elif [ "$dir" = "us" ] 
then
	vim ~/Java_Project/Directory/src/directory/functions/user/*.java -p
else
	vim ~/Java_Project/Directory/src/directory/*.java ~/Java_Project/Directory/src/directory/fileIO/*java ~/Java_Project/Directory/src/directory/functions/*/*java ~/Java_Project/Directory/src/directory/login/*.java -p
fi

