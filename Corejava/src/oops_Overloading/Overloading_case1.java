package oops_Overloading;

class A 
{
	public void m1(StringBuffer sb) //Diff parameter is solution of overloading
	{
		System.out.println("StringBuffer_arg");
	}
	public void m1(String s) //Diff parameter is solution of overloading
	{
		System.out.println("String-arg");
	}
}
public class Overloading_case1 {
	public static void main(String[]args)
	{
		A obj=new A();
		obj.m1(new StringBuffer("Manish"));
		obj.m1("soni");
	}
}
