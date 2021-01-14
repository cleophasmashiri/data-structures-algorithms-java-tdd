package com.zamaflow.datastructures;

import java.util.HashSet;
import java.util.Set;

public class Unique {

	public boolean isUnique(String s) {
        Set<Character> set = new HashSet<Character>();
        for (int i=0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                return false;
            } else {
                set.add(s.charAt(i));
            }
        }
        return true;
	}

}
