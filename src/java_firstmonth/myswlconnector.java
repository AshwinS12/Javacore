package java_firstmonth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class myswlconnector {
private static myswlconnector mysql = new myswlconnector();
Connection connection;
private myswlconnector() {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/agent","root","ashwin2892");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
public static Connection getInstance() {
	return mysql.connection;
}
	public static void main(String[] args) {
	System.out.println(myswlconnector.getInstance());

	}

}
