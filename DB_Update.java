package com.jdbc_learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DB_Update {

	public static void main(String[] args) throws Exception {
		
		
		
		String url="jdbc:mysql://localhost:3306/employee";
		String userName="root";
		String passWord="Ismail63855";
		
		int ID = 240;
		String FirstName="Syed";
		String LastName="Ifzul";
		String MailID="syedif@mail.com";
		int JoinngYear=2025;
		
		
		
		String query="insert into employees values(?,?,?,?,?)";
		
		
		Connection con=DriverManager.getConnection(url,userName,passWord);
		PreparedStatement pst=con.prepareStatement(query);

		
		
		pst.setInt(1,ID);
		pst.setString(2, FirstName);
		pst.setString(3, LastName);
		pst.setString(4,MailID);
		pst.setInt(5, 2025);
		
		int rows = pst.executeUpdate();
		
		System.out.println("Number of Rows Affected:" +rows);
		con.close();
		
	
	
}
}
