package com.jeetprksh.ds.linkedlist;

public class LinkedList<T> {

  private Node<T> head;

  public void addLast(T data) {
    if (head == null) {
      head = new Node<>(null, data);
    } else {
      Node<T> last = getLast();
      last.setNext(new Node<>(null, data));
    }
  }

  public void addFirst(T data) {
    if (head == null) {
      head = new Node<>(null, data);
    } else {
      Node<T> temp = head;
      head = new Node<>(temp, data);
    }
  }

  public void addAt(T data, int index) {
    Node<T> currentNode = head;
    for (int i = 0; i < index - 1; i++) {
      currentNode = currentNode.getNext();
    }
    Node<T> node = new Node<>(currentNode.getNext(), data);
    currentNode.setNext(node);
  }

  public void delete(T data) {
    if (head.getData().equals(data)) {
      Node<T> temp = head;
      head = head.getNext();
      temp.setNext(null);
    } else {
      Node<T> currentNode = head;
      while(currentNode.getNext() != null) {
        if (currentNode.getNext().getData().equals(data)) {
          currentNode.setNext(currentNode.getNext().getNext());
        }
        currentNode = currentNode.getNext();
      }
    }
  }

  public void print() {
    Node<T> currentNode = head;
    while (currentNode.getNext() != null) {
      System.out.print(currentNode.getData() + " ");
      currentNode = currentNode.getNext();
    }
    System.out.println(currentNode.getData());
  }

  private Node<T> getLast() {
    Node<T> currentNode = head;
    while (currentNode.getNext() != null) {
      currentNode = currentNode.getNext();
    }
    return currentNode;
  }

}
