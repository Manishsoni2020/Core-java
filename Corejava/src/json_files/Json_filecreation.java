package json_files;

import java.io.*;
import org.json.*;
import org.json.simple.JSONObject;
public class Json_filecreation {
public static void main(String[]args)
{ 
	//create json object
	JSONObject obj=new JSONObject();
	
	//data put in json obj
	obj.put("name", "Manish");
	obj.put("age", 24);
	obj.put("isStudent", true);
	
	//Nested JSON object
	JSONObject address=new JSONObject();
	address.put("city", "jaipur");
	address.put("pincode", 302012);
	
	obj.put("address", address);//nested object 
	
	//write into file
	try
	{
		FileWriter file=new FileWriter("C:\\Users\\hp\\Desktop\\Data.json");
		
		file.write(obj.toString());
		file.flush();
		file.close();
		System.out.println("json file created successfully");
	}
	catch(IOException e)
	{
		System.out.println("exception occurred");
		e.printStackTrace();
	}
}
}
