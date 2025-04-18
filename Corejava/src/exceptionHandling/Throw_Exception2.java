package exceptionHandling;

public class Throw_Exception2 {
public static void main(String[] args) {
	try {
	checksalary(5000);
	} catch (ArithmeticException e) {
		System.out.println("Exception "+e);
	}
}
static void checksalary(int salary)
{
	if(salary<10000)
	{
		throw new ArithmeticException("salary is low");
	}
	else 
	{
		System.out.println("salary is high");
	}
}
}
