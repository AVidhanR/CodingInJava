/**
 * Data Structures and Algorithms: Queue Data Structure implementation
 */

package dev.itsvidhanreddy.DSA;

public class Queue {
  private final int[] queue;
  private final int actualSize;
  int front;
  int rear;
  int queueSize;

  public Queue(int actualSize) {
    queue = new int[actualSize];

    // to make the accessing of queue elements simpler
    // with '%' operator
    this.actualSize = actualSize;
  }

  public void insert(int data) {

    // make sense not to use the isEmpty() method here
    if (!isFull()) {
      queue[rear] = data;
      rear = (rear + 1) % actualSize;
      queueSize++;
    } else {
      System.out.println("Queue is Full");
    }
  }

  public int delete() {
    int deletedElement = queue[front];

    // make sense not to use the isFull() method here
    if (!isEmpty()) {
      front = (front + 1) % actualSize;
      queueSize--;
    } else {
      System.out.println("Queue is Empty");
      return -1;
    }

    return deletedElement;
  }

  public boolean isEmpty() {
    return (queueSize == 0);
  }

  public boolean isFull() {
    return (queueSize == actualSize);
  }

  public int size() {
    return this.queueSize;
  }

  public void displayQueue() {
    for (int i = 0; i < queueSize; i++) {
      System.out.print(queue[(front + i) % actualSize] + " ");
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue(5);

    for (int i = 10; i <= 50; i += 10) {
      q.insert(i);
    }

    System.out.println("deleted: " + q.delete() + "\nsize: " + q.size());

    q.displayQueue();
  }
}