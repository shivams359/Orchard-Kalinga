package com.mindtree.multithreding;

public class examy extends Thread {
	static int k;
	 synchronized
	 public void run()
	{
		for(int i =0; i<4; i++)
		{
			k++;
			System.out.println("thread2");
		}
	}

}
