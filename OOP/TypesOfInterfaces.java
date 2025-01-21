/**
 * OOP Concept: Types Of Interfaces [NEW]
 * Interfaces
 *  - Normal (2 or more methods)
 *  - Functional/SAM (single abstract method)
 *  - Marker (No methods or blank interface - for compiler purposes)
 */

// SAM (Single Abstract Method)
@FunctionalInterface
interface FInterface {
  void show();
}

class FInterfaceExample implements FInterface {

  @Override
  public void show() {
    System.out.println("In the show");
  }
}

public class TypesOfInterfaces {
  public static void main(String[] args) {
    FInterfaceExample fa1 = new FInterfaceExample();
    fa1.show();
  }
}