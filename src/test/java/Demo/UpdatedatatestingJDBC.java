package Demo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;


@Test
public class UpdatedatatestingJDBC {
//Step1 Register the driver
	public void insertData() throws Throwable {
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		//Step2 connect to DB
	Connection	con = DriverManager.getConnection("Jdbc:mysql://localhost:3306/students","root","root");
		
		//Step3 create statement
		Statement stmt = con.createStatement();
		//Step4 Insert the data
		int result = stmt.executeUpdate("Insert into Students_info(regno,Firstname,Middlename,Lastname)values(7,'MAXi','MAX','H');");
		if (result==1)
		{
			System.out.println("DATA IS STORED");
		}
		else
		{
			System.out.println("MISSING DATA QUERY");
		}
		
	}
	
}
