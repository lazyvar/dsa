package com.hasz.ctci.ch1;

import java.util.HashSet;
import java.util.Set;

public class Ch1Q1 {

	public static boolean isUnique(String s) {
		Set<Character> foundCharacters = new HashSet<Character>();
		
		for (Character c : s.toCharArray()) {		
			if (foundCharacters.contains(c)) {
				return false;
			} else {
				foundCharacters.add(c);
			}
		}
		
		return true;
	}
	
}
