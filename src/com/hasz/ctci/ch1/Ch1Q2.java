package com.hasz.ctci.ch1;

import java.util.Arrays;

public class Ch1Q2 {

	public static boolean arePermutations(String s1, String s2) {
		String s1Sorted = sortString(s1);
		String s2Sorted = sortString(s2);
		
		return s1Sorted.equals(s2Sorted);
	}
	
	private static String sortString(String s) {
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		
		return new String(chars);
	}
}
