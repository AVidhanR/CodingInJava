Nothing much here, Just basic Java Coding that I'm wanting to learn from years!

Learning the basic program problems from [here](https://www.geeksforgeeks.org/basic-programming-problems/) \
Feel free to visit my portfolio from [here](https://itsvidhanreddy.vercel.app) \
Follow me on LinkedIn: [in/AVidhanR](https://linkedin.com/in/AVidhanR) 

---

The Below codes, sure are handy
```java
// if return type is List<Integer>
return Arrays.asList(a, b);
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

---

Typical `git-cli` things,
```bash
git add . && git commit -m "" && git push origin main
```
```bash
# Fetch the latest changes from the remote repository
git fetch origin
git pull origin main
```

---

The below code **check**
```java
// I ain't understood a thing the below code
for (int t = n; t > 0; t /= 2) {
    b = (t % 2) + b;
}

// so I used the below abstract method
return Integer.toBinaryString(num);
```
