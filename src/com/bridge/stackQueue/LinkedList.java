package com.bridge.stackQueue;

public class LinkedList {
    Node top;
    Node front;


    //All the required methods for STACK

    public void insertInStack(int data) {
        Node node = new Node(data);
        node.data = data;
        node.next = null;
        if (top == null) {
            top = node;
        } else {
            node.next = top;
            top = node;
        }
    }

    public void displayStack() {
        Node current = top;
        if (current == null) {
            System.out.println("Stack is Empty");
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }


    public void deleteFromStack() {

        if (top == null) {
            System.out.println("Stack is empty!");
        } else {
            top = top.next;
        }
    }

    public void topElementOfStack() {
        System.out.println("\nTop element of Stack is : " + top.data);
    }


    //All the required methods for STACK

    public void addInQueue(int data) {
        Node node = new Node(data);
        if (front == null) {
            front = node;
        } else {
            Node current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public void displayQueue() {
        Node current = front;
        if (current == null) {
            System.out.println("Queue is Empty");
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void frontElementOfQueue() {
        System.out.println("\nFront element of Queue is : " + front.data);
    }

    public void deleteFromQueue() {
        if (front != null) {
            front = front.next;
        } else {
            System.out.println("Node is Empty");
        }
    }

}