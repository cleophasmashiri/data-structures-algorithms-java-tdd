package com.zamaflow.datastructures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ArrayAndStringsTests {

    private Unique unique;
    private StringPermutation stringPermutation;
    private StringUrlfy stringUrlfy;
    private OneAwayDetector oneAwayDetector;
    private Compressed compressed;

    @Before
    public void setup() {
        unique = new Unique();
        stringPermutation = new StringPermutation();
        stringUrlfy =  new StringUrlfy();
        oneAwayDetector = new OneAwayDetector();
        compressed = new Compressed();
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
        String s = "Everyone loves ray";
        assertEquals(stringUrlfy.urlfy(s, 10), "Everyone%20loves%20ray");
    }

    @Test
    public void givenStringWithSpacesShouldReturnUrlfiedStringNoReplace() {
        String s = "a b";
        assertEquals(stringUrlfy.urlfyNoReplace(s, 5), "a%20b");
    }

    @Test
    public void given2StringsShouldReturnOneAwayAsTrue() {
        assertTrue(oneAwayDetector.oneAway("abc", "ab"));
    }

    @Test
    public void given2StringsShouldReturnOneAwayAsFalse() {
        assertFalse(oneAwayDetector.oneAway("abc", "a"));
    }

    @Test
    public void given2DifferentLengthStringsShouldReturnOneAwayAsTrue() {
        assertTrue(oneAwayDetector.oneAway("abcd", "acd"));
    }

    @Test
    public void givenStringShouldReturnCompressedVersion() {
        assertEquals(compressed.compress("abbbc"), "ab3c");
        assertEquals(compressed.compress("abc"), "abc");
    }
}
