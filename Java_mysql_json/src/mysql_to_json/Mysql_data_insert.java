package mysql_to_json;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Mysql_data_insert {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name");
	String name=sc.nextLine();
	System.out.println("Enter your email");
	String email=sc.nextLine();
	System.out.println("Enter your city");
	String city=sc.next();
	
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsonconvert", "root", "2002");
		
		PreparedStatement stm=con.prepareStatement("insert into jsondata values(?,?,?)");
		
		stm.setString(1, name);
		stm.setString(2, email);
		stm.setString(3, city);
		
		int count=stm.executeUpdate();
		if(count>0)
		{
			System.out.println("data inserted ");
		}
		else 
		{
			System.out.println("data not inserted");
		}
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}
