package java_8_features;

interface CarSeller
{
	void engine();
	default void run()
	{
		System.out.println("This Engine is start automatically..!");
	}
}
class Mahindra implements CarSeller
{
	public void engine()
	{
		System.out.println("This is Thar engine");
	}
}
public class Default_Method_interface {
public static void main(String[] args) {
	Mahindra mh=new Mahindra();
	mh.engine();
	mh.run();
}
}
