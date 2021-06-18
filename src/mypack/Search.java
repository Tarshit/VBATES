package mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Search {
ResultSet search(String x,String y) throws SQLException{
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		
		try {
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Vbates", "root" , "Root@123");
			
			myStmt = myConn.createStatement();
			
			myRs = myStmt.executeQuery("select * from Journey join Bus using (journey_id) where start = '"+x+"' and end = '"+y+"';");
		
			
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
		return myRs;
	}


}
