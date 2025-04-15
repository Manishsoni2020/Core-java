package oops_constructor;

class Z 
{
	private Z()
	{
		System.out.println("I am private Constructor");
	}
	static void show()
	{
		Z obj=new Z();
	}
}
public class Singleton {
public static void main(String[]args)
{
	Z.show();
}
}
