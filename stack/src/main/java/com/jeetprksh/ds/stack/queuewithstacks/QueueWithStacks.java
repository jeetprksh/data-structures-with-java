package com.jeetprksh.ds.stack.queuewithstacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Stack;
import java.util.logging.Logger;

public class QueueWithStacks<T> {

  private final Logger logger = Logger.getLogger(QueueWithStacks.class.getName());

  private final Stack<T> newOnTop = new Stack<>();
  private final Stack<T> oldOnTop = new Stack<>();

  public void enqueue(T o) {
    newOnTop.push(o);
  }

  public Optional<T> dequeue() {
    reverseShiftStack();
    return Optional.of(oldOnTop.pop());
  }

  public Optional<T> peek() {
    reverseShiftStack();
    return Optional.of(oldOnTop.peek());
  }

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
