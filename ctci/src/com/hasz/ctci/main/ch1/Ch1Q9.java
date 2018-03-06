package com.hasz.ctci.main.ch1;

public class Ch1Q9 {

	public static boolean isRotation(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false; // easy fail
		}
		
		// if the string is a rotation,
		// it will be revealed when the rotated
		// string is added to itself. s1 should 
		// appear in the middle of this concatenation.
		String combined = s2.concat(s2);
		
		return isSubstring(s1, combined);
	}
	
	// returns true iff s2 is substring of s2
	private static boolean isSubstring(String s1, String s2) {
		return s2.contains(s1);
	}
	
}
