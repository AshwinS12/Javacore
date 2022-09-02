package java_firstmonth;

import java.util.*;
import java.util.concurrent.TimeUnit;


public class TicketBook {
public TicketBook() {
	System.out.println("Welcome to TicketBook, Your Ticket to a great movie Experience");
}
	public class Area{
		public void Area1() {
			System.out.println("Please enter your area");
		}
		public void Proper(String area) {
			String[] a = {"Hyd","Mumbai","Vij","Kolkata","Delhi","Banglore"};
			String h = Arrays.toString(a);
		for(String ab:a) {
			if(!ab.equalsIgnoreCase(area)) {
				System.out.print("Sorry we are not serving in this area,We only serve in "+h);
				break;
				}
			else 
			{
				System.out.println("The area is "+ ab);
				if(area.equalsIgnoreCase("Hyd")) {
					ArrayList<String>al = new ArrayList<String>();
				al.add("Phoenix");
				al.add("Manjeera");
				al.add("Forum");
					System.out.println("Please select a Theatre");
					for(String ac:al) {
						System.out.println(ac);
					}
				}
				break;
			}
			}
			}
	}
	public void theatres(String n) {
	System.out.println("The theatre is "+n+"Please wait while we get the shows near you");
	}
	
	public void Movies(String n) {
		String[] tel = {"KGF-2","Bimbisara","Karthikeya2","Vikram"};
		String[] hin = {"Shamshera","Rakshabandhan","Karthikeya2 hindi","Liger hindi"};
		String[]eng = {"Dr.Strange","Thor","Piratesof Carribbean","Batman"};
		if(n.equalsIgnoreCase("tel")) {
		List<String> all = Arrays.asList(tel);
		Set<String>hs = new HashSet<String>(all);
		Deque <String> dq = new ArrayDeque<String>();
		dq.addAll(hs);
		if(hs.size()>3) {
			dq.removeLast();
			System.out.println("please select a movie from the list "+ dq);
		}
		}
		else if (n.equalsIgnoreCase("hin")) {
			List<String> al = Arrays.asList(hin);
			Set<String>hs1 = new HashSet<String>(al);
			Deque <String> dq1 = new ArrayDeque<String>();
			dq1.addAll(hs1);
			if(hs1.size()>3) {
				dq1.removeLast();
				System.out.println("please select a movie from the list "+ dq1);
		}
		}
		else if (n.equalsIgnoreCase("eng")) {
			List<String> al2 = Arrays.asList(eng);
			Set<String>hs2 = new HashSet<String>(al2);
			Deque <String> dq2 = new ArrayDeque<String>();
			dq2.addAll(hs2);
			if(hs2.size()>3) {
				dq2.removeLast();
				System.out.println("please select a movie from the list "+ dq2);
			}
		}
	}
	public void show(String n) {
		System.out.println("You have selected "+ n+ "Please wait to bring seats");
	}
	public void Tickets() {
		System.out.println("Please select the row and number of seats");
		HashMap<Integer,Character>hm =new HashMap<Integer,Character>();
		for(int i =1;i<=20;i++) {
			hm.put(i, 'A');
		}
		for(Map.Entry<Integer,Character>me:hm.entrySet()) {
			System.out.print( me.getKey()+":"+me.getValue()+" ");
		}
		HashMap<Integer,Character>hm1 =new HashMap<Integer,Character>();
		System.out.println();
		for(int i =1;i<=20;i++) {
			hm1.put(i, 'B');
		}
		for(Map.Entry<Integer,Character>me1:hm1.entrySet()) {
			System.out.print( me1.getKey()+":"+me1.getValue()+" ");
		}
		HashMap<Integer,Character>hm2 =new HashMap<Integer,Character>();
		System.out.println();
		for(int i =1;i<=20;i++) {
			hm2.put(i, 'C');
		}
		for(Map.Entry<Integer,Character>me2:hm2.entrySet()) {
			System.out.print( me2.getKey()+":"+me2.getValue()+" ");
		}System.out.println();
		
		}
		public void Seats(char b,int e) {
			Random rand = new Random();
			System.out.println("Thank you for booking your movie tickets with us, Your seats are");
			while(e>0) {
			int a = rand.nextInt(20);
			System.out.print(b+""+a+" ");
			e--;
			}System.out.println();
		}
	public void combos(String n) {
		if(!n.equalsIgnoreCase("yes")) {
			System.out.println("Thank you for your purchase, enjoy the show!");
		}else {
			TreeMap<String,Integer>hm= new TreeMap<String,Integer>();
			hm.put("Fries Combo",150);
			hm.put("PopCorn Combo",250);
			hm.put("Jumbo Box",500);
			for(Map.Entry<String,Integer>me:hm.entrySet()) {
				System.out.println(me.getKey()+" "+me.getValue());
			}
			}
		}
	public void yescombo(String n) {
		Integer m = Integer.valueOf(n);
		switch(m) {
		case 1: System.out.println("Thank you for choosing FriesCombo @150/-");
		break;
		case 2:System.out.println("Thank you for choosing Popcorn Combo @250/-");
		break;
		case 3:System.out.println("Thank you for choosing JumboBox @500/-");
		}
	}
	public void sleep() {
	try {
		TimeUnit.SECONDS.sleep(1);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	public static void main(String[] args) {
    TicketBook tkb = new TicketBook();
    TicketBook.Area tba = tkb.new Area();
    try (Scanner scan = new Scanner(System.in)) {
		tba.Area1();
		tba.Proper(scan.nextLine());
		tkb.sleep();
		tkb.theatres(scan.nextLine());
		tkb.sleep();
		System.out.println("Please select the language of movie");
		tkb.Movies(scan.nextLine());
		tkb.show(scan.nextLine());
		System.out.println("Please wait to check for tickets availability");
		tkb.sleep();
		tkb.Tickets();
		tkb.sleep();
		tkb.sleep();
		tkb.Seats('A',5);
		tkb.sleep();
		System.out.println("Do you want to check out our combos");
		tkb.combos(scan.nextLine());
		tkb.sleep();
	    tkb.yescombo(scan.nextLine());
	}
}
}
