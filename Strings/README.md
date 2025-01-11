checking whether the char `c` (which came from string `s`) is in the string `v` or not!,
```java
// s and v are string's 
for (char c : s.toCharArray()) {
    if (v.indexOf(c) != -1) {
        r += c;
    }
}
```