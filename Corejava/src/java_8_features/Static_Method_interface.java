package java_8_features;

interface StaticMthod 
{
	static void show()
	{
		System.out.println("this is static method");
	}
}
public class Static_Method_interface {
public static void main(String[] args) {
	StaticMthod.show();
//	output=this is static method
}
}
