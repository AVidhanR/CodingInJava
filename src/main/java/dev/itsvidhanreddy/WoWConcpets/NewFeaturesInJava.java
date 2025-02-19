package dev.itsvidhanreddy.WoWConcpets;

/**
 * Below are the new @features of java,
 *  - [var] type inference (New Keyword)
 *  - [sealed] classes (New Concept in OOP)
 *    - It's used to restrict the class that stands between [abstract] class and [final] class.
 *    - [permits] keyword is used to give the access of inheritance to the respective classes
 *    - The permitted class should either be one of the below,
 *      - [final] class
 *      - [sealed] class
 *      - [non-sealed] class
 *  - [record] classes
 *    - all the values in the [record] are final and private
 *    - used for storing the record like data
 */

// SEALED KEYWORD
sealed class ClassOne permits ClassTwo, ClassThree {
  void show() {
    System.out.println("In Sealed ClassOne");
  }
}

// sealed or non-sealed or final needed to added for permitting classes
// [ClassTwo] can be extended by anyone as it's [non-sealed]
non-sealed class ClassTwo extends ClassOne {}

// can be inherited by only [ClassFour] and no other class
sealed class ClassThree extends ClassOne permits ClassFour {}

// It should be one of any three above
final class ClassFour extends ClassThree {}

sealed interface interfaceOne permits interfaceTwo {}

// !remember interface can either be [sealed] or [non-sealed]
non-sealed interface interfaceTwo extends interfaceOne {}

// RECORD KEYWORD
record User(String name, int id) {
  // can create only the static variable here
  // normal variables should be mentioned in the above while declaring the record itself!
  static int a;

  public User {
    if (id == 0)
      try {
        throw new InterruptedException("Please enter an id which is greater than 0");
      } catch (InterruptedException e) {
        System.out.println(e.getMessage());
      }
  }
}

// MAIN METHOD
public class NewFeaturesInJava {
  public static void main(String[] args) {
    // can't use var as a className here
    var a = 10;
    System.out.println("Printing the var declared value: " + a);

    User u1 = new User("AVidhanR", 0);
    User u2 = new User("Vin", 1);
    System.out.println(u1);
    System.out.println(u2);

    // as there are no getters and setters in record
    // use the variable name and a `()` as below,
    System.out.println("name of user 1: " + u1.name());
  }
}