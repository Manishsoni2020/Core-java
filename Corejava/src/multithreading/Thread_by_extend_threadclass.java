package multithreading;

import java.util.*;
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Child Thread");
		}
	}
}
public class Thread_by_extend_threadclass {
public static void main(String[] args) {
	A obj=new A();
	obj.start();
	
	for(int i=1;i<=10;i++)
	{
		System.out.println("Main Thread");
	}
}
}
