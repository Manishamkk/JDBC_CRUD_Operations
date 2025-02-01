package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Student {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
     
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_connectivity","root","root");
//Dynamic values
     //	PreparedStatement pstmt = conn.prepareStatement("Insert into student(name,email,address , grade) values('Sai','sai@gamail.com','Nashik','B');");
		/*
		 * PreparedStatement pstmt = conn.
		 * prepareStatement("Insert into student(name,email,address , grade) values(?,?,?,?);"
		 * ); pstmt.setString(1, "Manisha"); pstmt.setString(2, "mk7647@gmail.com");
		 * pstmt.setString(3, "Kondha"); pstmt.setString(4,"A");
		 */
     //Phase the records
 	/*PreparedStatement pstmt = conn.prepareStatement("Select * from student where id = ?");
 	pstmt.setInt(1, 4);
 	ResultSet rs= pstmt.executeQuery();
 	while(rs.next()) {
 		System.out.println(rs.getInt("id"));
 		System.out.println(rs.getString("name"));
 		System.out.println(rs.getString("email"));
 		System.out.println(rs.getString("address"));
 		System.out.println(rs.getString("grade"));
 	}*/
     
	/*
	 * PreparedStatement pstmt =
	 * conn.prepareStatement("delete from student where id = ?"); pstmt.setInt(1,
	 * 3); int rs= pstmt.executeUpdate();
	 */
     
     //record updated
     PreparedStatement pstmt = conn.prepareStatement("update student set name = ?,email=?,address=?,grade=? where id =2");
   	pstmt.setString(1, "Sushil");
   	pstmt.setString(2,"sushil@gmail.com");
   	pstmt.setString(3, "Mumbai");
   	pstmt.setString(4, "C");
   	int rs= pstmt.executeUpdate();
		System.out.println("record updated"+rs);
		}catch(Exception e){
		e.printStackTrace();
	
    
}}
}