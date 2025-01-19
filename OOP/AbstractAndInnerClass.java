/**
 * OOP Concept: Abstract and Inner Classes
 */

abstract class A {
  public abstract void show();
  public abstract void config();
}

public class AbstractAndInnerClass {
  public static void main(String[] args) {
    A obj = new A() {
      public void show() {
        System.out.println("In Anonymous Class Implementation");
      }

      public void config() {
        System.out.println("In Config");
      }
    };

    obj.show();
    obj.config();
  }
}
