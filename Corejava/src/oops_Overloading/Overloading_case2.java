package oops_Overloading;

class Test 
{
	public void m1(Object ob)
	{
		System.out.println("Object version");
	}
	public void m1(String s)
	{
		System.out.println("String version");
	}
}
public class Overloading_case2 {
	public static void main(String[]args)
	{
		Test obj=new Test();
		obj.m1(new Object());
		obj.m1("Durga");
		obj.m1(null); //High priority to child argument
	}
}
