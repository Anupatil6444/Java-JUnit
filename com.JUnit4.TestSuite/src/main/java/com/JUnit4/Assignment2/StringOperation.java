package com.JUnit4.Assignment2;

import java.util.Scanner;

public class StringOperation {

	Scanner sc = new Scanner(System.in);
	
	public int findLengthOfString()
	{
		System.out.println("Enter input String check input:");
		String string=sc.nextLine();
		return string.length();
	}
	
	public String joinTwoStrings()
	{
		System.out.println("Enter input join two String:");
		String firstString=sc.nextLine();
		String secondString=sc.nextLine();
		return firstString.concat(secondString);
	}
	
	public boolean compareTwoStrings()
	{
		System.out.println("Enter input compare two String:");
		String firstString=sc.nextLine();
		String secondString=sc.nextLine();
		return firstString.equals(secondString);
	}
	
	public boolean checkContainString()
	{
		System.out.println("Enter input two String for check given string contains or not:");
		String firstString=sc.nextLine();
		String secondString=sc.nextLine();
		return firstString.contains(secondString);
	}
	
	public String removeWhiteSpace()
	{
		System.out.println("Enter input String remove space:");
		String string=sc.nextLine();
		return string.trim();
	}
	
	public String makeUpperCase()
	{
		System.out.println("Enter input String to convert upper case:");
		String string=sc.nextLine();
		return string.toUpperCase();
	}
	
	public String makeLowerCase()
	{
		System.out.println("Enter input String to convert upper case:");
		String string=sc.nextLine();
		return string.toLowerCase();
	}
	
	public boolean checkStartingString()
	{
		System.out.println("Enter input: 1st string full and for check starting test:");
		String string=sc.nextLine();
		String startString=sc.nextLine();
		return string.startsWith(startString);
	}
	
	public boolean checkEndingString()
	{
		System.out.println("Enter input: 1st string full and for check ending test:");
		String string=sc.nextLine();
		String startString=sc.nextLine();
		return string.endsWith(startString);
	}
	
	public boolean stringIsEmpty()
	{
		System.out.println("Enter input for check string is empty");
		String string=sc.nextLine();
	    return string.isEmpty();
	
    }
	
	public String checkSubsequence()
	{
		System.out.println("Enter string , staring and ending index for sub sequence string:");
		String string= sc.nextLine();
		int a = sc.nextInt();
		int b = sc.nextInt();
		return (String) string.subSequence(a, b);
	}
}
