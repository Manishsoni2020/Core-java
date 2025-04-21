package java_8_features;

interface Animal 
{
	void sound();
	default void eat()
	{
		System.out.println("The animal eats food");
	}
}
class Dog implements Animal 
{
	public void sound()
	{
		System.out.println("Dog woofing..!");
	}
	public void eat()
	{
		System.out.println("Dog eats padigree");
	}
}
class Cat implements Animal 
{
	public void sound()
	{
		System.out.println("Cat Meaowing..!");
	}
}
public class Default_Method_Override_interface_ {
public static void main(String[] args) {
	Dog d=new Dog();
	d.sound();
	d.eat();
	
//	output=>Dog woofing..!
//			Dog eats padigree
	
	Cat c=new Cat();
	c.sound();
	c.eat();
	
//	output=>Cat Meaowing..!
//			The animal eats food
}
}
