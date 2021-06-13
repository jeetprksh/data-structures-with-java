package com.jeetprksh.ds.linkedlist;

import java.util.Objects;

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
    if (head == null) {
      return;
    }

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
    while (currentNode != null) {
      System.out.print(currentNode.getData() + " ");
      currentNode = currentNode.getNext();
    }
    System.out.println();
  }

  public int indexOf(T data) {
    Node<T> currentNode = head;
    int index = 0;
    while (currentNode != null) {
      if (currentNode.getData().equals(data)) {
        return index;
      }
      index++;
      currentNode = currentNode.getNext();
    }
    return -1;
  }

  public boolean contains(T data) {
    return indexOf(data) > -1;
  }

  public void removeFirst() {
    if (!Objects.isNull(head)) {
      Node<T> temp = head;
      head = head.getNext();
      temp.setNext(null);
    }
  }

  public void removeLast() {
    if (head == null) {
      return;
    }

    if (head.getNext() == null) {
      head = null;
      return;
    }

    Node<T> secondLastNode = head;
    Node<T> lastNode = head.getNext();
    while (lastNode.getNext() != null) {
      lastNode = lastNode.getNext();
      secondLastNode = secondLastNode.getNext();
    }
    secondLastNode.setNext(null);
  }

  public int size() {
    Node<T> currentNode = head;
    int size = 0;
    while (currentNode != null) {
      size++;
      currentNode = currentNode.getNext();
    }
    return size;
  }

  private Node<T> getLast() {
    Node<T> currentNode = head;
    while (currentNode.getNext() != null) {
      currentNode = currentNode.getNext();
    }
    return currentNode;
  }

}
