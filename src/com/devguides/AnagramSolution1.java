/**
 * 
 */
package com.devguides;

import java.util.Arrays;

public class AnagramSolution1 {

	public boolean isAnagramUsingSort(String s1, String s2) {
		s1 = cleanString(s1);
		s2 = cleanString(s2);

		// Length validation
		if (s1.length() != s2.length())
			return false;

		char[] s1Array = s1.toCharArray();
		char[] s2Array = s2.toCharArray();

		// Sort
		Arrays.sort(s1Array);
		Arrays.sort(s2Array);

		boolean equal = Arrays.equals(s1Array, s2Array);

		return equal;
	}

	/**
	 * Removes special characters and converts string to lowercase
	 * 
	 * @param s
	 * @return
	 */
	public static String cleanString(String s) {
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		// System.out.println(s);
		return s;
	}

	
}
