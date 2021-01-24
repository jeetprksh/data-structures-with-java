package com.jeetprksh.ds.queuewithstacks;

import java.util.*;
import java.util.logging.Logger;

public class QueueWithStacksImpl<T> implements QueueWithStacks<T> {

    private final Logger logger = Logger.getLogger(QueueWithStacksImpl.class.getName());

    private final Stack<T> newOnTop = new Stack<>();
    private final Stack<T> oldOnTop = new Stack<>();

    @Override
    public void enqueue(T o) {
        newOnTop.push(o);
    }

    @Override
    public Optional<T> dequeue() {
        reverseShiftStack();
        return Optional.of(oldOnTop.pop());
    }

    @Override
    public Optional<T> peek() {
        reverseShiftStack();
        return Optional.of(oldOnTop.peek());
    }

    @Override
    public List<T> getQueue() {
        List<T> newList = new ArrayList<>(newOnTop);
        List<T> oldList = new ArrayList<>(oldOnTop);
        Collections.reverse(oldList);
        oldList.addAll(newList);
        return oldList;
    }

    private void reverseShiftStack() {
        if (oldOnTop.isEmpty()) {
            while (!newOnTop.isEmpty()) {
                oldOnTop.push(newOnTop.pop());
            }
        }
    }
}
