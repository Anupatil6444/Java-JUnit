package com.JUnit4.Assignment2;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayTestCases {

	@Test
	public void testArrayEquality() {
	    char[] expected = {'j','a','v','a'};
	    char[] actual = "java".toCharArray();
	    
	    assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testAssertThatHasItems() {
		
		assertThat(
				Arrays.asList("Anu","anu","Java"),
				hasItems("anu","Java"));
	    
	}

	
}
