/**
 * Below are the new @features of java,
 *  - [var] type inference (New Keyword)
 *  - [sealed] classes (New Concept in OOP)
 *    - It's used to restrict the class that stands between [abstract] class and [final] class.
 *  -
 */

sealed class ClassOne permits ClassTwo, ClassThree {
  void show() {
    System.out.println("In Sealed ClassOne");
  }
}

// sealed or non-sealed or final needed to added for permitting classes
non-sealed class ClassTwo extends ClassOne {}
non-sealed class ClassThree extends ClassOne {}

public class NewFeaturesInJava {
  public static void main(String[] args) {
    // can't use var as a className here
    var a = 10;
    System.out.println("Printing the var declared value: " + a);


  }
}