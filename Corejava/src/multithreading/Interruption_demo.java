package multithreading;

import java.beans.IntrospectionException;

class MyT extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("Lazy Thread");
				Thread.sleep(2000);
			}
		}
		catch( InterruptedException e)
		{
			System.out.println("tttt");
		}
	}
}
public class Interruption_demo {
public static void main(String[] args) {
	MyT obj=new MyT();
	obj.start();
	try
	{
		Thread.sleep(100);
	}
	catch(InterruptedException e)
	{
		
	}
	obj.interrupt();
	System.out.println("end of main");
}
}
