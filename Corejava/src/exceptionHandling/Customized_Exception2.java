package exceptionHandling;

class InshuficiantBalance extends Exception
{
	InshuficiantBalance(String b)
	{
		System.out.println(b);
	}
}
public class Customized_Exception2 {
	static void bankBalance(double balance) throws InshuficiantBalance
	{
		if(balance<0)
		{
			throw new InshuficiantBalance("low balance");
		}
		else 
		{
			System.out.println("blanace is shuficiant");
		}
	}
public static void main(String[] args) {
	try {
		bankBalance(-12.3);
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
