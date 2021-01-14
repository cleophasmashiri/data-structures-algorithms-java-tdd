package com.zamaflow.datastructures;

import java.util.Arrays;

public class StringPermutation {

    public boolean isPermutatation(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        a = sort(a);
        b = sort(b);
        return a.equals(b);
    }

    String sort(String s) {
        char t[] = s.toCharArray();
        Arrays.sort(t);
        return new String(t);
    }

}
