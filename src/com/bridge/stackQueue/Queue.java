package com.bridge.stackQueue;

public class Queue {

    LinkedList l2 = new LinkedList();

    public void enQueue() {
        l2.addInQueue(56);
        l2.addInQueue(30);
        l2.addInQueue(70);

    }

    public void peek() {
        l2.frontElementOfQueue();
    }

    public void showData() {
        l2.displayQueue();
    }
}
