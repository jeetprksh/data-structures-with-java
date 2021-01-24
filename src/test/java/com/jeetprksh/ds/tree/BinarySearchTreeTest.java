package com.jeetprksh.ds.tree;

import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {

  @Test
  public void test() {
    BinarySearchTree bst = new BinarySearchTree(1);
    Node root = bst.getRoot();
    bst.insert(root, new Node(2));
    bst.insert(root, new Node(3));
    bst.insert(root, new Node(4));
    bst.insert(root, new Node(5));

    bst.traverseInOrder(root);
    System.out.println();
    bst.traversePostOrder(root);
    System.out.println();
    bst.traversePreOrder(root);
  }

}