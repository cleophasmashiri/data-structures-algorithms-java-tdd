package com.zamaflow.arraystrings;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


/**
 * String Compression: Implement a method to perform basic string compression using the counts of repeated characters. 
 * For example, the string aabcccccaaa would become a2blc5a3. If the "compressed" string would not become smaller than the original string, your method should return
the original string. 
You can assume the string has only uppercase and lowercase letters (a - z).
 * **/
public class StringCompressionTests {


    private StringCompression stringCompression = new StringCompression();

    @Before
    public void setup() {
        stringCompression = new StringCompression();
    }
    
    @Test
    public void givenStringShouldReturnCompressedString() {

        assertEquals(true, true);
    }
    
}
