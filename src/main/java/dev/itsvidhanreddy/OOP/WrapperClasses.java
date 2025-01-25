package dev.itsvidhanreddy.OOP;

/**
 * OOP Concept: Wrapper Classes [RECAP]
 */

public class WrapperClasses {
  public static void main(String[] args) {
    // integer class
    int numb = 1; // primitive type
    Integer numbObj = numb; // AutoBoxing!
    int numb2 = numbObj; // AutoUnBoxing!
    System.out.println(numb2);

    // string to int using parseInt() and it's cool
    String s1 = "123";
    int numb3 = Integer.parseInt(s1);
    System.out.println(numb3);

  }
}