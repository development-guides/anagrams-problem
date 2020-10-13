package com.devguides;

import java.util.HashMap;
import java.util.Map;

public class AnagramSolution2 {

	public boolean isAnagramUsingMapHistogram(String s1, String s2) {
		//clean string
		s1 = cleanString(s1);
		s2 = cleanString(s2);

		// Length validation
		if (s1.length() != s2.length())
			return false;

		//create character arrays
		char[] s1Array = s1.toCharArray();
		char[] s2Array = s2.toCharArray();

		Map<Character, Integer> map = new HashMap<>();
		
		//build frequency histogram for s1
		for (char c : s1Array) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		//destructively modify histogram for s2
		for (char c : s2Array) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) - 1);
			} else {
				return false;
			}
		}

		//Check if any value in the map isn't zero
		for (Map.Entry<Character, Integer> entrySet : map.entrySet()) {
			if (entrySet.getValue() != 0) {
				return false;
			}
		}

		return true;
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

	public boolean isAnagramUsingArrayHistogram(String s1, String s2) {

		s1 = cleanString(s1);
		s2 = cleanString(s2);

		// Length validation
		if (s1.length() != s2.length())
			return false;

		char[] s1Array = s1.toCharArray();
		char[] s2Array = s2.toCharArray();

		int[] letters = new int[Character.MAX_VALUE];

		for (char c : s1Array) {
			letters[c]++;
		}

		for (char c : s2Array) {
			letters[c]--;
		}

		for (int i : letters) {
			if (i != 0)
				return false;
		}

		return true;
	}
}
