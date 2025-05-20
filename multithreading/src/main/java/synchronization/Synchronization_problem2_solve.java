package synchronization;

class Counter1 
{
	int count=0;
	synchronized void increment()
	{
		count++;
	}
}
class Mythread1 extends Thread {
	Counter1 c;
	
	Mythread1(Counter1 c)
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
public class Synchronization_problem2_solve {
public static void main(String[]args) throws InterruptedException
{
	Counter1 c=new Counter1();
	
	Mythread1 m1=new Mythread1(c);
	Mythread1 m2=new Mythread1(c);
	
	m1.start();
	m2.start();
	
	m1.join();
	m2.join();
	System.out.println(c.count);
}
}
