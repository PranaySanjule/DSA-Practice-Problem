package com.Stack;

import java.util.Stack;

public class inBuiltStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(20);
        stack.push(21);
        stack.push(18);
        stack.push(19);
        stack.push(22);

        stack.pop();

        System.out.println(stack);
    }
}
