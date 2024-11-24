package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchDataFromPGSQL {
				public static void main(String[] args) {
					try {
						Class.forName("org.postgresql.Driver");
						Connection cnn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_mypractice","postgres","mithun");
						System.out.println("connected");
						Statement stmt  = cnn.createStatement();
						boolean b =stmt.execute("select * from bankdetails"); //for 'select' query execute() returns 'true'
						if(b){
							ResultSet rs = stmt.getResultSet();
							
							while(rs.next()) {
								int accountNumber =rs.getInt(1);
								String name  = rs.getString("name");
								System.out.println(accountNumber + " "+ name);
							}
						}
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
}
