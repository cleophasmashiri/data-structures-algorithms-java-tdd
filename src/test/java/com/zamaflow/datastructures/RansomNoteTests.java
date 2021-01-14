package com.zamaflow.datastructures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

public class RansomNoteTests {

    @Test
    public void givenStringReturnHashMapQuiivalence() {
        RansomNote ransomNote = new RansomNote();
        assertEquals(ransomNote.map("Pa y"), new HashMap<String, Integer>(){{
            put("P", 1);
            put("a", 1);
            put("y", 1);
        }});
    }

    @Test
    public void givenRansomNoteAndLettersShouldReturnCanWriteTrueOrFalse() {

        RansomNote ransomNote = new RansomNote();

        assertTrue(ransomNote.canWrite("Pay", "Payhfhf"));

    }
    
}
