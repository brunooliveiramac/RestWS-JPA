package br.com.planningpokerws.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
	
	private static final String COM_MYSQL_JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DATABASE_TEST = "projectmaster";
	private static final String URL = "jdbc:mysql://localhost:3306/"+DATABASE_TEST;
	private static final String USER = "root";
	private static final String PASSWORD = "";
	
	public static Connection getConnection() throws SQLException {
		try {
			Class.forName(COM_MYSQL_JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}

}
