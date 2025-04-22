package file_handling;

import java.io.*;
public class File_creation_txt {
public static void main(String[]args) throws IOException
{
	File f=new File("C:\\Users\\hp\\Desktop\\Demo.txt");
	if(f.createNewFile())
	{
		System.out.println("file created successfully");
	}
	else 
	{
		System.out.println("File aready exist...");
	}
}
}
