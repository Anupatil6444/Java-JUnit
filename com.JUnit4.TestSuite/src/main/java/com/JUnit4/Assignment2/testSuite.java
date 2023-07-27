package com.JUnit4.Assignment2;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	ArithmeticOperationTest.class,
	StringOperationTest.class,
	ArrayTestCases.class
})
public class testSuite {

}
