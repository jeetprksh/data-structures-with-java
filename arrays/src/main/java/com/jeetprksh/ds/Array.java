package com.jeetprksh.ds;

import java.util.logging.Logger;

/**
 * Class to implement the Array Data Structure
 */
public class Array {

  private final Logger logger = Logger.getLogger(Array.class.getName());

  private int[] items;
  private int count = 0;

  public Array(int length) {
    this.items = new int[length];
  }

  public void insert(int num) {
    logger.info("Insert number " + num);
    if (items.length == count) {
      logger.info("Resizing array");
      int[] newItems = new int [items.length * 2];
      for (int i = 0; i < items.length; i++) {
        newItems[i] = items[i];
      }
      items = newItems;
    }

    items[count] = num;
    count++;
  }

  public void removeAt(int index) {
    if (index < 0 || index >= count) {
      throw new IllegalArgumentException("Invalid index");
    }
    logger.info("Removing number at " + index);
    for (int i = index; i < (count - 1); i++) {
      items[i] = items[i + 1];
    }
    count--;
  }

  public int indexOf(int num) {
    logger.info("Getting index of number " + num);
    int index = -1;
    for (int i = 0; i < items.length; i++) {
      if (items[i] == num) {
        index = i;
        break;
      }
    }
    return index;
  }

  public void print() {
    for (int i = 0; i < count; i++) {
      System.out.print(items[i] + " ");
    }
  }

}
