package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	static Connection  con;
	
	static
	{
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection()
	{
		
		try {
			if((con==null)||con.isClosed())
			//con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "shipping", "india");
			con=DriverManager.getConnection("jdbc:oracle:thin:@shipping.csqieiprlqpm.us-east-2.rds.amazonaws.com:1521:shipping","ship", "india123");
			//con=DriverManager.getConnection("jdbc:oracle:thin://shipping.csqieiprlqpm.us-east-2.rds.amazonaws.com:1521/shipping?user=ship&password=india123");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
}
