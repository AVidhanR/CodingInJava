/**
 * Different useful things using [java.util.stream.Stream] Interface
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExperimentingStreams {
  public static void main(String[] args) {

    // forEach sure is handy...
    List<Integer> l = Arrays.asList(10, 21, 30, 41, 50);
    l.forEach((n) -> {
      if (n % 2 == 0) {
        System.out.println(n + " is even.");
      } else {
        System.out.println(n + " is odd.");
      }
    });

    // it's like a passing river water
    // only one time usage; cannot use it again
    // long format
    Stream<Integer> s1 = l.stream();
    Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
    s2.forEach(n -> System.out.println(n));

    int result = l.stream()
        .filter(n -> n % 2 == 0)
        .map(n -> n * 2)
        .reduce(0, (c, e) -> c + e);
    System.out.println(result);
  }
}