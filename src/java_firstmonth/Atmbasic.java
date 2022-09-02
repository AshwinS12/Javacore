package java_firstmonth;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Atmbasic {

	static class basic{
		public void login() {
		System.out.println("Please insert your card");
		}
		public void pin() {
			System.out.println("Please enter your pin");
			
		}
		public void language() {
			System.out.println("Please select your prefered language");
			Hashtable<Integer,String>ht = new Hashtable<Integer,String>();
			ht.put(1, "English");
			ht.put(2,"Hindi");
			ht.put(3, "Telugu");
			for(Map.Entry<Integer,String>me:ht.entrySet()) {
				System.out.println(me.getKey()+":"+me.getValue());
			}
		}
	}
	
	public void Options() {
		HashMap<Integer,String>dis=new HashMap<Integer,String>();
		dis.put(1, "Withdraw money");
		dis.put(2, "Deposit Money");
		dis.put(3,"Balance Enquiry");
	for(Map.Entry<Integer,String>me :dis.entrySet()) {
		System.out.println(me.getKey()+" : "+me.getValue());
	}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Atmbasic at = new Atmbasic();
	Atmbasic.basic in = new basic();
		try (Scanner sc = new Scanner(System.in)) {
			in.login();
			sc.next();
			in.pin();
			sc.next();
			in.language();
			int b = Integer.parseInt(sc.next());
			if(b==1) {
			System.out.println("Thank you for selecting default language English");
			}else {
				System.out.println("Sorry only English is available at the moment");
			}
			TimeUnit.SECONDS.sleep(1);
	    at.Options();
	    
	  System.out.println("Please select an option");
	   int a = Integer.parseInt(sc.next());
	   if(a==1) {
		   System.out.println("Enter the amount");
		   sc.next();
		   System.out.println("Processing");
		   TimeUnit.SECONDS.sleep(1);
		   System.out.println("Money deposited successfully");
	   }
	   else if(a==2) {
		   System.out.println("Enter the amount to deposit");
	    	sc.next();
	    	System.out.println("Processing");
	    	TimeUnit.SECONDS.sleep(1);
	    	System.out.println("Amount deposited successfully");
	   }
	    else if(a==3) {
	    	System.out.println("Checking for balance, Please wait....");
	        TimeUnit.SECONDS.sleep(1);
	        System.out.println("Your Balance is Rs  $$$$$$$");
	    }else {
	    	System.out.println("Timeout, Please try again");
	    }
	   sc.close();
	}
		
	}

}
