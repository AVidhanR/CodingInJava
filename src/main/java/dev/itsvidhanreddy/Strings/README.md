checking whether the char `c` (which came from string `s`) is in the string `v` or not!,
```java
// s and v are string's 
for (char c : s.toCharArray()) {
    if (v.indexOf(c) != -1) {
        r += c;
    }
}
```
replaceAll? it's nice...(using regex)
```java
String s = "HelloAll";
return s.replaceAll("[aeiouAEIOU]", "");
```
taking character input's
```java
char c = scanner.next().charAt(0);
```
to check the type of char's
```java
Character.isUpperCase(c) // returns true if matched
Character.isLowerCase(c) // similarly below, well it makes sense
Character.isDigit(n)
```