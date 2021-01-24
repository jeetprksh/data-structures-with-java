package com.jeetprksh.ds.stackandqueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomStackTest {

  @Test
  public void test() {
    CustomStack<Integer> customStack = new CustomStackImpl<>();

    customStack.push(1);
    customStack.push(2);
    System.out.println("Is Empty " + customStack.isEmpty());
    System.out.println("Popped " + customStack.pop().get());
    System.out.println("Popped " + customStack.pop().get());
    System.out.println("Is Empty " + customStack.isEmpty());
  }

}