/**
 * Threads Concept: The OP Thing in java
 */

class Counter {
  int count;

  // synchronized keyword is used for below reason,
  // only one exec at a time
  // to avoid race around condition
  public synchronized void inc() {
    count++;
  }
}

public class ExperimentingThreads {
  public static void main(String[] args) {
    Counter c = new Counter();

    /** using lambda expressions; as Runnable interface is a {@FunctionalInterface} */
    Thread t1 = new Thread(() -> {
    for (int i = 1; i <= 1000; i++) {
        c.inc();
      }
    });
    t1.start();

    Thread t2 = new Thread(() -> {
    for (int i = 1; i <= 1000; i++) {
        c.inc();
      }
    });
    t2.start();

    try {

      // main method waits until the thread's completes
      // their assigned task.
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    System.out.println(c.count);
  }
}