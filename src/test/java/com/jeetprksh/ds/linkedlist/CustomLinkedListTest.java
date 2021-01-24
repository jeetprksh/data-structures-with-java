package com.jeetprksh.ds.linkedlist;

import org.junit.jupiter.api.Test;

class CustomLinkedListTest {

  @Test
  public void test() {
    CustomLinkedList<Integer> list = new CustomLinkedListImpl<>();

    list.append(1);
    list.append(2);
    list.append(3);
    list.append(4);
    list.printList();
    list.prepend(5);
    list.prepend(6);
    list.printList();
    list.delete(1);
    list.printList();
    list.delete(6);
    list.printList();
  }

}