package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchRecordBasedOnAcc {
	
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con =DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_mypractice","postgres","mithun");
			Statement stmt = con.createStatement();
			boolean b =stmt.execute("select * from bankdetails where account_number=101");
			if(b) {
				ResultSet rs =stmt.getResultSet();
				while(rs.next()) {
					int accountNumber = rs.getInt(1);
					String name  = rs.getString(2);
					String email = rs.getString(3);
					String password = rs.getString(4);
					String address = rs.getString(5);
					String nominee = rs.getString(6);
					int amount =  rs.getInt(7);
					System.out.println(accountNumber + " "+name+" "+ email+" "+ password+" "+address+" "+nominee+" "+ amount);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
