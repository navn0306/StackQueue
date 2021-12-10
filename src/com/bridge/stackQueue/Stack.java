package com.bridge.stackQueue;

public class Stack {

    private Node top;
    LinkedList l1 = new LinkedList();

    public void push() {
        l1.insertInStack(70);
        l1.insertInStack(30);
        l1.insertInStack(56);
    }

    public void showElements() {
        l1.displayStack();
    }

    public void peek() {
        l1.topElementOfStack();
    }

    public void pop() {
        System.out.println("After pop operation, the present elements are: ");
        l1.deleteFromStack();
    }
}
