package com.JUnit4.Assignment2;

import java.util.Scanner;

public class ArithmeticOperation {

	Scanner sc = new Scanner(System.in);
	int a,b;

	public int addition()
	{
		System.out.println("Enter inpute for addition:");
		 a=sc.nextInt();
		 b=sc.nextInt();
		return a+b;
	}
	
	public int substraction()
	{
		System.out.println("Enter inpute for substraction:");
		 a=sc.nextInt();
		 b=sc.nextInt();
		return a-b;
	}
	
	public int multiplication()
	{
		System.out.println("Enter inpute for multiplication:");
		 a=sc.nextInt();
		 b=sc.nextInt();
		return a*b;
	}
	
	public int division()
	{
		System.out.println("Enter inpute for division:");
		 a=sc.nextInt();
		 b=sc.nextInt();
		return a/b;
	}
	
}
