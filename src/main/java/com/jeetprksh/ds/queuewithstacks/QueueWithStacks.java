package com.jeetprksh.ds.queuewithstacks;

import java.util.List;
import java.util.Optional;

public interface QueueWithStacks<T> {

    public void enqueue(T t);
    public Optional<T> dequeue();
    public Optional<T> peek();
    public List<T> getQueue();

}
