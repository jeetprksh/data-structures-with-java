package com.jeetprksh.ds.linkedlist;

import org.junit.jupiter.api.Test;

class LinkedListTest {

  @Test
  public void addLastTest() {
    LinkedList<Integer> list = new LinkedList<>();
    list.addLast(1);
    list.addLast(4);
    list.print();
  }

  @Test
  public void deleteTest() {
    LinkedList<Integer> list = new LinkedList<>();
    list.addLast(1);
    list.addLast(2);
    list.addLast(3);
    list.addLast(4);
    list.print();
    list.delete(3);
    list.print();
  }

  @Test
  public void addFirstTest() {
    LinkedList<Integer> list = new LinkedList<>();
    list.addLast(1);
    list.addFirst(5);
    list.print();
  }

  @Test
  public void addAtTest() {
    LinkedList<Integer> list = new LinkedList<>();
    list.addLast(1);
    list.addLast(5);
    list.addLast(6);
    list.addLast(2);
    list.addLast(7);
    list.print();
    list.addAt(8, 2);
    list.print();
  }

}
