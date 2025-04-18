package exceptionHandling;

public class Complietime_ClassnotFoundException {
	public static void main(String[] args) {
		try
		{
			Class.forName("com.welcome.Myclass");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("class not found handled..!");
		}
		
	}
}
