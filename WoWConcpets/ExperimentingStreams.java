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
    List<Integer> l = Arrays.asList(10, 20, 30, 40, 50);
    l.forEach((n) -> {
      System.out.println(n);
    });


  }
}