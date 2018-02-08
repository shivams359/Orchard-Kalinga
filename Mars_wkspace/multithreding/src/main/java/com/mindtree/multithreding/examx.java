package com.mindtree.multithreding;

public class examx extends  Thread {

	static int k=0;
	 public void run()
	{
		for(int i =0; i<4; i++)
		{
			k++;
			System.out.println("thread1");
		}
	}
}
