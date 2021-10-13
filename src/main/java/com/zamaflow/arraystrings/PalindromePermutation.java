package com.zamaflow.arraystrings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PalindromePermutation {

    public boolean lettersMirrorEachOther(String word) {
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (m.get(word.charAt(i)) != null) {
                m.put(word.charAt(i), m.get(word.charAt(i)) + 1);
            } else {
                m.put(word.charAt(i), 1);
            }
        }
        if (word.length() % 2 == 0) {
            // must count to even
            for (Entry<Character, Integer> e : m.entrySet()) {
                if (e.getValue() % 2 != 0) {
                    return false;
                }
            }
        } else {
            // must have one char count = 1
            int c = 0;
            for (Entry<Character, Integer> e : m.entrySet()) {
                if (e.getValue() == 1) {
                    c++;
                }
                if (c>1) {
                    return false;
                }
            }
            for (Entry<Character, Integer> e : m.entrySet()) {
                if (e.getValue() != 1 && e.getValue() % 2 != 0) {
                    return false;
                }
            }
        }

        return true;
    }

}
