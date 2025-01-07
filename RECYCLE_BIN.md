Nice code to print a diamond
```java
public class DiamondPrinter {
    public static void printDiamond(int n) {
        // Print the upper half of the diamond
        for (int i = 0; i < n; i++) {
            // Print spaces before stars
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Print the lower half of the diamond
        for (int i = n - 2; i >= 0; i--) {
            // Print spaces before stars
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printDiamond(8);
        return;
    }
}
```
I'm so dumb (T_T)
```java
// palindrome - (init) r = 0
for (; a != 0; a /= 10) {
    r = (r * 10) + (a % 10);
}
```