package csvFiles;

import java.io.FileWriter;
import java.io.IOException;

public class CsvFileAction {

	public static void main(String[] args) throws IOException {
		String csvFileName=System.getProperty("user.dir")+"\\data\\example.csv";
		
		FileWriter writer=new FileWriter(csvFileName);
		
		writer.append("Id,Name,Email \n");
		writer.append("1,Mainsh,manish@gmail.com \n");
		writer.append("2,Dainsh,Danish@gmail.com \n");
		writer.append("3,Ainsh,anish@gmail.com \n");
		
		writer.close();
		
		System.out.println("csv file created at: "+csvFileName);
		
	}

}
