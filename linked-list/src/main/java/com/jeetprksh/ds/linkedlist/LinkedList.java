package com.jeetprksh.ds.linkedlist;

public class LinkedList<T> {

  private Node<T> head;

  public void append(T data) {
    if (head == null) {
      head = new Node<>(null, null, data);
    } else {
      Node<T> last = getLast();
      last.setNext(new Node<>(last, null, data));
    }
  }

  public void prepend(T data) {
    if (head == null) {
      head = new Node<>(null, null, data);
    } else {
      Node<T> temp = head;
      head = new Node<>(null, temp, data);
      temp.setPrevious(head);
    }
  }

  public void add(T data, int index) {

  }

  public void delete(T data) {
    if (head.getData().equals(data)) {
      Node<T> temp = head;
      head = head.getNext();
      head.setPrevious(null);
      temp.setNext(null);
    } else {
      Node<T> currentNode = head;
      while(currentNode.getNext() != null) {
        if (currentNode.getNext().getData().equals(data)) {
          currentNode.getNext().setPrevious(null);
          currentNode.setNext(currentNode.getNext().getNext());
          currentNode.setPrevious(currentNode);
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
