package com.devguides;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnagramSolution2Test {
	private AnagramSolution2 test = null;
	
	@BeforeEach
	void setUp() throws Exception {
		test = new AnagramSolution2();
	}

	@AfterEach
	void tearDown() throws Exception {
		test = null;
	}

	@Test
	void testIsAnagramUsingMapHistogram() {
		assertTrue(test.isAnagramUsingMapHistogram("", "")); //EMTPY STRING
		assertTrue(test.isAnagramUsingMapHistogram("silent", "silent")); //ANAGRAM OF ITSELF
		assertTrue(test.isAnagramUsingMapHistogram("silent", "listen")); 
		assertTrue(test.isAnagramUsingMapHistogram("SILENT", "listen"));
		
		assertTrue(test.isAnagramUsingMapHistogram("Dormitory", "Dirty room"));
		assertTrue(test.isAnagramUsingMapHistogram("Awesome!!!", "awesome"));
		
		assertFalse(test.isAnagramUsingMapHistogram("ban", "banana"));
	
	}
	
//	@Test
//	void testIsAnagramUsingArrayHistogram() {
//		assertTrue(test.isAnagramUsingArrayHistogram("", "")); //EMTPY STRING
//		assertTrue(test.isAnagramUsingArrayHistogram("silent", "silent")); //ANAGRAM OF ITSELF
//		assertTrue(test.isAnagramUsingArrayHistogram("silent", "listen")); 
//		assertTrue(test.isAnagramUsingArrayHistogram("SILENT", "listen"));
//		
//		assertTrue(test.isAnagramUsingArrayHistogram("Dormitory", "Dirty room"));
//		assertTrue(test.isAnagramUsingArrayHistogram("Awesome!!!", "awesome"));
//		
//		assertFalse(test.isAnagramUsingArrayHistogram("ban", "banana"));
//	
//	}

}
