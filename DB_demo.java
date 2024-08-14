package com.jdbc_learn;
import java.sql.*;
public class DB_demo {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/employee";
		String userName="root";
		String passWord="Ismail63855";
		String query="select * from employees";
		
		
		
		
		Connection con=DriverManager.getConnection(url,userName,passWord);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()) {
		System.out.println("Id is "+ rs.getInt(1));
		System.out.println("FirstName is:"+rs.getString(2));
		System.out.println("LastName :" + rs.getString(3));
		System.out.println("MailId is:" + rs.getString(4));
		System.out.println("Joing Year:" + rs.getString(5));
		}
		
	}
	
	
}
