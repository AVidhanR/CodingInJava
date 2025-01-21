/**
 * Threads Concept: The OP Thing in java
 */

class ThreadOne implements Runnable {
  @Override
  public void run() {
    for (int i = 1; i <= 100; i++) {
      System.out.println(i + "th Hi");
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) { e.printStackTrace(); }
    }
  }
}

class ThreadTwo implements Runnable {
  @Override
  public void run() {
    for (int i = 1; i <= 100; i++) {
      System.out.println(i + "th Hello");
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) { e.printStackTrace(); }
    }
  }
}

public class ExperimentingThreads {
  public static void main(String[] args) {
    Runnable r1 = new ThreadOne();
    Runnable r2 = new ThreadTwo();

    new Thread(r1).start();
    new Thread(r2).start();
  }
}