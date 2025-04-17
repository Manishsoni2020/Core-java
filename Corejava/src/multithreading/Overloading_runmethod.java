package multithreading;

class B extends Thread
{
	public void run()
	{
		System.out.println("hello");
	}
	public void run(int i)
	{
		System.out.println("hyy");
	}
}
public class Overloading_runmethod {
public static void main(String[] args) {
	B obj=new B();
	obj.start(); //output=hello
}
}
