package multithreading;

class C extends Thread 
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			Thread.yield();
			System.out.println(i+" Child thread");
		}
	
	}
}
public class Yeild_method {
public static void main(String[]args)
{
	C obj=new C();
	obj.start();
	for(int i=0;i<=10;i++)
	{
		System.out.println(i+" Main thred");
	}
}
}
