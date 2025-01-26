# Java In Practice
Finally, I can put my time into learning `Java` for real.

- Access the root of the codebase from [`here`](src/main/java/dev/itsvidhanreddy/) 
- Learning the basic program problems from [`gfg/basic-programming-problems`](https://www.geeksforgeeks.org/basic-programming-problems/) 
- Feel free to visit my portfolio from [`itvidhanreddy.vercel.app`](https://itsvidhanreddy.vercel.app) 
- Follow me on LinkedIn: [`in/AVidhanR`](https://linkedin.com/in/AVidhanR) 

# The Below codes, sure are handy
```java
// if return type is List<Integer>
return Arrays.asList(a, b);
```

I'm lazy, so I did this
```java
import java.util.Arrays;
// gives the sum!
int s = Arrays.stream(array).sum();
```

In 2D matrix, the below code is handy
```java
// for traversing and other element level operations
for (int[] rows : matrix) {
    for (int ele : rows) {
        sum += ele;
    }
}
```

While using String's as char's the below code is handy,
```java
for (char c : v.toCharArray()) {
    // something here...    
}
```
## Find lengths
To find the length of an array,
```java
int[] arr = new int[] {10, 11, 12, 13};
int lengthOfArray = arr.length;
```

To find the length of a number,
```java
int n = 1234;
int l = String.valueOf(n).length(); // 4
```

## Typical `git-cli`
```bash
git add . && git commit -m "" && git push
```

Fetch the latest changes from the remote repository,
```bash
git fetch origin
git pull origin main
```

Check the below code,
```java
// I ain't understood a thing in the below code
for (int t = n; t > 0; t /= 2) {
    b = (t % 2) + b;
}

// so I used the below abstract method
return Integer.toBinaryString(num);
```

Well, if you want to return `int` values as an array of `int`: the below code is handy,
```java
return new int[] {1, 2, 3}; // or {a, b, c} if they have data in it.
```

## The `find` command
- The find command in Bash is a powerful tool for searching and locating files and directories based on various conditions. Here's a comprehensive overview:
Basic Syntax,
```bash
find [options] [path] [expression]
```
### Options
- -name: Search by file name
- -iname: Search by file name (case-insensitive)
- -type: Search by file type (e.g., f for files, d for directories)
- -size: Search by file size
- -mtime: Search by modification time
- -atime: Search by access time
- -ctime: Search by creation time
- -exec: Execute a command on the found files
- -ok: Similar to -exec, but prompts for confirmation before executing
### Expressions
- -a: Logical AND operator
- -o: Logical OR operator
- !: Logical NOT operator
### Examples
- Find files by name: find . -name "example.txt"
- Find files by type: find . -type f -name "*.txt"
- Find files larger than 1MB: find . -size +1M
- Find files modified within the last 24 hours: find . -mtime -1
- Delete files older than 30 days: find . -type f -mtime +30 -delete
- Execute a command on found files: find . -type f -name "*.txt" -exec cat {} \;
### Tips and Tricks
- Use . to search in the current directory and its subdirectories.
- Use ~ to search in the user's home directory.
- Use ! to negate a condition (e.g., ! -name "*.txt").
- Use parentheses to group conditions (e.g., ( -name "*.txt" -o -name "*.pdf" )).
- Use -print to print the found files (default behavior).
- Use -exec with {} \; to execute a command on each found file.

## `bash` is a lifesaver 
 Bash Script is a lifesaver for lazy people like myself,
 ```bash
 bash ./StartUpProcess.sh
 # removes all the existing .class files and fetches the data from github on latest changes
 ```
