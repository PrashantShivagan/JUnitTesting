package com.cg.test;

import com.cg.test.InvalidNumberException;
import com.cg.test.NegativeNumberException;

public class Calculator {

	public int addDigits(int num) throws  NegativeNumberException {
		
		if(num < 0){
		throw new NegativeNumberException();
		}
		if(num>999 || num < 100) throw new  InvalidNumberException();
		else{
			int total = num%10;
			num=num/10;
			total = total+num%10;
			num=num/10;
			total=total+num;
			
			
			return total;
		}
		
		

		// TODO Auto-generated method stub
		
	}
	

}
