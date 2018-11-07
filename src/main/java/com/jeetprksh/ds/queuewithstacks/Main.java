package com.jeetprksh.ds.queuewithstacks;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String args[]) {
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
