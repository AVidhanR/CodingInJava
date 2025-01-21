/**
 * Threads Concept: The OP Thing in java
 */

public class ExperimentingThreads {
  public static void main(String[] args) {

    /** using lambda expressions; as Runnable interface is a {@FunctionalInterface} */
    new Thread(() -> {
    for (int i = 1; i <= 100; i++) {
        System.out.println(i + "th Hello");
        try {
          Thread.sleep(10);
        } catch (InterruptedException e) { e.printStackTrace(); }
      }
    }).start();

    new Thread(() -> {
    for (int i = 1; i <= 100; i++) {
        System.out.println(i + "th Hello");
        try {
          Thread.sleep(10);
        } catch (InterruptedException e) { e.printStackTrace(); }
      }
    }).start();
  }
}