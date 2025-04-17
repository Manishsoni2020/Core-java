package multithreading;

class MyThread extends Thread 
{
	
}
public class Not_overriding_runmethod {
public static void main(String[] args) {
	MyThread mt=new MyThread();
	mt.start();
}
} 
//output=not any thing print
