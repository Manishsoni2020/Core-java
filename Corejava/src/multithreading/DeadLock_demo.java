package multithreading;

class A 
{
	public synchronized void show()
	{
		System.out.println("hello");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			
		}
		System.out.println("thread 1 try to call b last()");
	}
	public synchronized void last()
	{
		System.out.println("In side a this is last()");
	}
}
public class DeadLock_demo {
public static void main(String[] args) {
	
}
}
