package file_handling;

import java.io.*;
public class File_writing {
public static void main(String[]args)
{
	try
	{
		FileWriter f=new FileWriter("C:\\Users\\hp\\Desktop\\Demo.txt");
		try
		{
			f.write("java is programing language");
		}
		finally
		{
			f.close();
		}
		System.out.println("successfull data inserted");
	}
	catch(IOException i)
	{
		System.out.println(i);
	}
}
}
