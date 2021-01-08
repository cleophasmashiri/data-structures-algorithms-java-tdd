package com.zamaflow;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.Test;

public class LinkedListTests {

    @Test
    public void givenLinkedListShouldRemoveDuplicates() {
        LinkedList ll = new LinkedList();
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(2);

        ll.removeDuplicates();

        assertEquals(ll.size(), 3);
    }

    @Test
    public void givenStackMustReturnIntEquivalence() {
        Adder adder = new Adder();
        Stack<Integer> s1 = new Stack<>();
        s1.push(8);
        s1.push(2);
        s1.push(5);
        assertEquals(adder.convertToNumber(s1), 528);
    }

    @Test
    public void givenIntMustReturnStackEquivalence() {
        Adder adder = new Adder();
        int n = 528;
        Stack<Integer> s  = adder.convertToStack(n);
        assertEquals(s.pop(), Integer.valueOf(8));
        assertEquals(s.pop(), Integer.valueOf(2));
        assertEquals(s.pop(), Integer.valueOf(5));
    }

    @Test
    public void givenTwoNumberAsLinkedListShouldComputeSum() {
        Adder adder = new Adder();
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> sum = new Stack<>();
        s1.push(8);
        s1.push(2);
        s1.push(5);

        s2.push(8);
        s2.push(2);
        s2.push(2);

        sum.push(7);
        sum.push(5);
        sum.push(6);

        // sum = 528 + 228 = 756

        assertEquals(adder.sum(s1, s2), sum);
    }
    
}
