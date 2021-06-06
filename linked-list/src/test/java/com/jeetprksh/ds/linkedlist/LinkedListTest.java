package com.jeetprksh.ds.linkedlist;

import org.junit.jupiter.api.Test;

class LinkedListTest {

  @Test
  public void test() {
    LinkedList<Integer> list = new LinkedList<>();

    list.append(1);
    list.append(2);
    list.append(3);
    list.append(4);
    list.print();
    list.prepend(5);
    list.prepend(6);
    list.print();
    list.delete(1);
    list.print();
    list.delete(6);
    list.print();
  }

}