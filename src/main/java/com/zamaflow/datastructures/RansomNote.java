package com.zamaflow.datastructures;

import java.util.HashMap;

public class RansomNote {

    public boolean canWrite(String ransomNote, String letters) {
        HashMap<String, Integer> noteMap = map(ransomNote);
        HashMap<String, Integer> letterMap = map(letters);
        
        for (String k: noteMap.keySet()) {
            if (!letterMap.containsKey(k)) {
                return false;
            }
            int countNote = noteMap.get(k);
            int countLetter = letterMap.get(k);
            if (countNote > countLetter) {
                return false;
            }
        }
        return true;
    }

    public HashMap<String, Integer> map(String s) {
        HashMap<String, Integer> m = new HashMap<>();
        s = s.replaceAll("\\s+", "");
        for (int i = 0; i < s.length(); i++) {
            String s1 = String.valueOf(s.charAt(i));
            if (m.get(s1) != null) {
                m.put(s1, m.get(s1) + 1);
            } else {
                m.put(s1, 1);
            }
        }
        return m;
    }

}
