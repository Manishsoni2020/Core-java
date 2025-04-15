package oops_Overriding;


class P        //diff class but same method
{
	private void m1()  //private access modifire valid but its no overring
	{
		System.out.println("class A");
	}
}
class O extends P //diff class but same method
{
	private void m1()  //private access modifire valid but its no overring
	{
//		super.m1();
		System.out.println("class B");
	}
}
public class Overriding_case2 {
public static void main(String[]args)
{
	O obj=new O();
//	obj.m1();
}
}
