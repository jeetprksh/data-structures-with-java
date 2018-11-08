package com.jeetprksh.ds.stackandqueue;

import java.util.Optional;

@SuppressWarnings("unchecked")
public class CustomQueueImpl<T> implements CustomQueue<T> {

    private Node head;
    private Node tail;

    @Override
    public void enqueue(T o) {
        if (head == null && tail == null) {
            head = new Node(o, null);
            tail = head;
        } else {
            Node newNode = new Node(o, null);
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    @Override
    public Optional<T> dequeue() {
        if (head == null) {
            return Optional.empty();
        } else {
            T data = (T) head.getData();
            head = head.getNext();
            return Optional.of(data);
        }
    }

    @Override
    public void printQueue() {
        if (!isEmpty()){
            Node node = head;
            while (node.getNext() != null) {
                System.out.print(node.getData() + " ");
                node = node.getNext();
            }
            System.out.print(node.getData() + " ");
        }
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public Optional<T> peek() {
        return isEmpty() ? Optional.empty() : Optional.of((T) head.getData());
    }
}
