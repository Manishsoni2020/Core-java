package synchronization;

class Website 
{
	static int visitorcount=0;
	
	public static synchronized void visitSite()
	{
		visitorcount++;
		System.out.println(Thread.currentThread().getName()+"Total visitor "+visitorcount);
	}
}
public class Synchronization_static {
public static void main(String[]args)
{
	Thread t1=new Thread(new Runnable() {
		public void run()
		{
			Website.visitSite();
		}
	},"User-1");
	
	Thread t2=new Thread(new Runnable () {
		public void run()
		{
			Website.visitSite();
		}
	},"User-2" );
	
	Thread t3=new Thread(new Runnable() {
		public void run()
		{
			Website.visitSite();
		}
	},"User-3");
	
	t1.start();
	t2.start();
	t3.start();
}
}
