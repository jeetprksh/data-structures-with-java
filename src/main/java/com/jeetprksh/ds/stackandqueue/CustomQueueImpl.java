package com.jeetprksh.ds.stackandqueue;

import java.util.Optional;

@SuppressWarnings("unchecked")
public class CustomQueueImpl<T> implements CustomQueue<T> {

    private Node first;

    @Override
    public void enqueue(T o) {
        if (first == null) {
            first = new Node(o, null);
        } else {
            Node lastNode = getLast();
            Node newNode = new Node(o, null);
            lastNode.setNext(newNode);
        }
    }

    @Override
    public Optional<T> dequeue() {
        if (first == null) {
            return Optional.empty();
        } else {
            T data = (T) first.getData();
            first = first.getNext();
            return Optional.of(data);
        }
    }

    @Override
    public void printQueue() {
        if (!isEmpty()){
            Node node = first;
            while (node.getNext() != null) {
                System.out.print(node.getData() + " ");
                node = node.getNext();
            }
            System.out.print(node.getData() + " ");
        }
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public Optional<T> peek() {
        if (isEmpty()) {
            return Optional.empty();
        } else {
            T data = (T) first.getData();
            return  Optional.of(data);
        }
    }

    private Node getLast() {
        Node node = first;
        while (node.getNext() != null) {
            node = node.getNext();
        }
        return node;
    }
}
