package Interface_method;

interface Dog 
{
	public void woof (); //same name method but diff return type
}
interface Lion
{
	public int lion_eye(); //same name method but diff return type
}
class Animal implements Dog,Lion
{
	public void woof() //in this case we can implement both method
	{
		System.out.println("Again Hello Developer");
	}
	
	public int lion_eye()
	{
		return 2;
	}
}
public class Interface_method_case3 {
	public static void main(String[]args)
	{
		Animal ani=new Animal();
		ani.woof();
		System.out.println("Lion have eyes "+ani.lion_eye());	
		
	}
}
