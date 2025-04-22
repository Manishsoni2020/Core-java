package file_handling;

import java.io.*;
public class File_rename {
public static void main(String[]args)
{

		File f=new File("C:\\Users\\hp\\Desktop\\Demo.txt");
		File r=new File("C:\\Users\\hp\\Desktop\\DemoAgain.txt");
		
		if(f.exists())
		{
		  boolean result=f.renameTo(r);
		  System.out.println("file name changed");
		}
		else 
		{
			System.out.println("file not found");
		}
	
}
}
