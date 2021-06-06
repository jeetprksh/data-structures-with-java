package com.jeetprksh.ds;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayTest {

  @Test
  public void testArray() {
    Array array = new Array(5);
    array.insert(3);
    array.insert(4);
    array.insert(2);
    array.print();
  }

  @Test
  public void arrayResizeTest() {
    Array array = new Array(3);
    array.insert(3);
    array.insert(4);
    array.insert(2);
    array.insert(10);
    array.insert(8);
    array.print();
  }

  @Test
  public void arrayRemoveTest() {
    Array array = new Array(3);
    array.insert(3);
    array.insert(4);
    array.insert(2);
    array.insert(10);
    array.insert(8);
    array.removeAt(2);
    array.print();
  }

  @Test
  public void arrayRemoveNegativeTest() {
    Array array = new Array(3);
    array.insert(3);
    array.insert(4);
    Assertions.assertThrows(IllegalArgumentException.class, () -> array.removeAt(10));
  }

  @Test
  public void arrayIndexOfTest() {
    Array array = new Array(3);
    array.insert(3);
    array.insert(4);
    array.insert(2);
    array.insert(10);
    array.insert(8);
    Assertions.assertEquals(array.indexOf(2), 2);
  }

}
