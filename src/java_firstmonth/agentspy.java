package java_firstmonth;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class agentspy {

	Connection connect;
	Statement state;
	ResultSet resultset;
	
public agentspy() {
	connect = myswlconnector.getInstance();
}
	
public int Insertstatement(Spy s) {
	int result = 0;
	String query = "insert into spy values ("+ s.getId()+",'"+s.getCodename()+"', '"+s.getMission()+"', '"+s.getTarget()+"', '"+s.getStatus()+"' )";
	try {
		state = connect.createStatement();
		result = state.executeUpdate(query);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	return result;
	
}
public int deletedata(Spy s) {
	int result = 0;
	String query = "delete from spy where id = "+s.getId();
	try {
		state = connect.createStatement();
		result = state.executeUpdate(query);
	}catch (Exception e) {
		e.printStackTrace();
	}
	return result;	
}

	public static void main(String[] args) {
	agentspy a  = new agentspy();
	try (Scanner sc = new Scanner(System.in)) {
		for(;;) {
			Spy ss = new Spy();
			System.out.println("Please select option from the following \n"+
		"1.Update query\n"+
		"2.Delete query\n");
			int j = sc.nextInt();
			switch(j) {
			case 1:
				System.out.println("Please enter the id");
			ss.setId(sc.nextInt());sc.nextLine();
			System.out.println("Please enter the codename");
			ss.setCodename(sc.nextLine());
			System.out.println("Please enter mission");
			ss.setMission(sc.nextLine());
			System.out.println("Please enter target");
			ss.setTarget(sc.nextLine());
			System.out.println("Please enter status ");
			ss.setStatus(sc.nextLine());
			a.Insertstatement(ss);
			break;
			
			case 2 :
				System.out.println("Please enter id to be deleted");
				ss.setId(sc.nextInt());
				a.deletedata(ss);
			}
		}
	}

	}

}
