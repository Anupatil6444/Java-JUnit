package com.JUnit4.AssignmentwithJUnitLibrary;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAssignment {
   
	@Test
	public void test() {
		System.out.println("Test is running");
	}

	  @Test  
	    public void testFindMax(){  
	        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));    
	    }  
	  
	  @Test  
	    public void testCube(){  
	        assertEquals(27,Calculation.takecube(3));  
	    }  
}
