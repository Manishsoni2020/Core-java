package multithreading;

public class Getting_seting_thread_name {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	Thread.currentThread().setName("mansih");
	System.out.println(Thread.currentThread().getName());
}
}
