package exceptionHandling;

public class Runtime_NullpointerException {
public static void main(String[] args) {
	
//	String i=null;
//	System.out.println(i.length());
	
	try 
	{
		String i=null;
		System.out.println(i.length());
	}
	catch(NullPointerException e)
	{
		System.out.println("Nullpointer exception handled..!");
	}
}
}
