package com.hasz.ctci.main.ch1;

public class Ch1Q5 {

	public static boolean isSingleEdit(String s1, String s2) {
		int i = s1.length() - 1;
		int j = s2.length() - 1;
		boolean edited = false;
		
		// start at back and work way to the front
		while (i >= 0 && j >= 0) {
			if (s1.charAt(i) == s2.charAt(j)) {
				// happy, keep going
				i--;
				j--;
			} else {
				// need to edit because there is a mismatch
				if (edited) {
					// our second edit, failure
					return false;
				} else {
					// first edit, cannot edit again
					edited = true;
				}
				
				if (s1.length() > s2.length()) {
					// "inserting" into s2 or "removing" from s1... same difference
					i--;
				} else if (s1.length() < s2.length()) {
					// "inserting" into s1 or "removing" from s2... same difference
					j--;
				} else {
					// performing a substitution in either or
					i--;
					j--;
				}
			}
		}
		
		return true;
	}
}