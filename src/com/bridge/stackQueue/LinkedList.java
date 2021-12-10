package com.bridge.stackQueue;

public class LinkedList {
    Node top;

    public void insert(int data) {
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

    public void addInQueue(int data) {
        Node node = new Node(data);
        if (top == null) {
            top = node;
        } else {
            Node current = top;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
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

    public void displayQueue() {
        Node current = top;
        if (current == null) {
            System.out.println("Stack is Empty");
        }

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

    }

    public void delete() {

        if (top == null) {
            System.out.println("Stack is empty!");
        } else {
            top = top.next;
        }
    }

    public void topElementOfStack() {
        System.out.println("\nTop element of Stack is : " + top.data);
    }

    public void frontElementOfQueue() {
        System.out.println("\nFront element of Queue is : " + top.data);
    }
}