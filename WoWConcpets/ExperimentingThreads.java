/**
 * Threads Concept: The OP Thing in java
 */

class ThreadOne extends Thread {
  @Override
  public void run() {
    for (int i = 1; i <= 100; i++) {
      System.out.println(i + "th Hi");
    }
  }
}

class ThreadTwo extends Thread {
  @Override
  public void run() {
    for (int i = 1; i <= 100; i++) {
      System.out.println(i + "th Hello");
    }
  }
}

public class ExperimentingThreads {
  public static void main(String[] args) {
    new ThreadOne().start();
    new ThreadTwo().start();
  }
}