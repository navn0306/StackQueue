package com.bridge.stackQueue;

public class Stack {

    private Node top;
    LinkedList l1 = new LinkedList();

    public void push() {
        l1.insert(70);
        l1.insert(30);
        l1.insert(56);
    }

    public void showElements(){
        l1.display();
    }

    public void peek(){
        l1.topElement();
    }

    public void pop(){
        System.out.println("After pop operation, the present elements are: ");
        l1.delete();
    }
}
