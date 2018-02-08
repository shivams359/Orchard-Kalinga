package com.mindtree.Exception;



public class Main {
	public void x() throws MyException {
		
		throw new ArithmeticException();
	}
	
	public void y() throws MyException {
		
		try{
			x();
		}catch(Exception e){
			throw new MyException(e.getMessage(), e.getCause());
		}
		
	}
	public void z() {
		try {
			y();
		} catch(Exception e) {
			System.err.println(e);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.z();
	}

}