package refrance_type_casting;

class A 
{
	void sound()
	{
		System.out.println("heyaaa..!");
	}
}
class B extends A 
{
	void show()
	{
		System.out.println("oyahhhh....!");
	}
}
public class Upcasting {
public static void main(String[]args)
{
	A obj=new B(); //upcasting
	obj.sound();
}
}
