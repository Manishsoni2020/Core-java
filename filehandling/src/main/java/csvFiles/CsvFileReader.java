package csvFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CsvFileReader {

	public static void main(String[] args) throws FileNotFoundException {
		
		String csvFile=System.getProperty("user.dir")+"\\data\\example.csv";
		
		File file=new File(csvFile);
		
		Scanner sc=new Scanner(file);	
		
		sc.useDelimiter(",");
		while(sc.hasNext())
		{
			System.out.print(sc.next()+"\t");
		}

	}

}
