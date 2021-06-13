package com.jeetprksh.ds.linkedlist;

import org.junit.jupiter.api.Assertions;
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
  public void deleteSizeZeroTest() {
    LinkedList<Integer> list = new LinkedList<>();
    list.delete(3);
  }

  @Test
  public void deleteSizeOneTest() {
    LinkedList<Integer> list = new LinkedList<>();
    list.addLast(3);
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
    list.addAt(8, 1);
    list.print();
  }

  @Test
  public void indexOfTest() {
    LinkedList<Integer> list = new LinkedList<>();
    list.addLast(1);
    list.addLast(5);
    list.addLast(7);
    Assertions.assertEquals(0, list.indexOf(1));
  }

  @Test
  public void indexOfTestNegative() {
    LinkedList<Integer> list = new LinkedList<>();
    list.addLast(1);
    list.addLast(7);
    Assertions.assertEquals(-1, list.indexOf(2));
  }

  @Test
  public void containsTest() {
    LinkedList<Integer> list = new LinkedList<>();
    list.addLast(1);
    list.addLast(5);
    list.addLast(6);
    Assertions.assertTrue(list.contains(6));
  }

  @Test
  public void containsTestNegative() {
    LinkedList<Integer> list = new LinkedList<>();
    list.addLast(1);
    list.addLast(5);
    list.addLast(6);
    Assertions.assertFalse(list.contains(4));
  }

  @Test
  public void sizeTest() {
    LinkedList<Integer> list = new LinkedList<>();
    list.addLast(1);
    list.addLast(5);
    list.addLast(6);
    Assertions.assertEquals(3, list.size());
  }

  @Test
  public void sizeZeroTest() {
    LinkedList<Integer> list = new LinkedList<>();
    Assertions.assertEquals(0, list.size());
  }

  @Test
  public void removeFirstTest() {
    LinkedList<Integer> list = new LinkedList<>();
    list.addLast(1);
    list.addLast(5);
    list.addLast(6);
    list.addLast(2);
    list.addLast(3);
    list.print();
    list.removeFirst();
    list.print();
  }

  @Test
  public void removeFirstZeroSizeTestNegative() {
    LinkedList<Integer> list = new LinkedList<>();
    list.removeFirst();
  }

  @Test
  public void removeFirstTestNegative() {
    LinkedList<Integer> list = new LinkedList<>();
    list.addLast(1);
    list.print();
    list.removeFirst();
    list.print();
  }

  @Test
  public void removeLastTest() {
    LinkedList<Integer> list = new LinkedList<>();
    list.addLast(1);
    list.addLast(5);
    list.addLast(6);
    list.addLast(2);
    list.addLast(3);
    list.print();
    list.removeLast();
    list.print();
  }

  @Test
  public void removeLastZeroSizeTest() {
    LinkedList<Integer> list = new LinkedList<>();
    list.removeLast();
  }

  @Test
  public void removeLastTestNegative() {
    LinkedList<Integer> list = new LinkedList<>();
    list.addLast(1);
    list.print();
    list.removeLast();
    list.print();
  }

}
