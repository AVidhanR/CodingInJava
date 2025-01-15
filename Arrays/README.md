## Array things
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
To find the length of an array,
```java
int[] arr = new int[] {10, 11, 12, 13};
int lengthOfArray = arr.length;
```
Well, if you want to return `int` values as an array of `int` for example; the below code is handy,
```java
return new int[] {1, 2, 3}; // or {a, b, c} if they have data init.
```