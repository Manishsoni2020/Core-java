package exceptionHandling;

public class Runtime_ArithmeticException {
public static void main(String[] args) {
	
//	int c=50/0;
//	System.out.println(c);
	
	try
	{
		int a=10/0;
	}
	catch(ArithmeticException a)
	{
		System.out.println("Exception handled..!");
	}
	finally {
		System.out.println("Exception handling for runtimeException");
	}
	
}
}
