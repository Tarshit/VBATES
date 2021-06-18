package mypack;

import java.sql.*;

public class Update {
	
	void update(String x) throws SQLException{
		
		String url = "jdbc:mysql://localhost:3306/Vbates";
        String user = "root";
        String password = "Root@123";
 
        Connection myConn = null;
        Statement myStmt = null;
 
        try {
            myConn = DriverManager.getConnection(url, user, password);
 
            myStmt = myConn.createStatement();
 
            String sql = "update driver set name='ram' where driver_id=6";
 
            int rowsAffected = myStmt.executeUpdate(sql);
 
            System.out.println("Rows affected: " + rowsAffected);
            System.out.println("Update complete.");
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
        finally {
            if (myStmt != null) {
                myStmt.close();
            }
 
            if (myConn != null) {
                myConn.close();
            }
        }
	}

}
