package com.zamaflow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BinaryTreeTests {

    @Test
    public void givenBinaryTreeT1AndT2ShouldRetunIsSubtreeTrue() {
        BinarySearchTree t1 = new BinarySearchTree();
        // 5,3,2,4,7,6,8
        t1.insert(5);
        t1.insert(3);
        t1.insert(2);
        t1.insert(4);
        t1.insert(7);
        t1.insert(6);
        t1.insert(8);

        // 7, 6, 8
        BinarySearchTree t2 = new BinarySearchTree();
        t2.insert(7);
        t2.insert(6);
        t2.insert(8);

        assertEquals(t2.isSubTree(t1), true);
    }
    
}
