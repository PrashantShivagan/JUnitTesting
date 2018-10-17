package com.cg.test;

import junit.framework.Assert;
import com.cg.test.Calculator;
import com.cg.test.InvalidNumberException;
import com.cg.test.NegativeNumberException;

import org.junit.Test;

public class TestClass {

	@Test
	public void testMethod1(){
		Calculator cal = new Calculator();
		
		int res = cal.addDigits(127);
		
		Assert.assertEquals(10, res);
	}
	
	@Test(expected=NegativeNumberException.class)
	public void testMethod2() {
		Calculator cal = new Calculator();
		cal.addDigits(-45);
		
	}
	
	@Test(expected=InvalidNumberException.class)
	public void testMethod3(){
		Calculator calc = new Calculator();
		calc.addDigits(4503);
	}
	@Test(expected=InvalidNumberException.class)
	public void testMethod4(){
		Calculator cal = new Calculator();
		cal.addDigits(23);
	}
	
	
}






