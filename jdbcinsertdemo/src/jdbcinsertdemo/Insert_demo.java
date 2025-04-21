package jdbcinsertdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insert_demo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
	try 
	{
		System.out.println("enter your name ");
		String name=sc.nextLine();
		System.out.println("enter your email id");
		String email=sc.nextLine();
		System.out.println("enter your city");
		String city=sc.nextLine();
		
		//Load Driver class
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 //Create connection
		 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/deepak_sir", "root", "2002");
		 
		 // create statement
		 PreparedStatement ps= con.prepareStatement("insert into employee values (?,?,?)");
		 ps.setString(1, name);
		 ps.setString(2, email);
		 ps.setString(3, city);
		
		 int i=ps.executeUpdate();
		 if(i>0)
		 {
			 System.out.println("success");
		 }
		 else 
		 {
			 System.out.println("fail");
		 }
	} catch (Exception e) {
		 
		e.printStackTrace();
	}
}
}
