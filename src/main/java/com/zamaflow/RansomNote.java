package com.zamaflow;

import java.util.HashSet;
import java.util.Set;

public class RansomNote {

	public boolean canWrite(String ransomNote, String letters) {
        Set<Integer> usedLetters = new HashSet<>();
        boolean[] ransomNotePosFilled = new boolean[ransomNote.length()];
        for (int i=0;i<ransomNote.length(); i++) {
            for (int j=0;j<letters.length(); j++) {
                if (!ransomNotePosFilled[i] && ransomNote.charAt(i) == letters.charAt(j) && !usedLetters.contains(j)) {
                    usedLetters.add(j);
                    ransomNotePosFilled[i] = true;
                }
            
            }
            if (!ransomNotePosFilled[i]) {
                return false;
            }
        }
		return true;
	}

}
