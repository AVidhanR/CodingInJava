package dev.itsvidhanreddy.OOP;

/**
 * OOP Concept: Abstraction [Recap]
 */

// every class extends the Object class by default!
// wow!
class Person extends Object {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

class Student extends Person {
  public void show() {
    System.out.println("This is Person");
  }
}



public class ExperimentsOnAbstraction {
  public static void main(String[] args) {
    Person p1 = new Person();

    p1.setName("AVidhanR");
    System.out.println(p1.getName());

    // implicitly has Person UpCasting
    // no need to mention
    Person p2 = new Student();
    // p2.show() can't use this!

    Student s1 = (Student) p2;
    // DownCasting
    s1.show();
  }
}