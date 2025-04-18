package exceptionHandling;

class InvalidageException extends Exception
{
	InvalidageException(String i)
	{
		System.out.println(i);
	}
}
public class Customized_exception {
	static void vote(int age) throws InvalidageException
	{
		if(age<18)
		{
			throw new InvalidageException("Not elligible for vote");
		}
		else 
		{
			System.out.println("you can vote");
		}
	}
public static void main(String[] args) {
	try {
		vote(10);
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
