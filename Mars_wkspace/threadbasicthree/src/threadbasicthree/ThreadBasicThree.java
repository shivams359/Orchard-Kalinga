package threadbasicthree;

class hi 
{
	public void show() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("hii");
			try{Thread.sleep(1000);}catch(Exception e){}
		}
	}

	
}
class hello
{
	public void show() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("hello");
			try{Thread.sleep(100);}catch(Exception e){}
		}
	}

	
}

class Threading implements Runnable{
	hi h1 = null;
	hello h2 = null;
	public Threading(hi h1) {
		// TODO Auto-generated constructor stub
		this.h1 = h1;
	}
	
	public Threading(hello h2) {
		// TODO Auto-generated constructor stub
		this.h2 = h2;
	}
	
	public void run() {
		
		h1.show();
		h2.show();
	}

}

public class ThreadBasicThree {

	public static void main(String[] args) 
	{
		hi obj1 = new hi();
		hello obj2 = new hello();
		
		Thread t1=new Thread(new Threading(obj1));
		Thread t2=new Thread(new Threading(obj2));
		t1.start();
		t2.start();
		
	}

}
