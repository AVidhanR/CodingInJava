/**
 * Data Structures and Algorithms: Stack Data Structure implementation
 */

package dev.itsvidhanreddy.DSA;

public class Stack {

  private final int[] stack;
  int top = 0;

  public Stack(int size) {
    this.stack = new int[size];
  }

  // insert an element
  public void push(int data) {
    if (top == stack.length) {
      System.out.println("Stack is full - can't push elements");
    } else {
      stack[top++] = data;
    }
  }

  // delete an element
  public int pop() {
    int deletedElement = 0;

    if (isEmpty()) {
      System.out.println("Stack is empty - can't pop elements");
      return -1;
    } else {
      deletedElement = stack[--top];
      stack[top] = 0;
    }

    return deletedElement;
  }

  // see the latest data at the top of stack
  public int peek() {
    if (isEmpty()) {
      System.out.println("Stack is empty - can't peek");
      return -1;
    }
    return stack[top - 1];
  }

  public int size() {
    return top;
  }

  public boolean isEmpty() {
    return (top <= 0);
  }

  public void displayStack() {
    for (int ele : stack) {
      System.out.print(ele + " ");
    }
  }

  public static void main(String[] args) {
    Stack st = new Stack(5);

    for (int i = 10; i <= 50; i += 10) {
      st.push(i);
    }

    System.out.println("popped: " + st.pop() + "\npeek: " + st.peek() + "\nsize: " + st.size() + "\nis empty: " + st.isEmpty());
    st.push(100);

    st.displayStack();
  }
}