package com.zamaflow.datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HashTableTests {

    private HashTable hashTable;

    @Before
    public void setup() {
        hashTable =  new HashTable(16);
    }

    @Test
    public void givenHashTableShouldReturnValueByKey() {
        hashTable.put("Fracis", "Francis Mashiri");
        hashTable.put("Kim", "Kim Mashiri");
        assertEquals(hashTable.get("Fracis"), "Francis Mashiri");
        assertEquals(hashTable.get("Kim"), "Kim Mashiri");
    }

    @Test
    public void givenHashTableWith2KeysMappingToSameIndexShouldResoveCollision() {
       assertEquals(hashTable.getIndex("Rosa"), 4);
       assertEquals(hashTable.getIndex("Peter"), 4);

       hashTable.put("Rosa", "Rosa Mashiri");
       hashTable.put("Peter", "Peter Mashiri");

       assertEquals(hashTable.get("Rosa"), "Rosa Mashiri");
       assertEquals(hashTable.get("Peter"), "Peter Mashiri");

    }
    
}
