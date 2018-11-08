package com.jeetprksh.ds.stackandqueue;

import java.util.Optional;

public class CustomStackImpl<T> implements CustomStack<T> {

    private Node top;


    @Override
    public void push(T data) {
        if (isEmpty()) {
            top = new Node(data, null);
        } else {
            Node newNode = new Node(data, top);
            top = newNode;
        }
    }

    @Override
    public Optional<T> pop() {
        if (!isEmpty()) {
            Node temp = top;
            top = top.getNext();
            temp.setNext(null);
            return Optional.of((T) temp.getData());
        } else {
            return Optional.empty();
        }
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public Optional<T> peek() {
        return (!isEmpty()) ? Optional.of((T) top.getData()) : Optional.empty();
    }

    @Override
    public void printStack() {
        if (!isEmpty()){
            Node node = top;
            while (node.getNext() != null) {
                System.out.print(node.getData() + " ");
                node = node.getNext();
            }
            System.out.print(node.getData() + " ");
        }
    }
}
