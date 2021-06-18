package mypack;

import java.sql.*;

public class Insert {
	
	void insert(int passenger_id,String firstname,String lastname,int age,Long phone,String doorNo,String street,String city,String zipcode,String state,String gender,String username,String pass) throws SQLException{
		String url = "jdbc:mysql://localhost:3306/Vbates";
        String user = "root";
        String password = "Root@123";
 
        Connection myConn = null;
        Statement myStmt = null;
 
        try {
            myConn = DriverManager.getConnection(url, user, password);
 
            myStmt = myConn.createStatement();
 
            String sql = "insert into Passenger " + " (passenger_id, firstname, lastname, age, phoneNo, doorNO, street, city, zipcode, state, gender, username, password)"
                    + " values ("+passenger_id+", '"+firstname+"', '"+lastname+"', "+age+", "+phone+", '"+doorNo+"', '"+street+"', '"+city+"', '"+zipcode+"', '"+state+"', '"+gender+"', '"+username+"', '"+pass+"');";
 
            myStmt.executeUpdate(sql);
 
            System.out.println("Insert complete.");
        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (myStmt != null) {
                myStmt.close();
            }
 
            if (myConn != null) {
                myConn.close();
            }
        }
		
	}
	

}
