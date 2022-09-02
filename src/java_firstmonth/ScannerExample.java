package java_firstmonth;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String name = sc.nextLine();
		
		System.out.println("Name = "+name);
		
		System.out.println("Enter roll no");
		
		int i = sc.nextInt();
		
		System.out.println("Roll no = "+i);
		
		System.out.println("Enter Salary");
		
		double d = sc.nextDouble();
		
		System.out.println("Salary = "+d);
		
		sc.close();
		

	}

}
