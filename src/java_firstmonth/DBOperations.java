package java_firstmonth;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Scanner;

public class DBOperations {
	Connection connection;
	Statement statement;
	ResultSet resultset;
	
	public DBOperations() {
		connection = MySqlConnection.getInstance();
	}
	
	public int InsertwithStatement(Employee emp) {
		int result = 0;
		
		String query = "insert into Employee values("+ emp.getId()+", '"+emp.getName()+"', "+emp.getSalary()+", '"+emp.getAddress()+"' )";
		try {
			statement = connection.createStatement();
			result = statement.executeUpdate(query);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
public int deletedata(Employee emp) {
	int result = 0;
	String query = "delete from Employee where id = "+emp.getId()+"";
	try {
	statement = connection.createStatement();
		result = statement.executeUpdate(query);
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return result;
	
}
public int updatenumeric(Employee emp ,String opt,int val) {
	int result = 0;
	String query= "update Employee set "+opt+" = "+ val +" where id = "+emp.getId()+"";
	
	try {
	statement = connection.createStatement();
	result = statement.executeUpdate(query);
	}catch(SQLException e) {
	}return result;
}
public int updatename(Employee emp) {
	int result = 0;
	String query = "update Employee set name = 'New One' where id = "+ emp.getId()+"";
	try {
	statement = connection.createStatement();
	result = statement.executeUpdate(query);
	}catch(SQLException e) {
	}return result;
}
public int updateaddress(Employee emp) {
	int result = 0;
	String query = "update Employee set address = 'New Table' where id = "+ emp.getId()+"";
	try {
	statement = connection.createStatement();
	result = statement.executeUpdate(query);
	}catch(SQLException e) {
	}return result;
}

	public static void main(String[] args) {
		DBOperations db = new DBOperations();
		 Scanner sc = new Scanner(System.in);
		 for(;;) {                                            
		System.out.println("Please enter your choice= \n"+
		 "1.insert employee data \n"+
		"2.delete employee data\n"+
		"3.Update employee data\n");
		int n = sc.nextInt();
		Employee em = new Employee();
	
			switch(n) {
			case 1 : 
				System.out.println("Please enter emp id");
				em.setId(sc.nextInt());
				sc.nextLine();
				System.out.println("Enter name");
				em.setName(sc.nextLine());
			
				System.out.println("Enter salary");
				em.setSalary(sc.nextDouble());
				sc.nextLine();
				System.out.println("Enter Adress");
				em.setAddress(sc.nextLine());
				db.InsertwithStatement(em);
			
			break;
			case 2:
				System.out.println("Please enter id to be deleted");
				em.setId(sc.nextInt());
				db.deletedata(em);
			break;
			
			case 3:
				String opt = ""; 
				
				System.out.println("Please select the field to be updated\n"
						+ "1.id \n"+
						"2.salary\n"+"3.name\n"+"4.address\n");
		String va = "";
				int c = sc.nextInt();
				int val = 0;
				switch(c) {
			 case 1:
					opt = "id";
					System.out.println("enter new id");
					val = sc.nextInt();					
				sc.nextLine();
				System.out.println("Enter old id");
				em.setId(sc.nextInt());
				db.updatenumeric(em, opt,val);
				break;

			 case 2:
					opt = "salary";
					System.out.println("enter new salary ");
					val = sc.nextInt();
					sc.nextLine();
					System.out.println("old id");
					em.setId(sc.nextInt());
					db.updatenumeric(em, opt,val);
					break;
			
			 case 3:
			//	 System.out.println("enter new name");
				//em.setName(sc.nextLine());
	
				System.out.println("Enter old id");
				em.setId(sc.nextInt());
				db.updatename(em);
					break;
					
			 case 4:
			//	 System.out.println("Please update address");
				// opt = "address";
				// em.setAddress(sc.nextLine());
				 System.out.println("Enter old id");
				 em.setId(sc.nextInt());
				 break;
				}
				}
			}
			
			}
		 }


