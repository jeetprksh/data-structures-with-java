package com.jeetprksh.ds.linkedlist;

public interface CustomLinkedList<T> {

    public void append(T data);
    public void prepend(T data);
    public void add(T data, int index);
    public void delete(T data);
    public void printList();

}
