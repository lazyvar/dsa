package com.hasz.ctci.main.ch1;

public class Ch1Q3 {

	public static String urlify(String s, int trueLength) {
		char[] chars = s.toCharArray();
		int buffer = s.length() - 1;
		
		for (int i = trueLength - 1; i >= 0; i--) {
			char c = chars[i];
			
			if (c == ' ') {
				chars[buffer] = '0';
				chars[buffer - 1] = '2';
				chars[buffer - 2] = '%';
				buffer -= 3;
			} else {
				chars[buffer] = c;
				buffer--;
			}
		}
		
		return new String(chars);
	}
	
}
