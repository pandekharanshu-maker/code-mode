#!/bin/bash
#The $# gives the number of arguements
if [ $# -ne 4 ]
then
    echo "This script requires 4 arguements to function...."
    echo "Please try again"
    exit 1
fi
echo "Enter Password to access this script:"
read -s password
if [ "$password" = "kharanshu@op" ]
then
    echo "Login Successful"
    echo "Welcome coding_overlord"
else
    echo "Incorrect Password"
    echo "Login Failed"
    exit 1
fi 
myname="Kharanshu"
age="18"
echo "Hello,my name is $myname"
echo "I am $age years old"
word="awesome"
echo "Linux is $word"
echo "Videogames are $word"
echo "Chilly days are $word"
now=$(date)
echo "The system time and date is:"
echo "$now"
echo "Your Username is:$USER"
#env command displays bulit-in variables
sum=$(expr 30 + 10)
echo "Addition of 30 and 10 is $sum"
mult=$(expr 30 \* 10)
echo "Multiplication of 30 and 10 is $mult"
result=$(expr $sum + $mult)
echo "Sum of addition and multiplication of 30 and 10 is $result"
mynum=200
if [ $mynum -eq 200 ]
then
    echo "Condition has been met"
else
    echo "Condition has not been met"
fi
mynum1=300
if [ $mynum1 -ne 200 ]
then
    echo "Condition has been met"
else
    echo "Condition has not been met"
fi

#eq means equal to
#ne means not equal
#gt means greater than
#lt means less than

if [ -f ~/myfile ]
then
    echo "The file exists"
else
    echo "The file doesn't exist"
fi

#cat filename.sh prints contents of shell file
#nano filename.sh opens shell file in terminal
#touch filename creates a file
#chmod +x filename.sh command makes the file scriptable 
#./filename.sh runs the code inside the file
#rm filename.sh removes the file
#mkdir filename.sh creates a new directory"
#which appname/filename command tell that entered app/file exists or not

command=/opt/homebrew/bin/htop
if [ -f $command ]
then 
    echo "$command is available, let's run it....."
else
    echo "$command not available, installing it....."
    brew update && brew install htop
fi

#To uninstall htop use this commands- 
#   brew uninstall htop
#   brew cleanup
#man test command opens up manual related to testing
#echo $? command gives 0 output for successful run and other than 0 for failure run

directory=/etc
if [ -d $directory ]
then
    echo "The directory exists...."
else
    echo "The directory doesn't exist...."
fi

echo "The exit code for this script is $?"
echo "Hello World?"
echo "$?"
#The exit statement forces the exit code to be given number

myvar=1
while [ $myvar -le 10 ]
do
    echo $myvar
    myvar=$(( $myvar +1))
    sleep 0.5
done
echo "Successfully printed 1 to 10 numbers using while loop"
#sleep (value) adds a delay of printing speed in the loop for entered value

for n in {1..10}
do
    echo $n
    sleep 0.1
done
echo "Successfully printed 1 to 10 numbers using for loop"

#find /directory -type f gives all the files present in the directory as output
#tail -f filepath command lets you monitor the file 

echo "Enter your name:"
read myname
echo "Your name is $myname"

#Example of an user defined function
echo "Enter a number:"
read n
square() {
    square=$(expr $n \* $n)
    echo "Square of $n is $square"
}
square

#Example of menu driven program with help of case 
echo "What is your favourite Linux distribution"
echo "1 - Arch"
echo "2 - CentOS"
echo "3 - Debian"
echo "4 - Mint"
echo "5 - Ubuntu"
echo "6 - HomeBrew"
echo "7 - Something else"
read distro
case $distro in
    1) echo "Arch is a rolling release.";;
    2) echo "CentOS is popular on servers.";;
    3) echo "Debian is community distribution.";;
    4) echo "Mint is popular on desktops and laptops.";;
    5) echo "Ubuntu is popular on both servers and laptops.";;
    6) echo "HomeBrew is tailor made for MacOS.";;
    7) echo "There are many distributions out there....";;
    *) echo "Number entered is out of scope."
esac  

#sleep (seconds) && ./myscript.sh command will automate the run of the file after a delay of seconds entered
echo "Caution file is going to run again in 30 seconds!"
echo "Type yes to run again:"
read option
if [ "$option" = "yes" ]
then
    echo "Automated file run has been initiated"
    sleep 30 && ./myscript.sh
else
    echo "Automated file run has been cancelled"
fi

: <<'COMMENT'
usage: at [-q x] [-f file] [-m] time
       at -c job [job ...]
       at [-f file] -t [[CC]YY]MMDDhhmm[.SS]
       at -r job [job ...]
       at -l -q queuename
       at -l [job ...]
       atq [-q x] [-v]
       atrm job [job ...]
       batch [-f file] [-m]
These are all the at commands which can also be used to automate the jobs 
COMMENT

#NOTE - Always use the full for commands like for echo use /bin/echo instead of just echo 

#crontab -e command lets you automate the file run in the following format - minute hour dayofmonth month dayofweek command_to_run 

#Giving asterisk i.e * in the place of an integer value lets you run the file every day or week or month depending on where you gave it 

/bin/echo "You entered arguements: $1, $2, $3, and $4"

#Note that here $1 acts as a variable normally but when you enter enter some text after the ./filename.sh command it becomes an arguement

#cut -f1,2,3,.etc command cuts the specific characters of a string you can also add a delimiter like ' ' or ',' use cut -d' ' for example

#head -n amount_of_lines filename.sh gives only the amount of lines entered in a file from start

#tail -n amount_of_lines filename.sh gives only the amount of lines entered in a file from end 

#head -c amount_of_characters filename.sh gives only the amount of characters entered in a file from start

#tail -c amount_of_characters filename.sh gives only the amount of characters entered in a file from end 

#tr '()' '[]' command  transforms particular samples entered 
#| Task                     | Command    |
#| ------------------------ | ---------- |
#| Reverse order            | `sort -r`  |
#| Numeric sort             | `sort -n`  |
#| Remove duplicate lines   | `sort -u`  |
#| Ignore case              | `sort -f`  |
#| Sort by a specific field | `sort -k2` |
#To sort the lines of a file in lexicographical (dictionary/alphabetical) order, use the sort command also you can use a delimiter as well if you want.

#| Task                          | Command           |
#| ----------------------------- | ----------------- |
#| Remove consecutive duplicates | `uniq`            |
#| Count consecutive duplicates  | `uniq -c`         |
#| Print only duplicates         | `uniq -d`         |
#| Print only unique lines       | `uniq -u`         |
#| Ignore case                   | `uniq -i`         |
#| Count after sorting           | `sort \| uniq -c` |
#The uniq command in Bash is used to filter or report repeated adjacent lines.

#| Task                       | Command         |
#| -------------------------- | --------------- |
#| Fold every 2 lines         | `paste - -`     |
#| Fold every 3 lines         | `paste - - -`   |
#| Fold every 4 lines         | `paste - - - -` |
#| Join lines with commas     | `paste -sd ','` |
#| Join lines with semicolons | `paste -sd ';'` |
#The paste command in Bash is used to merge lines from one or more files horizontally. By default, it joins corresponding lines with a tab also you can use delimiter as well if you want.

#Example program on concatenation of an array
readarray -t arr
echo "${arr[@]}" "${arr[@]}" "${arr[@]}"

#Example code on Lonely Integer
read n
read -a arr
result=0
for num in "${arr[@]}"
do
    (( result ^= num ))
done
echo "$result"

#awk 'pattern { action }' file awk is one of the most powerful text-processing tools in Linux. It is designed to search, filter, transform, and report data, especially data organized into columns.
#| Task                          | Command                             |
#| ----------------------------- | ----------------------------------- |
#| Print first column            | `awk '{print $1}'`                  |
#| Print first and third columns | `awk '{print $1,$3}'`               |
#| Sum a column                  | `awk '{sum+=$2} END{print sum}'`    |
#| Average                       | `awk '{sum+=$2} END{print sum/NR}'` |
#| Print odd lines               | `awk 'NR%2'`                        |
#| Print even lines              | `awk 'NR%2==0'`                     |
#| Count lines                   | `awk 'END{print NR}'`               |
#| Print last column             | `awk '{print $NF}'`                 |
#| Filter by value               | `awk '$2>50'`                       |

#Example code demonstrating awk command
awk '{
    avg = ($2 + $3 + $4) / 3

    if (avg >= 80)
        print $0, ": A"
    else if (avg >= 60)
        print $0, ": B"
    else if (avg >= 50)
        print $0, ": C"
    else
        print $0, ": FAIL"
}'

#grep (Global Regular Expression Print) is one of the most commonly used Linux commands. It searches text for lines that match a pattern.
#| Option | Meaning                           |
#| ------ | --------------------------------- |
#| `-i`   | Ignore case                       |
#| `-v`   | Invert match (non-matching lines) |
#| `-c`   | Count matching lines              |
#| `-n`   | Show line numbers                 |
#| `-w`   | Match whole words                 |
#| `-x`   | Match the entire line exactly     |
#| `-o`   | Print only the matched part       |
#| `-E`   | Use extended regular expressions  |
#| `-r`   | Search recursively in directories |
#| `-l`   | Print only filenames with matches |

#sed (Stream Editor) is a command-line tool used to search, replace, insert, delete, and transform text. It processes input line by line, making it extremely useful for text manipulation in Bash.
#| Task                     | Command             |
#| ------------------------ | ------------------- |
#| Replace first occurrence | `sed 's/old/new/'`  |
#| Replace all occurrences  | `sed 's/old/new/g'` |
#| Delete line 3            | `sed '3d'`          |
#| Delete blank lines       | `sed '/^$/d'`       |
#| Print line 5             | `sed -n '5p'`       |
#| Print lines 2–4          | `sed -n '2,4p'`     |
#| Remove leading spaces    | `sed 's/^ *//'`     |
#| Remove trailing spaces   | `sed 's/ *$//'`     |
#| Replace digits           | `sed 's/[0-9]/X/g'` |

