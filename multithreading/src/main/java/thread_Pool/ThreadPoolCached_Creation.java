package thread_Pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Mythread implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" Thread is running");
	}
}
public class ThreadPoolCached_Creation {
public static void main(String[]args)
{
	ExecutorService executor=Executors.newCachedThreadPool();
	
	for(int i=1;i<=10;i++)
	{
		executor.execute(new Mythread());
	}
	executor.shutdown();
}
}
