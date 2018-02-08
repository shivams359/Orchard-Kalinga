package com.mindtree.multithreding;

public class example {

	public static void main(String[] args) {
		examx x = new examx();
		examy y = new examy();
		
		x.start();
		y.start();

	}

}
