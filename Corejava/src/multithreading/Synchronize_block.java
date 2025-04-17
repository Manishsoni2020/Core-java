package multithreading;

class Table
{
	void printTable(int n)
	{
		synchronized(this)
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(n + " x " + i + " = " + (n * i));
				try
				{
					Thread.sleep(400);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
	}
}
class Thread1 extends Thread 
{
	Table n;
	Thread1(Table n)
	{
		this.n=n;
	}
	public void run()
	{
		n.printTable(5);
	}
}
class Thread2 extends Thread 
{
	Table n;
	Thread2(Table n)
	{
		this.n=n;
	}
	public void run()
	{
		n.printTable(10);
	}
}
public class Synchronize_block
{
	public static void main(String[] args) {
		Table obj=new Table();
		
		Thread1 t1=new Thread1(obj);
		Thread2 t2=new Thread2(obj);
			
		t1.start();
		t2.start();
}
}

