package JDBC.practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdateTest {

	@Test
	public void executeupdatetest() throws Throwable
	{
		Connection con=null;
		try {
			//step=1 Register the driver
			Driver dref=new Driver();
			DriverManager.registerDriver(dref);
			
			//step=2 connect to database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
			
			//step=3 create a statement
			Statement stmt=con.createStatement();
			
			//execute non select query
			int result = stmt.executeUpdate(" insert into students_info(regno,firstname,middlename,lastname)values('6','teja','bukya','B');");
			if(result==1)
			{
				System.out.println("data is added in database");
			}
			else
			{
				System.out.println("data is not added");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
		
		con.close();
		}
	}
}

