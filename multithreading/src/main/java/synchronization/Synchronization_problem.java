package synchronization;

class Counter 
{
	int count=0;
	void increment()
	{
		count++;
	}
}
class Mythread extends Thread {
	Counter c;
	
	Mythread(Counter c)
	{
		this.c=c;
	}
	public void run ()
	{
		for(int i=1;i<=1000;i++)
		{
			c.increment();
		}
	}
}
public class Synchronization_problem {
public static void main(String[]args) throws InterruptedException
{
	Counter c=new Counter();
	
	Mythread m1=new Mythread(c);
	Mythread m2=new Mythread(c);
	
	m1.start();
	m2.start();
	
	m1.join();
	m2.join();
	System.out.println(c.count);
}
}
