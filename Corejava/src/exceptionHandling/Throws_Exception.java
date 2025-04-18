package exceptionHandling;

import java.io.IOException;

class A 
{
	void show() throws IOException
	{
		System.out.println("divice error");
	}
}
public class Throws_Exception {
	void show1()
	{
		try {
			A obj=new A();
			obj.show();
		} catch (Exception e) {
			System.out.println("handle");
		}
	}
public static void main(String[] args)throws InterruptedException
{
	Throws_Exception te=new Throws_Exception();
	te.show1();
}

}
