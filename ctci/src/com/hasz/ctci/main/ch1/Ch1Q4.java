package com.hasz.ctci.main.ch1;

import java.util.HashMap;
import java.util.Map;

public class Ch1Q4 {

	public static boolean isPalindromePermutation(String s) {
		Map<Character, Integer> characterCount = new HashMap<Character, Integer>();
		int numberOfOddCharacterCounts = 0;
		
		for (Character c : s.toCharArray()) {
			// ignoring spaces
			if (c == ' ') {
				continue;
			}
			
			Character cIgnoreCase = Character.toLowerCase(c);
			Integer count = characterCount.getOrDefault(cIgnoreCase, 0) + 1;
			
			if (count %  2 == 0) {
				numberOfOddCharacterCounts--;
			} else {
				numberOfOddCharacterCounts++;
			}
			
			characterCount.put(cIgnoreCase, count);
		}
		
		return numberOfOddCharacterCounts <= 1;
	}	
	
}
