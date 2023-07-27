package com.JUnit4.Assignment2;

import static org.junit.Assert.assertThrows;

import java.util.Scanner;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import junit.framework.TestCase;

public class ArithmeticOperationTest extends TestCase {
    
	ArithmeticOperation arith=new ArithmeticOperation();
	Scanner sc = new Scanner(System.in);
	
	@BeforeAll
	public void beforeAll()
	{
		System.out.println("Test is Running......");
	}
	
	@Test
	public void testAddition()
	{
		System.out.println("Give expected output for addition:");
		int result=sc.nextInt();
		assertEquals(result,arith.addition());
	}
	
	@Test
	public void testSubstraction()
	{
		System.out.println("Give expected output for substraction:");
		int result=sc.nextInt();
		assertEquals(result,arith.substraction());
	}
	
	@Test
	public void testMultiplication()
	{
		System.out.println("Give expected output for multiplication:");
		int result=sc.nextInt();
		assertEquals(result,arith.multiplication());
	}
	
	@Test
	public void testDivision()
	{
		System.out.println("Give expected output for division:");
		int result=sc.nextInt();
		assertEquals(result,arith.division());
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
    public void testDivideByZero() {
          assertThrows(ArithmeticException.class ,()-> arith.division());
    }
}
