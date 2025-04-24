package json_files;

import org.json.*;
public class Pasring_Json_data {
public static void main(String[]args)
{
	String jsonString="{\r\n"
			+ "  \"university\": \"Global Tech University\",\r\n"
			+ "  \"courses\": [\r\n"
			+ "    {\r\n"
			+ "      \"courseName\": \"Computer Science\",\r\n"
			+ "      \"professor\": {\r\n"
			+ "        \"name\": \"Dr. Alan Grant\",\r\n"
			+ "        \"email\": \"alan.grant@gtu.edu\"\r\n"
			+ "      },\r\n"
			+ "      \"students\": [\r\n"
			+ "        { \"name\": \"Alice\", \"id\": \"CS101\" },\r\n"
			+ "        { \"name\": \"Bob\", \"id\": \"CS102\" }\r\n"
			+ "      ]\r\n"
			+ "    },\r\n"
			+ "    {\r\n"
			+ "      \"courseName\": \"Data Science\",\r\n"
			+ "      \"professor\": {\r\n"
			+ "        \"name\": \"Dr. Ellie Sattler\",\r\n"
			+ "        \"email\": \"ellie.sattler@gtu.edu\"\r\n"
			+ "      },\r\n"
			+ "      \"students\": [\r\n"
			+ "        { \"name\": \"Charlie\", \"id\": \"DS201\" },\r\n"
			+ "        { \"name\": \"Diana\", \"id\": \"DS202\" }\r\n"
			+ "      ]\r\n"
			+ "    }\r\n"
			+ "  ]\r\n"
			+ "}\r\n";
	
	JSONObject obj=new JSONObject(jsonString);
	System.out.println(obj.toString(5));
	
	
	System.out.println("-------Parsing Now--------");
	
	String university=obj.getString("university");
	System.out.println("university : "+university);
	
	System.out.println("------- Array Parsing Now--------");
	
	JSONArray jarray=obj.getJSONArray("courses");
	
	for(int i=0;i<jarray.length();i++)
	{
		JSONObject course=jarray.getJSONObject(i);
		System.out.println("Course : "+course.getString("courseName"));
		
		JSONObject proof=course.getJSONObject("professor");
		System.out.println("Professor: "+proof.getString("name")+" ("+proof.getString("email")+")");
		
		JSONArray students=course.getJSONArray("students");
		System.out.println("Students");
		for(int j=0;j<students.length();j++)
		{
			JSONObject student=students.getJSONObject(j);
			System.out.println("- "+student.getString("name")+" ID :"+student.getString("id"));
		}
	}
}
}
