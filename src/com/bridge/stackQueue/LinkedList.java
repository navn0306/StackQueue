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
            top=node;
        }
    }

    public void display() {
        Node current = top;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
