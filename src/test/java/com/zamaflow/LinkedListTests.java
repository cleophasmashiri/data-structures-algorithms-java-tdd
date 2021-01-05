package com.zamaflow;

import static org.junit.Assert.assertEquals;

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
    
}
