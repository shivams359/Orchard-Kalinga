package jdbcdemo;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Statement;

public class Driver {

	public static void main(String[] args) {
		
		try{
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactdb","root","Welcome123");
			Statement mySt = (Statement) myConn.createStatement();
			ResultSet rs = mySt.executeQuery("select * from student_information where name like '%m' ");
			while (rs.next()) {
				System.out.println(rs.getString("rollno")+", "+rs.getString("name"));
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
