package exceptionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Complietime_SQLException {
public static void main(String[] args) {
	try
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123");
	}
	catch(SQLException e)
	{
		System.out.println("handle");
	}
}
}
