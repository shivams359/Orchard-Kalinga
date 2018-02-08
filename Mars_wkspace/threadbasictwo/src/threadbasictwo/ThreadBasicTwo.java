package threadbasictwo;

class hi extends Thread
{
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("hii");
			try{Thread.sleep(1000);}catch(Exception e){}
		}
	}
}
class hello extends Thread
{
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("hello");
			try{Thread.sleep(1000);}catch(Exception e){}
		}
	}
}
public class ThreadBasicTwo {

	public static void main(String[] args)
	{
		hi obj1 = new hi();
		hello obj2 = new hello();
		obj1.start(); 			// no need to call run method as start does the same finds run and executes
		obj2.start();
		
	}
}
