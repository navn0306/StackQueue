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

    public void showElementsOfQueue() {
        l2.displayQueue();
    }

    public void deQueue() {
        System.out.println("After removing the front element the Queue is : ");
        l2.deleteFromQueue();
    }
}
