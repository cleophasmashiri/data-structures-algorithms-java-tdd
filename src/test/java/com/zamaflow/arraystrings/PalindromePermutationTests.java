package com.zamaflow.arraystrings;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PalindromePermutationTests {

/** 
    Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palin­drome. 
    A palindrome is a word or phrase that is the same forwards and backwards. 
    e.g. dad, daad
    A permutation is a rearrangement of letters. 
    The palindrome does not need to be limited to just dictionary words.
    EXAMPLE
    Input: tactcoa
    Output: True (permutations: "taco cat", "atco eta", etc.) Hints:#106,#121,#134,#136
**/

PalindromePermutation palindromePermutation;


@Before
public void setup() {
palindromePermutation = new PalindromePermutation();
}

@Test
public void givenEvenLettersShouldMirrorEachLetter() {
   // if length is even then each letter should total = 2
   String word = "daad";
   assertEquals(palindromePermutation.lettersMirrorEachOther(word), true);
   assertEquals(palindromePermutation.lettersMirrorEachOther("dad"), true);
   assertEquals(palindromePermutation.lettersMirrorEachOther("dda"), true);
    
}
    
}
