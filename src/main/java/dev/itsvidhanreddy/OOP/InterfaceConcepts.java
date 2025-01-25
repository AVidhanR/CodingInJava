package dev.itsvidhanreddy.OOP;

/**
 * OOP Concept: Interfaces [RECAP]
 */

interface AOne {
  int age = 12; // final and static - By Default
  void show(); // public and abstract - By Default
}

interface X {
  String xHandle = "itsvidhnareddy";
  void post();
}

interface Y extends X {} // possible! but need to,
// implement the methods available in X into the implemented class!

class B implements AOne {
  @Override
  public void show() {
    System.out.println("In show method");
  }
}

class C implements AOne, X {
  @Override
  public void show() {
    System.out.println("In Show of class C");
  }
  @Override
  public void post() {
    System.out.println("In post of class C");
  }
}

public class InterfaceConcepts {
  public static void main(String[] args) {
    AOne a = new B(); // or can use,
    // "B b = new B();"
    // both works fine.
    a.show();

    C c = new C(); // but can't use new B() or AOne() or X()
    c.post();
    c.show();
  }
}
