package thread_Pool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Mytask extends Thread 
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" Thread is running");
	}
}
public class Thread_Pool_Creation {
public static void main(String[] args) {
	ExecutorService executor=Executors.newFixedThreadPool(3); //for fixed number of thread
	
	for(int i=1;i<=6;i++)
	{
		executor.execute(new Mytask());
	}
	executor.shutdown();
}
}
