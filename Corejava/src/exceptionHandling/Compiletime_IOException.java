package exceptionHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Compiletime_IOException {
public static void main(String[] args) {
	try 
	{
		FileWriter fw=new FileWriter("omg.text");
		fw.write("Hello word");
		fw.close();
		fw.write("again");
	}
	catch(IOException e)
	{
		System.out.println("handle");
	}
}
}
