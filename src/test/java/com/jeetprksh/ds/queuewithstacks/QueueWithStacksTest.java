package com.jeetprksh.ds.queuewithstacks;

import org.junit.jupiter.api.Test;

class QueueWithStacksTest {

  @Test
  public void test() {
    QueueWithStacks<Integer> queueWithStacks = new QueueWithStacksImpl<>();

    queueWithStacks.enqueue(1);
    queueWithStacks.enqueue(2);
    queueWithStacks.enqueue(3);
    queueWithStacks.enqueue(4);
    queueWithStacks.enqueue(5);

    queueWithStacks.getQueue().forEach((obj) -> System.out.print(obj + " "));
    System.out.println();

    System.out.println("Dequeued " + queueWithStacks.dequeue().get());
    queueWithStacks.getQueue().forEach((obj) -> System.out.print(obj + " "));
    System.out.println();

    queueWithStacks.enqueue(6);
    queueWithStacks.enqueue(7);
    queueWithStacks.getQueue().forEach((obj) -> System.out.print(obj + " "));
    System.out.println();
    System.out.println("Peek " + queueWithStacks.peek().get());

    System.out.println("Dequeued " + queueWithStacks.dequeue().get());
    queueWithStacks.getQueue().forEach((obj) -> System.out.print(obj + " "));
  }

}