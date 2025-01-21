## OOP Concepts
ENumerators in java are just like any other programming languages have!
```java
enum Status {
  Running, Pending, Failed; // tbh, they are simply Constants
}

// In main method
Status s = Status.Failed; // works just right!

// can get the array of the enum constants
Status ss[] = Status.values();
for (Status ele : s) {
System.out.println(ele + " : " + ele.ordinal());
}

// can compare too!
// can't extend the enum class
```
Using constructors in enum's

```java
enum Laptop {
  Macbook(2000), ThinkPad(1500);

  private int price;

  // specify default constructor if one don't want to use price
  // can have a constructor!
  private Laptop(int price) {
    this.price = price;
  }

  // can write user-defined functions too!
  public void setPrice(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }
}
```
