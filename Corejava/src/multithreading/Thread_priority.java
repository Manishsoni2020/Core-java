package multithreading;

class Z extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Child thread");
		}
	}
}
public class Thread_priority {
public static void main(String[] args) {
	Z obj=new Z();
	obj.setPriority(8);
	obj.start();
	for(int i=1;i<=10;i++)
	{
		System.out.println("Main thread");
	}
}
}
