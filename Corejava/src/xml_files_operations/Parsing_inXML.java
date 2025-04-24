package xml_files_operations;

import java.io.*;
import javax.xml.parsers.DocumentBuilderFactory;

public class Parsing_inXML {
	public static void main(String[]args)
	{
		try 
		{
			//Load file from location
			FileInputStream fs=new FileInputStream("C:\\Users\\hp\\Desktop\\web.xml");
			
			//Create doucmentbuilder
			DoumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		}
		catch(Exception e)
		{
			
		}
	}
}
