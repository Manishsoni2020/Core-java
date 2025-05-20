package synchronization;

class Printer {
	void printPage(int pages) {

		synchronized (this) {

			System.out.println(Thread.currentThread().getName() + " Started preparing");

			for (int i = 1; i <= pages; i++) {
				System.out.println(Thread.currentThread().getName() + " printing page ");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName() + " finished printing.");
		}

	}
}

class Printtask implements Runnable {
	Printer printer;
	int pages;

	Printtask(Printer printer, int pages) {
		this.printer = printer;
		this.pages = pages;
	}

	public void run() {
		printer.printPage(pages);
	}
}

public class Synchronization_block {
	public static void main(String[] args) {
		Printer printer = new Printer();

		Runnable task1 = new Printtask(printer, 3);
		Runnable task2 = new Printtask(printer, 3);

		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();
	}
}
