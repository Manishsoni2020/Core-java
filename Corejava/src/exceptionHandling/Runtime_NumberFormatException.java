package exceptionHandling;

public class Runtime_NumberFormatException {
public static void main(String[] args) {
	
//	String str="Java is programing language";
//	int num=Integer.parseInt(str);
//	System.out.println(num);
	
	try
	{
		String str="Java is programing language";
		int num=Integer.parseInt(str);
		System.out.println(num);
	}
	catch(NumberFormatException e)
	{
		System.out.println("Numberformatexception is hanlded...!");
	}
	finally {
		System.out.println("I am finally block");
	}
}
}
