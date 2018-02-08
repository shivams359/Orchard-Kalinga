package com.mindtree.threadbasic;
class hi
{
	public void show(){
		for(int i=0;i<5;i++)
			{System.out.println("hi");
		try{Thread.sleep(1500);}catch(Exception e){} }       //it stops the printing process for 500ms
	}
}
class hello
{
	public void show() {
		for(int i=0;i<5;i++)
			{System.out.println("hello");
		try{Thread.sleep(1500);}catch(Exception e){}}
	}
	
}

public class ThreadBasic 
{

	public static void main(String[] args)
	{
		hi obj1= new hi();
		hello obj2=new hello();
		obj1.show();
		obj2.show();
		

	}

}
