package com.jeetprksh.ds.stack;

import org.junit.jupiter.api.Test;

class StackTest {

  @Test
  public void test() {
    Stack<Integer> customStack = new Stack<>();

    customStack.push(1);
    customStack.push(2);
    System.out.println("Is Empty " + customStack.isEmpty());
    System.out.println("Popped " + customStack.pop().get());
    System.out.println("Popped " + customStack.pop().get());
    System.out.println("Is Empty " + customStack.isEmpty());
  }

}