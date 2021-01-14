package com.zamaflow.datastructures;

public class OneAwayDetector {

	public boolean oneAway(String a, String b) {
		int diff = Math.abs(a.length() - b.length());
		if (a.equals(b)) {
			return true;
		} else if (diff > 1) {
			return false;
		} else if (diff == 1) { // insert case
			int countInserts = 0;
			String bigger;
			String smaller;
			if (a.length() > b.length()) {
				bigger = a;
				smaller = b;
			} else {
				bigger = b;
				smaller = a;
			}
			char[] biggerChars = bigger.toCharArray();
			char[] smallerChars = smaller.toCharArray();
			char[] newChars = new char[bigger.length()];
			int inserts = 0;
			for (int i = 0; i < bigger.length(); i++) {
				//System.out.println("inserts: " + inserts);
				if (i == smallerChars.length + inserts) {
					newChars[i] = biggerChars[i];
					inserts++;
				} else if (biggerChars[i] != smallerChars[i-inserts]) {
					// insert
					newChars[i] = biggerChars[i];
					inserts++;	
				} else {
					newChars[i] = biggerChars[i];
				}
				// System.out.println("newChars: " + String.valueOf(newChars));
				// System.out.println("inserts: " + inserts);
				if (inserts>1) {
					return false;
				}

			}

		} else if (a.length() == b.length()) {
			char[] aChars = a.toCharArray();
			char[] bChars = b.toCharArray();
			int countDiff = 0;
			for (int i = 0; i < aChars.length; i++) {
				if (aChars[i]!=bChars[i]) {
					countDiff++;
				}
				if (countDiff>1) {
					return false;
				}
			}

		}
		return true;
	}

}
