package java_firstmonth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {
	private static MySqlConnection mysqlconnection = new MySqlConnection();
	
	Connection connection;
	
	private MySqlConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrm","root","ashwin2892");
			/*
			String url = "jdbc:mysql://localhost:3306/hrm";
			String user="root";
			String password = "ashwin2892";
			connection = DriverManager.getConnection(url,user,password);
			*/
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static Connection getInstance() {
		return mysqlconnection.connection;
		
	}

	public static void main(String[] args) {
		System.out.println(MySqlConnection.getInstance());

	}

}
