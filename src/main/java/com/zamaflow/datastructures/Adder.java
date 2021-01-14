package com.zamaflow.datastructures;

import java.util.Stack;

public class Adder {

    public Stack<Integer> sum(Stack<Integer> s1, Stack<Integer> s2) {        
        int sum = convertToNumber(s1) + convertToNumber(s2);
        return convertToStack(sum);
    }

    Stack<Integer> convertToStack(int n) {
        String s = String.valueOf(n);
        Stack<Integer> ss = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            ss.push(Integer.valueOf(s.substring(i, i+1)));
        }
        return ss;
    }

    int convertToNumber(Stack<Integer> s) {
        StringBuilder b = new StringBuilder();
        while (!s.empty()) {
            b.append(s.pop());
        }
        return Integer.parseInt(b.toString());
    }

}
