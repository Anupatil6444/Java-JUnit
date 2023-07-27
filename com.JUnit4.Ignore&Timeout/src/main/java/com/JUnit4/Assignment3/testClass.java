package com.JUnit4.Assignment3;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.junit.Test;

public class testClass {
    @Ignore
	@Test
	public void test() {
		System.out.println("test is running");
	}
    
    @Test
    public void addition()
    {
    	assertEquals(4,2+2);
    }

    @Ignore("This is not required test case")
    @Test
    public void makeuppercase()
    {
    	String name="anu";
    	assertEquals("ANU", name.toUpperCase());
    }
    
    @Test(timeout = 400)
    public void testTimeoutOne()
    {
    	System.out.println("Test is under 500 milisec");
    }


}
