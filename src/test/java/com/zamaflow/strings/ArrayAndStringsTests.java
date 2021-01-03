package com.zamaflow.strings;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ArrayAndStringsTests {

    private Unique unique;
    private StringPermutation stringPermutation;
    private StringUrlfy stringUrlfy;

    @Before
    public void setup() {
        unique = new Unique();
        stringPermutation = new StringPermutation();
        stringUrlfy =  new StringUrlfy();
    }

    @Test
    public void givenUniqueStringShouildReturnTrueIfUniqueCharsTest() {
        String s = "abc";
        assertEquals(unique.isUnique(s), true);
    }

    @Test
    public void givenNonUniqueStringShouildReturnFalseIfUniqueCharsTest() {
        String s = "abcc";
        assertEquals(unique.isUnique(s), false);
    }

    @Test
    public void givenStringsOfUnequalLengthsShouldReturnFalseTest() {
        String a = "abc";
        String b = "abcc";
        assertEquals(stringPermutation.isPermutatation(a, b), false);
    }

    @Test
    public void givenStringsWithSameCharsShouldReturnTrueTest() {
        String a = "abc";
        String b = "cba";
        assertEquals(stringPermutation.isPermutatation(a, b), true);
    }

    @Test
    public void givenStringWithSpacesShouldReturnUrlfiedString() {
        String s = "";
        assertEquals(stringUrlfy.urlfy(s), "");
    }

}
