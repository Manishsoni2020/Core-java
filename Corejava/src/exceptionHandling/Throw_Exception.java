package exceptionHandling;

public class Throw_Exception {
public static void main(String[] args) {
	int age=15;
	if(age>=18)
	{
		System.out.println("elligble for vote");
	}
	else 
	{
		throw new ArithmeticException("not elligble for vote");
	}
}
}
