package com.devguides;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnagramSolution1Test {
	private AnagramSolution1 test = null;
	
	@BeforeEach
	void setUp() throws Exception {
		test = new AnagramSolution1();
	}

	@AfterEach
	void tearDown() throws Exception {
		test = null;
	}

	@Test
	void testIsAnagramUsingSort() {
		assertTrue(test.isAnagramUsingSort("", "")); //EMTPY STRING
		assertTrue(test.isAnagramUsingSort("silent", "silent")); //ANAGRAM OF ITSELF
		assertTrue(test.isAnagramUsingSort("silent", "listen")); 
		assertTrue(test.isAnagramUsingSort("SILENT", "listen")); //DIFFERENT CASE
		
		assertTrue(test.isAnagramUsingSort("Dormitory", "Dirty room")); //WITH SPECIAL CHARS
		assertTrue(test.isAnagramUsingSort("Awesome!!!", "awesome")); //WITH SPECIAL CHARS
		
		assertFalse(test.isAnagramUsingSort("ban", "banana")); //NOT AN ANAGRAM
	
	}
}
