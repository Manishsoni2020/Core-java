package thread_Creation;

class Mythread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread is Running");
		}
	}
}

public class Using_Thread_Class {
	public static void main(String[] args) {
		Mythread m1 = new Mythread();
		m1.start();
	}
}
