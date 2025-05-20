package thread_Creation;

class MyThread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread 1: "+i);
		}
	}
}
class MyThread2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread 2: "+i);
		}
	}
}

public class Multipal_Thread {
public static void main(String[]args)
{
	MyThread1 m1=new MyThread1();
	MyThread2 m2=new MyThread2();
	m1.start();
	m2.start();
}
}
