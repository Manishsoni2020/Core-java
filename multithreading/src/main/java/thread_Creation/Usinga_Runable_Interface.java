package thread_Creation;

class MyRunnable implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i * 2);
		}

	}

	public void run(int a) {
		System.out.println(a);
	}
}
public class Usinga_Runable_Interface {
	public static void main(String[] args) {
		MyRunnable my1 = new MyRunnable();
		Thread t1 = new Thread(my1);
		t1.start();
		
		
	}
}
