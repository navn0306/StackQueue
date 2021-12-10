package com.bridge.stackQueue;

import java.util.Scanner;

public class Operations {

    public static void main(String[] args) {
        Stack stack = new Stack();
        Queue queue = new Queue();

        System.out.println("For Stack operations enter 1\n" + "For Queue operations press 2");
        Scanner c = new Scanner(System.in);
        int ch = c.nextInt();
        switch (ch) {
            case 1:
                stack.push();
                stack.showElements();
                stack.peek();
                stack.pop();
                stack.showElements();
                stack.peek();
                stack.pop();
                stack.showElements();
                stack.peek();
                stack.pop();
                stack.showElements();
                break;

            case 2:
                queue.enQueue();
                queue.showElementsOfQueue();
                queue.peek();
                queue.deQueue();
                queue.showElementsOfQueue();
                queue.peek();
                queue.deQueue();
                queue.showElementsOfQueue();
                queue.peek();
                queue.deQueue();
                queue.showElementsOfQueue();
                break;

            default:
        }
    }
}
