package com.mindtree.ExceptionPropagation;

public class ExceptionPropagationHandle {
	
	public void divide1() {
		System.out.println("u r in divide1 block");
		int a=19;
		int b=0;
		System.out.println(a/b);
	}
	
	public void divide2() {
		System.out.println("u r in divide2 block");
		divide1();
	}
	
	public void divide3() {
		System.out.println("u r in block3");
		try{
		divide2();
	}catch(ArithmeticException e){
		System.out.println("Exception handled successfully");
	  }
	
	}
}
