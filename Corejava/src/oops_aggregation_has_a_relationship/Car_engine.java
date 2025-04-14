package oops_aggregation_has_a_relationship;

class Engine
{
	void start()
	{
		System.out.println("Engine is start");
	}
}
class Car 
{
	Engine en=new Engine(); //creating object of class inside another class is called has a relationship
	
	void drive()
	{
		en.start();
		System.out.println("Car is going");
	}
}
public class Car_engine {
	public static void main(String[]args)
	{
		Car c=new Car();
		c.drive();
	}
}
