import java.util.*;

class Students implements Comparable<Students> {
  int age;
  String name;

  public Students(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public int compareTo(Students o1) {
    if (this.age > o1.age)
      return 1;
    else
      return 0;
  }

  @Override
  public String toString() {
    return "Students{" +
        "age=" + age +
        ", name='" + name + '\'' +
        '}';
  }
}

public class TheComparator {
  public static void main(String[] args) {
    Comparator<Students> comp = (o1, o2) -> (o1.age > o2.age) ? 1 : 0;

    List<Students> studs = new ArrayList<>();
    studs.add(new Students(21, "AVidhanR"));
    studs.add(new Students(22, "AVin"));
    studs.add(new Students(19, "AVReddy"));
    Collections.sort(studs);
    System.out.println(studs);
    // or
    Collections.sort(studs, comp);
    System.out.println(studs);
  }
}