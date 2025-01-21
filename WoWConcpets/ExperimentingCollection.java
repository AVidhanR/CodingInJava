/**
 * Collection Concept: [NEW]
 */

import java.util.*;
// import java.util.Collection;


public class ExperimentingCollection {
  public static void main(String[] args) {

    List<Integer> numbs = new ArrayList<>();
    numbs.add(1);
    numbs.add(2);
    numbs.add(3);
    numbs.add(4);
    System.out.println(numbs + " index value at 2: " + numbs.get(1) + "\nIndex of value 2 is: " + numbs.indexOf(2));

    // can't sort it! so, use TreeSet<>()
    Set<Integer> uniqueNumbs = new HashSet<>();
    uniqueNumbs.add(10);
    uniqueNumbs.add(10);
    uniqueNumbs.add(20);
    uniqueNumbs.add(30);
    System.out.println("set is: " + uniqueNumbs);

    // sorted set!
    Set<Integer> sortedNumbs = new TreeSet<>();
    sortedNumbs.add(10);
    sortedNumbs.add(20);
    sortedNumbs.add(30);
    sortedNumbs.add(10);
    System.out.println(sortedNumbs);
    System.out.println();

    Iterator<Integer> values = numbs.iterator();
    while (values.hasNext()) {
      System.out.println(values.next());
    }
  }
}