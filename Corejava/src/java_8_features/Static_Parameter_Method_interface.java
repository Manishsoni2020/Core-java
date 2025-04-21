package java_8_features;

interface StaticParameterMethod
{
	static void sum(int a,int b)
	{
		System.out.println("Sum of a and b is "+(a+b));
	}
	static void sub(int a,int b)
	{
		System.out.println("Sum of a and b is "+(a-b));
	}
}
public class Static_Parameter_Method_interface {
public static void main(String[] args) {

	StaticParameterMethod.sum(26, 45);
	StaticParameterMethod.sub(41, 23);
}
}
