## WoW Things
- Check the below code of creating a collection,
```java
List<Integer> list = new ArrayList<>();
// List is an interface and ArrayList is a class!
```
- `forEach() and stream api`
```java
import java.util.stream.Stream;
    // forEach sure is handy...
List<Integer> l = Arrays.asList(10, 21, 30, 41, 50);
    l.forEach((n) -> {
    if (n % 2 == 0) {
    System.out.println(n + " is even.");
      } else {
          System.out.println(n + " is odd.");
      }
          });
    
int result = l.stream()
    .filter(n -> n % 2 == 0)
    .map(n -> n * 2)
    .reduce(0, (c, e) -> c + e);
    System.out.println(result);
```