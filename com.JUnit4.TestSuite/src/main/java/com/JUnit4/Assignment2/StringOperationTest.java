package com.JUnit4.Assignment2;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class StringOperationTest {

	StringOperation strOper = new StringOperation();
	Scanner sc = new Scanner(System.in);
	
	@Test
	public void testFindLengthOfString()
	{
		System.out.println("Enter expectect output for testFindLengthOfString method:");
		int len=sc.nextInt();
		assertEquals(len,strOper.findLengthOfString());
	}
	
	@Test
	public void testJoinTwoStrings()
	{
		System.out.println("Enter expectect output for testJoinTwoStrings method:");
		String result=sc.nextLine();
		assertEquals(result,strOper.joinTwoStrings());
	}
	
	@Test
	public void testCompareTwoStrings()
	{
		assertTrue(strOper.compareTwoStrings());
	}
	
	@Test
	public void testCheckContainString()
	{
		assertTrue("give correct input",strOper.checkContainString());
	}
	
	@Test
	public void testRemoveWhiteSpace()
	{
		System.out.println("Enter expectect output for testRemoveWhiteSpace method:");
		String result=sc.nextLine();
		assertEquals(result,strOper.removeWhiteSpace());
	}
	
	@Test
	public void testMakeUpperCase()
	{
		System.out.println("Enter expectect output for testMakeUpperCase method:");
		String result=sc.nextLine();
		assertEquals(result,strOper.makeUpperCase());

	}
	
	@Test
	public void testMakeLowerCase()
	{
		System.out.println("Enter expectect output for testMakeUpperCase method:");
		String result=sc.nextLine();
		assertEquals(result,strOper.makeLowerCase());

	}
	
	@Test
	public void testCheckStartingString()
	{
		assertTrue("Expect correct starting input",strOper.checkStartingString());
	}
	
	@Test
	public void testCheckEndingString()
	{
		assertTrue("Expect correct ending input",strOper.checkEndingString());
	}
	
	@Test
	public void testStringIsNotEmpty()
	{
		assertFalse(strOper.stringIsEmpty());
	}
	
	@Test
	public void testStringIsEmpty()
	{
		assertTrue(strOper.stringIsEmpty());
	}
	
	@Test
	public void testCheckSubsequence()
	{
		System.out.println("Enter expectect output for testCheckSubsequence() method:");
		String result=sc.nextLine();
		assertEquals(result,strOper.checkSubsequence());
	}
	
}
