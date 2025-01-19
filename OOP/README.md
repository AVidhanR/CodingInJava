## OOP Concepts
ENumerators in java are just like any other programming languages!
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
```
