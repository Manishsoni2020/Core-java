package oops_Inheritance;

class Computer 
{
	public void show()
	{
		System.out.println("i am from computer class");
	}
}
class Leptop extends Computer
{
	public void show1()
	{
		System.out.println("I am from leptop class ");
	}
}
class ChromBook extends Leptop 
{
	public void show2()
	{
		System.out.println("I am from ChromBook class");
	}
}
public class Multi_level_inheritance {
	public static void main(String[]args)
	{
		ChromBook obj=new ChromBook();
		obj.show();
		obj.show1();
		obj.show2();
	}
}
