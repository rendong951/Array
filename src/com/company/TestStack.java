package com.company;

public class TestStack {

    public static void main(String[] args) {
        Stack stack = new ArrayStack();

        stack.push(1);
        stack.pop();

        System.out.println(stack);
    }
}
