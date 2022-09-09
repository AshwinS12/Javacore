package java_advanced;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gunsupload {
Connection connect;
Statement state;
ResultSet resultset;

public Gunsupload() {
	connect= MySQLConnect.getInstance();
}
	
public int InsertwithStatement(Guns g) {
	int result = 0;
	
	String query = "insert into Guns values("+ g.getId()+", '"+g.getModel()+"', '"+g.getType()+"', "+g.getQuantity()+" )";
	try {
		state = connect.createStatement();
		result = state.executeUpdate(query);
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return result;
}
public static void main(String[] args) {
	Gunsupload gun = new Gunsupload();
	Guns gn = new Guns();
 try (Scanner sc = new Scanner(System.in)) {
	System.out.println("Enter Guns id");
	gn.setId(sc.nextInt());
	sc.nextLine();
	System.out.println("Please enter Model");
	gn.setModel(sc.nextLine());
	
	System.out.println("Enter the type");
	gn.setType(sc.nextLine());
	System.out.println("Enter the quantity");
	gn.setQuantity(sc.nextInt());
}
	System.out.println("Id : Model : Type : Qty");
	HashMap<Integer,String>hm=new HashMap<Integer,String>();
	HashMap<String,Integer>hm1 = new HashMap<String,Integer>();
	hm.put(gn.getId(),gn.getModel());
	hm1.put(gn.getType(),gn.getQuantity());
	for(Map.Entry<Integer,String>me:hm.entrySet()) {
		System.out.print(me.getKey()+" : "+me.getValue()+" : ");
	}
	for(Map.Entry<String,Integer>me1:hm1.entrySet()) {
		System.out.print(me1.getKey()+" : "+me1.getValue());
	}
	


gun.InsertwithStatement(gn);
}
	

}
