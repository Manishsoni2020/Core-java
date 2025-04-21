package java_8_features;

interface StaticDefault
{
	static int show(int num,int num1)
	{
		return num+num1;
	}
	
	default String name(String first_name,String second_name)
	{
		return first_name+" "+second_name;
	}
	
}
class Z implements StaticDefault
{
	
}
public class Default_and_static_method_interface {
public static void main(String[] args) {
	System.out.println(StaticDefault.show(20, 32));
	Z obj=new Z();
	System.out.println(obj.name("Java", "Programming"));
}
}
