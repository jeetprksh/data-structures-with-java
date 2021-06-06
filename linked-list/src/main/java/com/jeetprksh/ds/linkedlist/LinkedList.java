package com.jeetprksh.ds.linkedlist;

public class LinkedList<T> {

  private Node<T> head;

  public void append(T data) {
    if (head == null) {
      head = new Node(null, null, data);
    } else {
      Node last = getLast();
      last.setNext(new Node(last, null, data));
    }
  }

  public void prepend(T data) {
    if (head == null) {
      head = new Node(null, null, data);
    } else {
      Node temp = head;
      head = new Node(null, temp, data);
      temp.setPrevious(head);
    }
  }

  public void add(T data, int index) {

  }

  public void delete(T data) {
    if (head.getData().equals(data)) {
      Node temp = head;
      head = head.getNext();
      head.setPrevious(null);
      temp.setNext(null);
    } else {
      Node currentNode = head;
      while(currentNode.getNext() != null) {
        if (currentNode.getNext().getData().equals(data)) {
          Node temp = currentNode;
          currentNode.getNext().setPrevious(null);
          currentNode.setNext(currentNode.getNext().getNext());
          currentNode.setPrevious(temp);
        }
        currentNode = currentNode.getNext();
      }
    }
  }

  public void printList() {
    Node currentNode = head;
    while (currentNode.getNext() != null) {
      System.out.print(currentNode.getData() + " ");
      currentNode = currentNode.getNext();
    }
    System.out.println(currentNode.getData());
  }

  private Node getLast() {
    Node currentNode = head;
    while (currentNode.getNext() != null) {
      currentNode = currentNode.getNext();
    }
    return currentNode;
  }

}
