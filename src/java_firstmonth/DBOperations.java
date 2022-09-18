package java_firstmonth;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import java.util.Scanner;

public class DBOperations {
	Connection connection;
	PreparedStatement pstatement;
	ResultSet resultset;
	
	public DBOperations() {
		connection = MySqlDBConnection.getInstance();
	}
	
	public int Insertwitpreparest(EmployeeBean emp) {
		int result = 0;
		
		String query = "insert into Employee values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
		
			
			
			pstatement = connection.prepareStatement(query);
			pstatement.setString(1,emp.getEmployeeId());
			pstatement.setString(2,emp.getFirstName());
			pstatement.setString(3,emp.getLastName());
			pstatement.setString(4,emp.getFatherName());
			pstatement.setString(5,emp.getGender());
			pstatement.setString(6,emp.getDob());
			pstatement.setString(7,emp.getEmailId());
			pstatement.setLong(8,emp.getMobileNumber());
			pstatement.setString(9,emp.getCompanyName());
			pstatement.setString(10,emp.getRole());
			pstatement.setInt(11, emp.getNoticePeriod());
			pstatement.setString(12,emp.getLocation());
			pstatement.setString(13,emp.getExperience());
			pstatement.setDouble(14,emp.getCurrentCTC());
			pstatement.setDouble(15, emp.getExpectedCTC());
			pstatement.setString(16, emp.getManager());
			pstatement.setString(17,emp.getBankname());
			pstatement.setLong(18, emp.getBankAccNo());
			pstatement.setString(19,emp.getIfscCode());
			result=pstatement.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}


	public static void main(String[] args) {
		DBOperations db = new DBOperations();
		 try (Scanner sc = new Scanner(System.in)) {
			EmployeeBean em = new EmployeeBean();
					System.out.println("Please enter emp id");
					em.setEmployeeId(sc.next());
					sc.nextLine();
					System.out.println("Enter first name");
					em.setFirstName(sc.nextLine());
					System.out.println("Enter last name");
					em.setLastName(sc.nextLine());
					System.out.println("Enter father name");
					em.setFatherName(sc.nextLine());
					System.out.println("Gender");
					em.setGender(sc.nextLine());
					System.out.println("DOB");
					em.setDob(sc.nextLine());
					System.out.println("Email");
					em.setEmailId(sc.nextLine());
					System.out.println("Mob num");
					em.setMobileNumber(sc.nextLong());
					sc.nextLine();
					System.out.println("Co.name");
				em.setCompanyName(sc.nextLine());
				
				System.out.println("Role");
				em.setRole(sc.nextLine());
				System.out.println("Noticeperiod");
				em.setNoticePeriod(sc.nextInt());
				sc.nextLine();
				System.out.println("Location");
				em.setLocation(sc.nextLine());
				System.out.println("Experience");
				em.setExperience(sc.nextLine());
				System.out.println("Current CTC");
				em.setCurrentCTC(sc.nextDouble());
				sc.nextLine();
				System.out.println("Expected CTC");
				em.setExpectedCTC(sc.nextDouble());
				sc.nextLine();
				System.out.println("Manager");
			   em.setManager(sc.nextLine());
			   System.out.println("Bankname");
em.setBankname(sc.nextLine());
System.out.println("Bank ACC ");
em.setBankAccNo(sc.nextLong());
System.out.println("IFSC");
em.setIfscCode(sc.nextLine());
db.Insertwitpreparest(em);
		}
	
	}
		 }


