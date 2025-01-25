#!/usr/bin bash
echo "This is a startup shell script"

echo -e "\PROCESS 1: REMOVE ALL '.class' FILES STARTED..."
find . -type f -name "*.class" -exec rm -f {} \;
echo "removed all .class files."

echo -e "\PROCESS 2: FETCH DATA FROM ORIGIN"
git fetch origin && git pull origin main
echo "Successfully fetched the data from 'main' branch"

echo -e "\nStartup process complete."
echo "Have a nice day!"