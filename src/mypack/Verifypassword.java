package mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Verifypassword {
ResultSet verify(String x) throws SQLException{
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Vbates", "root" , "Root@123");
			
			myStmt = myConn.createStatement();
			
			myRs = myStmt.executeQuery("select * from Passenger "+"where username = '"+x+"';");
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
			
		}
		
		if(!myRs.next()) {
			System.out.println("user not found");
		}
		System.out.println(myRs.getString("password"));
		return myRs;
}

}
