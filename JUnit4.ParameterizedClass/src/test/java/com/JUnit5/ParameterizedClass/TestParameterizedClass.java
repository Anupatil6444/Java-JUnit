package com.JUnit5.ParameterizedClass;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.Dynamic.Parameter;

import junit.framework.TestCase;

@RunWith(Parameterized.class)
public class TestParameterizedClass extends TestCase {

	int inputNum;
    Boolean expectedResult;
	
    ParameterizedClass param = new ParameterizedClass();
    
    public TestParameterizedClass(int inputNum, Boolean expectedResult) {
		super();
		this.inputNum = inputNum;
		this.expectedResult = expectedResult;
	}
	 
    @Parameterized.Parameters
    public static Collection primeNumbers() {
       return Arrays.asList(new Object[][] {
          { 2, true },
          { 6, false },
          { 19, true },
          { 22, false },
          { 23, true }
       });
    }
    
    @Test
    public void testValidatePrimeNum()
    {
    	assertEquals(expectedResult,param.validatePrimeNum(inputNum));
    }
}
