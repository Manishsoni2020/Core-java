package thread_Pool;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Mythread1 implements Runnable 
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" is runnig...");
	}
}
public class ThreadPoolScheduled_Creation {
public static void main(String[]args)
{
	ScheduledExecutorService shedular=Executors.newScheduledThreadPool(1);
	
	shedular.scheduleAtFixedRate(new Mythread1(), 2, 3, TimeUnit.SECONDS);
}
}
