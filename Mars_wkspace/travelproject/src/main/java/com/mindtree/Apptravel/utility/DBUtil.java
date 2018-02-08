package com.mindtree.Apptravel.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	private static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
	
	private static final String DB_URL="jdbc:mysql://localhost:3306/traveldata";
	
	private static  final String USER="root";
	private static final String PASSWORD="Welcome123";
	static Connection connection =null;
	static public Connection getconnection()
	{
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try{
			connection=DriverManager.getConnection(DB_URL,USER,PASSWORD);
		}

        catch(Exception e){
        	e.printStackTrace();
        }
  

	return connection;
	

}
	public static void closeconnection()
	{
		try{
			connection.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
