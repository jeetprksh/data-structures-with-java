package com.jeetprksh.ds.tree;

public class BinarySearchTree {

    private Node treeRoot;

    // initialized atleast with one node
    public BinarySearchTree(int data) {
        this.treeRoot = new Node(null, null, data);
    }

    public Node getRoot() {
        return treeRoot;
    }

    public void insert(Node root, Node node) {
        if (root == null) {
            root = node;
            return;
        }

        if (node.getData() < root.getData()) {
            if (root.getLeft() == null)
                root.setLeft(node);
            else
                insert(root.getLeft(), node);
        } else {
            if (root.getRight() == null)
                root.setRight(node);
            else
                insert(root.getRight(), node);
        }
    }

    public void traverseInOrder(Node node) {
        if (node.getLeft() != null) traverseInOrder(node.getLeft());
        System.out.print(node.getData() + " ");
        if (node.getRight() != null) traverseInOrder(node.getRight());
    }

    public void traversePreOrder(Node node) {
        System.out.print(node.getData() + " ");
        if (node.getLeft() != null) traversePreOrder(node.getLeft());
        if (node.getRight() != null) traversePreOrder(node.getRight());
    }

    public void traversePostOrder(Node node) {
        if (node.getLeft() != null) traversePostOrder(node.getLeft());
        if (node.getRight() != null) traversePostOrder(node.getRight());
        System.out.print(node.getData() + " ");
    }

    public boolean contains(Node root, int data) {
        if (root.getData() == data) return true;

        if (data < root.getData()) {
            if (root.getLeft() == null)
                return false;
            else
                return contains(root.getLeft(), data);
        } else {
            if (root.getRight() == null)
                return false;
            else
                return contains(root.getRight(), data);
        }
    }

    public boolean isValid(Node node, int min, int max) {
        if (node == null) return true;
        if (node.getData() > min || node .getData() < max) return false;
        return isValid(node.getLeft(), min, node.getData()) && isValid(node.getRight(), node.getData(), max);
    }

}
