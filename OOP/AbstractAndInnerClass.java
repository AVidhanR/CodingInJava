/**
 * OOP Concept: Abstract and Inner Classes
 */

abstract class A {
  public abstract void show();
}

public class AbstractAndInnerClass {
  public static void main(String[] args) {
    A obj = new A() {
      public void show() {
        System.out.println("In Anonymous Class Implementation");
      }
    };

    obj.show();
  }
}
