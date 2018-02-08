package com.mindtree.exceptionwrapping;

public class ExceptionWrapping {
	
	public void divide() {
		int a=0;
		int b=30;
		try{
			System.out.println(b/a);
		}catch(ArithmeticException e){}
		
	}

}
