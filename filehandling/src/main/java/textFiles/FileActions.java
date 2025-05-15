package textFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileActions {
	public static void createFile(String filePath) {
		File myObj = new File(filePath);
		try {

			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File is All ready exists. ");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	public static void writeFile(String filePath) {
		try {
			FileWriter writter = new FileWriter(filePath);
			writter.write("hello java developer");
			writter.close();
			System.out.println("text successfully inserted");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readFile(String filePath) {
		File myObj = new File(filePath);

		try {
			Scanner myReader = new Scanner(myObj);
			
			while(myReader.hasNext())
			{
				System.out.println(myReader.next());
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void renameFile(String newName,String oldName)
	{
		File oldFile=new File(oldName);
		File newFile=new File(newName);
		if(oldFile.exists())
		{
			oldFile.renameTo(newFile);
			System.out.println("File Rename to :"+newFile);
		}
	}
	public static void deleteFile(String filePath)
	{
		File myFile=new File(filePath);
		if(myFile.exists())
		{
			myFile.delete();
			System.out.println("File deleted :"+myFile);
		}
	}

	public static void main(String[] args) {
		String path="C:\\Users\\hp\\Desktop\\Core Java\\myFile.txt";
		String newpath="C:\\Users\\hp\\Desktop\\Core Java\\myFile1.txt";
		createFile(path);
		writeFile(path);
		readFile(path);
		renameFile(newpath, path);
		deleteFile(newpath);
	}

}
