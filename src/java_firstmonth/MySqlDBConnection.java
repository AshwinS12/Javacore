/**
 * 
 */
package java_firstmonth;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlDBConnection {
	
	static MySqlDBConnection mySQLDBInstance = new MySqlDBConnection();
	 static Connection con;
	 
	private MySqlDBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrmh", "root", "ashwin2892");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static Connection getInstance() {

		return con;
	}
	
	public static void main(String[] args) {
		System.out.println(MySqlDBConnection.getInstance());
	}
}
