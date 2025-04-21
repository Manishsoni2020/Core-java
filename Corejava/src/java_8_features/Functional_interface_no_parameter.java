package java_8_features;

interface Car 
{
	void engine();
}
public class Functional_interface_no_parameter {
public static void main(String[]args)
{
	Car c=()->{
		System.out.println("Engine is ready to use...!");
	};
	c.engine();
}
}
