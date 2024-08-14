package com.jdbc_learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB_insert {
	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/employee";
		String userName="root";
		String passWord="Ismail63855";
		String query="insert into employees values(032,'Mohamed','Saifudeen','saifu@gmail.com',2025)";
		
		
		
		
		Connection con=DriverManager.getConnection(url,userName,passWord);
		Statement st=con.createStatement();
		int rows = st.executeUpdate(query);
		
		System.out.println("Number of Rows Affected:" +rows);
		con.close();
		
	
	
}
}
