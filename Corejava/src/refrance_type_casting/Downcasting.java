package refrance_type_casting;

class P 
{
	void sound()
	{
		System.out.println("heyaaa..!");
	}
}
class L extends P 
{
	void show()
	{
		System.out.println("oyahhhh....!");
	}
}
public class Downcasting {
public static void main(String[]args)
{
	P obj=new L(); //upcasting
	L d=(L)obj;      //Downcasting
	d.show();
	d.sound();
}
}
