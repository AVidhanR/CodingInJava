/**
 * OOP Concept: Abstraction [Recap]
 */

// every class extends the Object class by default!
// wow!
class Student extends Object {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}


public class ExperimentsOnAbstraction {
  public static void main(String[] args) {
    Student s1 = new Student();

    s1.setName("AVidhanR");
    System.out.println(s1.getName());
  }
}