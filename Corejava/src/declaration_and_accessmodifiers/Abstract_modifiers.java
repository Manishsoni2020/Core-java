package declaration_and_accessmodifiers;

abstract class Student
{
	void Present()
	{
		System.out.println("I am present");
	}
	abstract void not_present();
}
class Teacher extends Student
{
	public void not_present() //child class is reponsible to implement abstract method
	{
		System.out.println("He/She is not present");
	}
}
public class Abstract_modifiers {
public static void main(String[] args) {
	Teacher t=new Teacher();
	t.not_present();
	t.Present();
}
}
