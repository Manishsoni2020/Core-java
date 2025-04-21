package java_8_features;


// when method is static 
class Oops 
{
	public static void threadTask()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*2);
			try {
				Thread.sleep(2000);
			} catch (Exception  e) {
				e.printStackTrace();
			}
		}
	}
}
public class Method_referance_static_demo {

public static void main(String[]args)
{
	Runnable rn= Oops::threadTask;
	Thread d=new Thread(rn);
	d.start();
}
}
