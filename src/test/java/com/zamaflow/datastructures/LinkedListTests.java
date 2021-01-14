package com.zamaflow.datastructures;

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

    @Test
    public void givenCyclickLinkedListShouldReturnIsCyclicTrue() {
        CyclickLinkedListDetector cyclickLinkedListDetector = new CyclickLinkedListDetector();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n1.next = n2;
        Node n3 = new Node(3);
        n2.next = n3;
        Node n4 = new Node(4);
        n3.next = n4;
        Node n5 = new Node(5);
        n4.next =n5;
        n5.next = n3;
        Node head = n1;
        assertEquals(cyclickLinkedListDetector.isCyclic(null), false);
        assertEquals(cyclickLinkedListDetector.isCyclic(head), true);

    }

    
    
}
