package oops_constructor;

class Calculator 
{
	public Calculator()
	{
		this(5,6);
		System.out.println("welcome to my calculator");
	}
	public Calculator(int i,int j)
	{
		this(4,9.6f);
		int c=i+j;
		System.out.println("sum of no. is :"+c);
	}
	public Calculator(int i,float o)
	{
		float min=o-i;
		System.out.println("sub of no is :"+min);
	}
}
public class Constructor_chaining {
	public static void main(String[]args)
	{
		Calculator cal=new Calculator();
	}
}
