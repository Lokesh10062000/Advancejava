package com.dl.one;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Eg1 {
   
	public static void main(String[]args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver connected");
		} catch (SQLException e) {
			
			System.out.println("cath"+e);
		}
	}
}
