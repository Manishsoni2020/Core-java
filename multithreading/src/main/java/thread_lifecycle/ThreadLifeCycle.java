package thread_lifecycle;

class Mythread extends Thread {
	public void run() {
		System.out.println("Thread is running");
	}
}

public class ThreadLifeCycle {
	public static void main(String[] args) {
		Mythread m1 = new Mythread(); // new
		System.out.println(m1.getState()); // New

		m1.start();// Runnable
		System.out.println(m1.getState()); // Thread is running

		try {
			Thread.sleep(2000);// Main thread sleep
		} catch (Exception e) {
			System.out.println(e.getMessage()); 
		}
		System.out.println(m1.getState()); // terminated
	}
}
