package com.jeetprksh.ds.stackandqueue;

import java.util.Optional;

public interface CustomStack<T>{

    public void push(T o);
    public Optional<T> pop();
    public boolean isEmpty();
    public Optional<T> peek();
    public void printStack();

}
