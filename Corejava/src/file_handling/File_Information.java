package file_handling;

import java.io.*;
public class File_Information {
public static void main(String[]args)
{
	File f=new File("C:\\Users\\hp\\Desktop\\Demo.txt");
	if(f.exists())
	{
		System.out.println("File Name :"+f.getName());
		System.out.println("File Path :"+f.getAbsolutePath());
		System.out.println("File Writable :"+f.canWrite());
		System.out.println("File Readable :"+f.canRead());
		System.out.println("File Size :"+f.length());
		System.out.println("File removed :"+f.delete());
	}
	else 
	{
		System.out.println("File Not exist...!");
	}
}
}
