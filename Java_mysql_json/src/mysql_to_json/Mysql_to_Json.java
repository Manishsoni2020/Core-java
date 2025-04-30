package mysql_to_json;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import org.json.JSONArray;
import org.json.simple.JSONObject;



public class Mysql_to_Json {
public static void main(String[]args)
{
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/jsonconvert";
		String id="root";
		String pass="2002";
		
		Connection c=DriverManager.getConnection(url, id, pass);
		
		Statement ps=c.createStatement();
		
		ResultSet rs=ps.executeQuery("select * from jsondata");
		
		JSONArray ja=new JSONArray();
		
		//colum information getting
		ResultSetMetaData rd=rs.getMetaData();
		int columNumber=rd.getColumnCount();
		
		while(rs.next())
		{
			JSONObject jobj =new JSONObject();
			
			for(int i=1;i<=columNumber;i++)
			{
				String columName=rd.getColumnName(i);
				Object value=rs.getObject(i);
				jobj.put(columName, value);
			}
			
			ja.put(jobj);
		}
		System.out.println(ja.toString());
		
		FileWriter file=new FileWriter("C:\\Users\\hp\\Desktop\\output.json");
		file.write(ja.toString());
		file.flush();
		System.out.println("file created");
		
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}
