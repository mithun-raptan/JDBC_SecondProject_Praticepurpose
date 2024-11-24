package com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectBackendUsingPGSQL {
	
	public static void main(String[] args) {
		try {
			//load the Driver class
			Class.forName("org.postgresql.Driver");
			//create Connection object
			Connection con =DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_mypractice", "postgres", "mithun");
			System.out.println(con);
			System.out.println("connected");
			//create Statement object
			Statement stmt =con.createStatement();
//			boolean b = stmt.execute("insert into bankdetails values (101,'mithun','m@g.com',123,'abc','sazu',1000),(102,'sagar','s@g.com',456,'def','toto',2000),(103,'abhijit','a@g.com',789,'ghi','sokhi',3000)");
			boolean b =stmt.execute("insert into bankdetails values(104,'mithunraptan','m@g.com',345,'def','noone',1001)");
			System.out.println(b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
