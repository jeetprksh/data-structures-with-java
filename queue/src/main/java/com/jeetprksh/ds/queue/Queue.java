package com.jeetprksh.ds.queue;

import java.util.Optional;

@SuppressWarnings("unchecked")
public class Queue<T> {

  private Node head;
  private Node tail;

  public void enqueue(T o) {
    if (head == null && tail == null) {
      head = new Node(o, null);
      tail = head;
    } else {
      Node newNode = new Node(o, null);
      tail.setNext(newNode);
      tail = newNode;
    }
  }

  public Optional<T> dequeue() {
    if (head == null) {
      return Optional.empty();
    } else {
      T data = (T) head.getData();
      head = head.getNext();
      return Optional.of(data);
    }
  }

  public void printQueue() {
    if (!isEmpty()){
      Node node = head;
      while (node.getNext() != null) {
        System.out.print(node.getData() + " ");
        node = node.getNext();
      }
      System.out.print(node.getData() + " ");
    }
  }

  public boolean isEmpty() {
    return head == null;
  }

  public Optional<T> peek() {
    return isEmpty() ? Optional.empty() : Optional.of((T) head.getData());
  }
}
