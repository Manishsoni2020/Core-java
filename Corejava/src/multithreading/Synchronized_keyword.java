package multithreading;

class P
{
	public synchronized void wish(String name)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Good morning");
			try
			{
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				
			}
			System.out.println(name);
		}
	}
}
class J extends Thread 
{
	P d;
	String name;
	public J(P d, String name) {
		this.d = d;
		this.name = name;
	}
	public void run()
	{
		d.wish(name);
	}
}
public class Synchronized_keyword {
public static void main(String[] args) {
	P d1 =new P();
	J m1=new J(d1,"Yuvraj");
	J m2=new  J(d1,"MS dhoni");
	m1.start();
	m2.start();
}
}
