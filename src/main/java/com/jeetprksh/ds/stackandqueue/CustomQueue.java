package com.jeetprksh.ds.stackandqueue;

import java.util.Optional;

public interface CustomQueue<T> {

    public void enqueue(T o);
    public Optional<T> dequeue();
    public void printQueue();
    public boolean isEmpty();
    public Optional<T> peek();

}
