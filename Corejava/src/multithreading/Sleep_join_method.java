package multithreading;

class Show extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Child thread");
			try {
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
public class Sleep_join_method {
public static void main(String[] args) {
	Show obj=new Show();
	obj.start();
	
	try {
        obj.join(); 
    } catch (InterruptedException e) {
        System.out.println(e);
    }
	
	for(int i=1;i<=10;i++)
	{
		System.out.println(i+" ");
	}
}
}
