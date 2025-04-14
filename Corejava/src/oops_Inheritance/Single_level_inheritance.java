package oops_Inheritance;

class A 
{
	public void show()
	{
		System.out.println("I am class A's method");
	}
}
class B extends A 
{
	public void show1()
	{
		System.out.println("I am class B's method");
	}
}
public class Single_level_inheritance {
	public static void main(String[]args)
	{
		B obj=new B();
		obj.show();
		obj.show1();
	}
}
