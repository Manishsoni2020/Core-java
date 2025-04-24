package xml_files_operations;

import java.io.*;
public class Basic_xmlFile_creation {
public static void main(String[]args) throws IOException
{
	FileWriter f=new FileWriter("C:\\Users\\hp\\Desktop\\web.xml");
	f.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
	f.write("<library>\n");
	
	f.write("  <book>\n");
    f.write("    <title>Effective Java</title>\n");
    f.write("    <author>Joshua Bloch</author>\n");
    f.write("    <isbn>9780134685991</isbn>\n");
    f.write("  </book>\n");

    f.write("  <book>\n");
    f.write("    <title>Clean Code</title>\n");
    f.write("    <author>Robert C. Martin</author>\n");
    f.write("    <isbn>9780132350884</isbn>\n");
    f.write("  </book>\n");

    f.write("</library>");
    
    f.close();
    System.out.println("XML file created successfully");
}
}
