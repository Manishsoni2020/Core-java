package oops_Overriding;


class A        //diff class but same method
{
	public void m1()
	{
		System.out.println("class A");
	}
}
class B extends A //diff class but same method
{
	public void m1()
	{
		super.m1();
		System.out.println("class B");
	}
}
public class Overriding_case1 {
public static void main(String[]args)
{
	B obj=new B();
	obj.m1();
}
}
