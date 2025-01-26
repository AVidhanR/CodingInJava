/**
 * Data Structures and Algorithms: Tree Data Structure implementation [NEW]
 */

package dev.itsvidhanreddy.DSA.Trees;

class Node {
  int data;
  Node left;
  Node right;

  public Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

public class BinarySearchTree {
  Node root;

  public void insert(int data) {
    root = recursiveInsert(root, data);
  }

  private Node recursiveInsert(Node current, int data) {

    if (current == null) {
      current = new Node(data);
    } else if (data < current.data) {
      current.left = recursiveInsert(current.left, data);
    } else if (data > root.data) {
      current.right = recursiveInsert(current.right, data);
    }

    return current;
  }

  public void inorderTraversal() {
    recursiveInorderTraversal(root);
  }

  private void recursiveInorderTraversal(Node current) {
    if (current != null) {
      recursiveInorderTraversal(current.left);
      System.out.print(current.data + " ");
      recursiveInorderTraversal(current.right);
    }
  }

  public void preorderTraversal() {
    recursivePreorderTraversal(root);
  }

  private void recursivePreorderTraversal(Node current) {
    if (current != null) {
      System.out.print(current.data + " ");
      recursivePreorderTraversal(current.left);
      recursivePreorderTraversal(current.right);
    }
  }

  public void postorderTraversal() {
    recursivePostorderTraversal(root);
  }

  private void recursivePostorderTraversal(Node current) {
    if (current != null) {
      recursivePostorderTraversal(current.left);
      recursivePostorderTraversal(current.right);
      System.out.print(current.data + " ");
    }
  }

  public static void main(String[] args) {
    BinarySearchTree binarySearchTree = new BinarySearchTree();
    binarySearchTree.insert(8);
    binarySearchTree.insert(7);
    binarySearchTree.insert(12);
    binarySearchTree.insert(15);
    binarySearchTree.insert(1);

    // inorder traversal: 1 7 8(root) 12 15
    binarySearchTree.inorderTraversal();
    System.out.println();

    // preorder traversal: 8(root) 7 1 12 15
    binarySearchTree.preorderTraversal();
    System.out.println();

    // postorder traversal: 1 7 15 12 8(root)
    binarySearchTree.postorderTraversal();
    System.out.println();
  }
}
