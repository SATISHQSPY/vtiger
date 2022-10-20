package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;


public class ReadJDBC {
	@Test

	public void readData() throws Throwable {
		//Step1 Register JDBD
		Driver dref=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(dref);
		//Step2 Connect to databases
		Connection con =(Connection) DriverManager.getConnection("Jdbc:mysql://localhost:3306/students","root","root");
		//Step3	Create Statement
		Statement stmt= con.createStatement();
		//Step4 Execute Query
		ResultSet Result = stmt.executeQuery("select * from Students_info");
		while(Result.next())
		{
			System.out.println(Result.getString(1)+""+Result.getString(2));		
		}
		//Step5 Close connection with DB
		con.close();
	}
}
