package Interface_method;

interface left 
{
	public void m1(); //same name method but diff parameter
}
interface right
{
	public void m1(int i); //same name method but diff parameter
}
class A implements left,right
{
	public void m1() //in this case we can implement both method
	{
		System.out.println("Again Hello Developer");
	}
	
	public void m1(int i)
	{
		System.out.println("the no is "+i);
	}
}
public class Interface_method_case2 {
	public static void main(String[]args)
	{
		A obj=new A();
		obj.m1();
		obj.m1(3);
	}
}
