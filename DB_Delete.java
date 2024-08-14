package com.jdbc_learn;
import java.sql.*;
public class DB_Delete {
	public static void main(String[] args) throws SQLException {
	    String url = "jdbc:mysql://localhost:3306/employee";
	    String userName = "root";
	    String passWord = "Ismail63855";
	    int ID = 240;

	    Connection con = DriverManager.getConnection(url, userName, passWord);
	    String query = "DELETE FROM employees WHERE id = ?";
	    PreparedStatement pst = con.prepareStatement(query);
	    pst.setInt(1, ID);

	    int rowsAffected = pst.executeUpdate();

	    System.out.println("Rows deleted: " + rowsAffected);
	}

}
