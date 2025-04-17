package multithreading;

import java.util.*;
class I implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Child Thread");
		}
	}
}
public class Thread_by_implements_runableinterface {
public static void main(String[] args) {
	I obj=new I();
	Thread t=new Thread(obj);
	t.start();
	
	for(int i=1;i<=10;i++)
	{
		System.out.println("Main Thread");
	}
}
}
