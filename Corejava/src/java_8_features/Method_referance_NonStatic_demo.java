package java_8_features;

import java.util.*;

interface Hy
{
	void print(String name,String address);
}
class College 
{
	public void student(String st_name,String st_address)
	{
		System.out.println("Student name is "+st_name+" and addres is "+st_address);
	}
}
public class Method_referance_NonStatic_demo {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your name");
	String name=sc.nextLine();
	System.out.println("Enter Your Address");
	String address=sc.nextLine();
	
	College clg=new College();
	
	Hy h=clg::student;
	
	h.print(name, address);
	
}
}
