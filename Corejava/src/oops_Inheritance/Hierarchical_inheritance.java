package oops_Inheritance;

class Animal
{
	void eat()
	{
		System.out.println("Animal Eats");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog barks");
	}
}
class Cat extends Animal 
{
	void meaow()
	{
		System.out.println("Cat meaows");
	}
}
public class Hierarchical_inheritance {
	public static void main(String[]args)
	{
		Dog obj=new Dog();
		obj.eat();
		obj.bark();
		
		System.out.println("------------------");

		Cat obj1=new Cat();
		obj1.eat();
		obj1.meaow();
	}
}
