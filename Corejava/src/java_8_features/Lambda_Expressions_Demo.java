package java_8_features;

interface A 
{
	void show(); //no parameter
}
public class Lambda_Expressions_Demo {
public static void main(String[] args) {
	A obj=()->System.out.println("zero parameter lambda expression");
	
	obj.show();
}
}
