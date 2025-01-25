/**
 * Data Structures and Algorithms: Linked List Data Structure implementation
 */

package dev.itsvidhanreddy.DSA;

class Node {
  int data;
  Node next;

  // best practice
  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class LinkedList {
  Node head;

  public void insert(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
    } else {
      Node tempNode = head;
      while (tempNode.next != null) {
        tempNode = tempNode.next;
      }
      tempNode.next = newNode;
    }

  }

  public void insertAtStart(int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
  }

  public void insertAt(int index, int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
    } else {
      Node tempNode = head;
      // traversal to index-1 position.
      // imagine it!
      for (int i = 0; i < index - 1; i++) {
        tempNode = tempNode.next;
      }
      newNode.next = tempNode.next;
      tempNode.next = newNode;
    }

  }

  public void displayLinkedList() {
    Node node = head;

    while (node.next != null) {
      System.out.println(node.data);
      node = node.next;
    }
    System.out.println(node.data);

  }

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();

     for (int i = 10; i <= 20; i++) {
       linkedList.insert(i);
     }

     linkedList.insertAtStart(25);

     linkedList.insertAt(1, 100);

     linkedList.displayLinkedList();
  }
}