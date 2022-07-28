package com.data;

public class Stack<T> {
    StackNode<T> top;
    static class StackNode<T> {
        T data;
        StackNode<T> next;

        StackNode(T data) {
            this.data = data;
            next = null;
        }
    }

    boolean isEmpty() {
        return top == null;
    }

    void push(T ss) {
        StackNode<T> s = new StackNode<T>(ss);
        s.next = top;
        top = s;
    }

    T pop() {
        if(top == null)
            return null;
        T d = top.data;
        top = top.next;
        return d;
    }

    T peek() {
        if(top == null)
            return null;
        return top.data;
    }
}
