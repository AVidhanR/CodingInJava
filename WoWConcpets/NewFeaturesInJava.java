import java.util.Objects;

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
class User {
  private final String name;
  private final int id;

  User(String name, int id) {
    this.name = name;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "User { " +
        "name = '" + name + '\'' +
        ", id = " + id +
        " }";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return id == user.id && Objects.equals(name, user.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id);
  }
}

// MAIN METHOD
public class NewFeaturesInJava {
  public static void main(String[] args) {
    // can't use var as a className here
    var a = 10;
    System.out.println("Printing the var declared value: " + a);

    User u1 = new User("AVidhanR", 1);
    System.out.println(u1);
  }
}