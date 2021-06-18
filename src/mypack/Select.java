package mypack;

import java.sql.*;

public class Select {
	
	void select(String x) throws SQLException{
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Vbates", "root" , "Root@123");
			
			myStmt = myConn.createStatement();
			
			myRs = myStmt.executeQuery("select password from Passenger where username="+x+";");
			
			while (myRs.next()) {
				System.out.println(myRs.getString("driver_id") + ", " + myRs.getString("name")+", " +myRs.getLong("phone"));
			}
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			if (myRs != null) {
				myRs.close();
			}
			
			if (myStmt != null) {
				myStmt.close();
			}
			
			if (myConn != null) {
				myConn.close();
			}
		}
	}

}
