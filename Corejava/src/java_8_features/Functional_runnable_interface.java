package java_8_features;


public class Functional_runnable_interface {
public static void main(String[] args) {
	Runnable rb=()->{
		System.out.println("Thread is runing");
	};
	new Thread(rb).start();
}
}
