package java_firstmonth;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Notcollections {
int a = 10;
double b = a;
int c = (int)b;


	public void scanner() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please select a number from 0 to 2");
			int no = sc.nextInt();
			switch(no) {
			case 0 :System.out.println("The number is 0");
			break;
			case 1 :System.out.println("The number is 1");
			break;
			case 2 :System.out.println("The number is 2");
			break;
			default:System.out.println("please check the number");
			}
			
		
		}catch(NoSuchElementException e) {
			System.out.println("two scanners found");
		}
}
	public static void main(String[]args) {
			System.out.println("Please enter a digit");
			try (Scanner sc = new Scanner(System.in)) {
				int s = sc.nextInt();
				if(s%2==0) {
					System.out.println("Number is even");
				}
				else if (s% 3==0) {
					System.out.println("Number is odd");
				}
				else {System.out.println("number is zero");
}
			}

	catch (InputMismatchException e) {
		System.out.println("Only digit is allowed");
	}
			Notcollections nc = new Notcollections();
			nc.scanner();
}
}
