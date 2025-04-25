package json_files;

import org.json.*;
public class Json_file_CreateBasic {
public static void main(String[]args)
{
	JSONObject file=new JSONObject();
	
	file.put("Name", "Manish");
	file.put("Age", "25");
	file.put("Subject", "Math");
	file.put("City", "Jaipur");
	
	System.out.println(file);
}
}
