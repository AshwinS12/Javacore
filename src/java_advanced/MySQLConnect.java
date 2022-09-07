package java_advanced;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnect {
private static MySQLConnect msc = new MySQLConnect();

Connection connect;
private MySQLConnect() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/raw","root","ashwin2892");
	}
	catch(ClassNotFoundException e) {
		e.printStackTrace();
	}catch(SQLException e) {
		e.printStackTrace();
	}
}
public static Connection getInstance() {
	return msc.connect;
}
	public static void main(String[] args) {
		System.out.println(MySQLConnect.getInstance());
	}

}
