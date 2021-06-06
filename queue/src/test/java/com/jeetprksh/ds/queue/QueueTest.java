package com.jeetprksh.ds.queue;

import org.junit.jupiter.api.Test;

class QueueTest {

  @Test
  public void test() {
    Queue<Integer> queue = new Queue<>();

    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);
    queue.printQueue();
    System.out.println();
    System.out.println("Dequeued " + queue.dequeue().get());
    System.out.println("Dequeued " + queue.dequeue().get());
    queue.printQueue();
    System.out.println();
    System.out.println("Is Empty " + queue.isEmpty());
    System.out.println("Dequeued " + queue.dequeue().get());
    System.out.println("Dequeued " + queue.dequeue().get());
    System.out.println("Dequeued " + queue.dequeue().get());
    queue.printQueue();
    System.out.println("Is Empty " + queue.isEmpty());
  }

}