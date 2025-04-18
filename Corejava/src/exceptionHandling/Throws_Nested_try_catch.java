package exceptionHandling;

import java.io.IOException;

class B 
{
	void music() throws IOException
	{
		throw new IOException("Exception auccer");
	}
}
public class Throws_Nested_try_catch {
	
	void show2()
	{
		try 
		{
			try 
			{
				int a=59/0;
				System.out.println(a);
				try 
				{
					String s=null;
                    System.out.println(s.length());
				} catch (NullPointerException e) 
				{
					System.out.println("handle 2");
				}
			} catch (Exception e) 
			{
				System.out.println("handle 1");
			}
		} catch (Exception ex) 
		{
			System.out.println("handle 2");
		}
	}
public static void main(String[] args) {
	Throws_Nested_try_catch tn=new Throws_Nested_try_catch();
	tn.show2();
}
}
