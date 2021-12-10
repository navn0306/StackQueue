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

    public void display() {
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

    public void topElement() {

        System.out.println("\nTop element of Stack is : " +top.data);

    }
}