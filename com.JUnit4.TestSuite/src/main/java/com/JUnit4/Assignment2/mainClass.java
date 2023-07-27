package com.JUnit4.Assignment2;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class mainClass 
{
	public static void main(String [] args)
	{/*
		Result result = JUnitCore.runClasses(testSuite.class);*/
		
		/*System.out.println(result.getRunCount());
		System.out.println(result.getFailureCount());
		
		for(Failure failure : result.getFailures())
		{
			System.out.println(failure.getMessage());
		}
		
		System.out.println(result.wasSuccessful());*/
		//ArithmeticOperation arith =new ArithmeticOperation();
		
			   Result result = JUnitCore.runClasses(testSuite.class);
			   for (Failure failure : result.getFailures()) {
			     System.out.println(failure.toString());
			   }
			   System.out.println(result.wasSuccessful());
			  
			
	}
}
