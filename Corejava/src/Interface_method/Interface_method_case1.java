package Interface_method;

interface up 
{
	public void show(); //same name method 
}
interface down
{
	public void show(); //same name method
}
class Test implements up,down
{
	public void show() //in this case we can only implement one method
	{
		System.out.println("Hello Developer");
	}
}
public class Interface_method_case1 {
	public static void main(String[]args)
	{
		Test obj=new Test();
		obj.show();
	}
}
