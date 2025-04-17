package multithreading;

class Home extends Thread 
{
	public void start()
	{
		System.out.println("start method");
	}
	public void run()
	{
		System.out.println("run method");
	}
}
public class Overriding_startmethod {
public static void main(String[] args) {
	Home j =new Home();
	j.start(); //output=start method
}
}
