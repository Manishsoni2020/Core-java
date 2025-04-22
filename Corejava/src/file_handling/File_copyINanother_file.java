package file_handling;

import java.io.*;
public class File_copyINanother_file {
public static void main(String[]args)
{
	try 
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\hp\\Desktop\\DemoAgain.txt");
		FileOutputStream fo=new FileOutputStream("C:\\Users\\hp\\Desktop\\DemoNotAgain.txt");
		
		int i;
		while((i=fs.read())!=-1)
		{
			fo.write(i);
		}
		System.out.println("Data copy successfully");
	}
	catch(IOException e)
	{
		System.out.println("Exception handled...");
	}
}
}
