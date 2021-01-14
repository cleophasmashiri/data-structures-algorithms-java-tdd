package com.zamaflow.datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromesTests {

    @Test
    public void givenStringShouldIfPalindromeReturnTrueFalse() {
        Palindromes palindromes = new Palindromes();
        assertEquals(palindromes.isPalindrome("dad"), true);
        assertEquals(palindromes.isPalindrome("abba"), true);
        assertEquals(palindromes.isPalindrome("fish"), false);
    }
    
}
