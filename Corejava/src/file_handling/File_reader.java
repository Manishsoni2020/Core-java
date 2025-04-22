package file_handling;

import java.io.*;
public class File_reader {
public static void main(String[]args)
{
	try 
	{
		FileReader fr=new FileReader("C:\\Users\\hp\\Desktop\\Demo.txt");
		try 
		{
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
		}
		finally
		{
			fr.close();
		}
	}
	catch(IOException i)
	{
		System.out.println("Exception handled...");
	}
}
}
