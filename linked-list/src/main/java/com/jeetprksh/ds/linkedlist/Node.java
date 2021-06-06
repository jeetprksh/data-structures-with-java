package com.jeetprksh.ds.linkedlist;

public class Node<T> {

  private Node<T> next;
  private T data;

  public Node(Node<T> next, T data) {
    this.next = next;
    this.data = data;
  }

  public Node<T> getNext() {
    return next;
  }

  public void setNext(Node<T> next) {
    this.next = next;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
