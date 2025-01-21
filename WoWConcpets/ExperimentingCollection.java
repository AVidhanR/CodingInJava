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
    System.out.println();

    // it's a key value pairs with different use cases
    // keys are unique but values can be!
    Map<String, Integer> students = new HashMap<>();
    students.put("Vidhan", 501);
    students.put("Vin", 500);
    for (String k : students.keySet()) {
      System.out.println(k + " : " + students.get(k));
    }
    System.out.println(students);
    // one can also use HashTable<>() rather than HashMap<>()
    // diff: HashTable is synchronized and other is not.

    // to sort or experiment a collection of any type
    Collections.sort(numbs); // simple sorting

    Comparator<String> com = new Comparator<String>() {
      public int compare(String o1, String o2) {
        if (o1.length() > o2.length())
          return 1;
        else
          return -1;
      }
    };

    List<String> names = new ArrayList<>();
    names.add("Vidhan");
    names.add("Vin");
    names.add("AVidhanR");
    names.add("Reddy");

    // use your custom logic to sort with the help of Comparator Interface
    Collections.sort(names, com);
    System.out.println(names);
  }
}