package java_firstmonth;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Assignment30 {
int i;
static int j;
int g;
public class Member{
	int a;
	public void add() {
		System.out.println("Member");
		class Local{
			int g;
			public void function() {
				System.out.println(a+g);
			}
		}Local l = new Local();
		l.g=5;
		l.function();	
	}
}
static class Stat{
	public static void add() {
		System.out.println("This is static"+j);
	}
}
public void duplicates(String n) {
	String nn = n.toLowerCase();
	char[]a = nn.toCharArray();
	HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	for(Character i:a) {
		if(hm.containsKey(i)) {
			hm.put(i,hm.get(i)+1);
			
		}else {
			hm.put(i, 1);
		}
	}
	for(Map.Entry<Character,Integer>me:hm.entrySet()) {
		//System.out.println(me.getKey()+":"+me.getValue());
		if(me.getValue()>1) {
			System.out.println(me.getKey()+":"+me.getValue());
		}
	}
	
}
public void numpal(int n) {
	int temp = n;
	int rem = 0;
	int sum=0;
	while(n>0) {
		rem = n%10;
		sum = (sum*10)+rem;
		n=n/10;
	}
	if(temp==sum) {
		System.out.println("Palindrome");
	}else {
		System.out.println("Not palindrome");
	}
}
public void strpalin(String n) {
	String nn =n.toLowerCase();
	char[]c = nn.toCharArray();
	boolean result = true;
for(int i = 0;i<c.length/2;i++) {
	if(c[i]!=nn.charAt(nn.length()-i-1)) {
		result = false;
		break;
	}
}
	if(result) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not palindrome");
	}
}
public String weather(String n) {
	int i = 0;
	if(n.equalsIgnoreCase("Good")) {
		System.out.println("Weather is good, match will begin in 5 mins");
		i=50;
	}else if(n.equalsIgnoreCase("Bad 1")){
		System.out.println("Match delayed by an hour, Overs has been reduced by 10 overs, 30 overs per innings "); 
	i=40;
	} else if(n.equalsIgnoreCase("Bad 2")) {
	System.out.println("Match delayed by 2 hours,Overs reduced to only 20");
	i= 20;
	}
	else {
		System.out.println("Match is cancelled");
	
	}System.out.println("Overs of match is "+ i);
	return n;
}

public void innings(String h) {
	System.out.println("Brz : 200/9");
	Random rand = new Random();
	int i = rand.nextInt(300);
	
	if(i<200) {
		System.out.println(i);
		System.out.println("Team has low chance of winning");
	}else if(i>200||i<=300) {
		System.out.println(i);
		System.out.println("Near to victory");
	}
	HashMap<String,Integer> hm = new HashMap<String,Integer>();
	hm.put(h, i);
	for(Map.Entry<String,Integer>me:hm.entrySet()) {
		System.out.print(me.getKey()+" : "+me.getValue());
}
}
	
public void wickets() {
	Random rand = new Random();
	int a = rand.nextInt(10);
	System.out.println(" / "+a);
}
public void display() {
Random rand = new Random();
int a = rand.nextInt(4);
if(a==0) {
	System.out.println("Weather is good, match will begin in 5 mins");
	i=50;
}else if(a==1){
	System.out.println("Match delayed by an hour, Overs has been reduced by 10 overs, 30 overs per innings "); 
i=40;
} else if(a==2) {
System.out.println("Match delayed by 2 hours,Overs reduced to only 20");
i= 20;
}
else {
	System.out.println("Match is cancelled");

}System.out.println("Overs of match is "+ i);
}

	public static void main(String[] args) {
Assignment30 as = new Assignment30();
Assignment30.Member am = as.new Member();
am.add();
am.a =12;
as.i=15;
Stat.add();
j=5;
//Assignment30.Stat ast = new Stat();
//ast.add();
   Abc e = new Abc() {

	@Override
	public void function() {
		System.out.println("Anonymous ");
	}   
   };
   e.function();
  as.duplicates("This is a lovely day"); 
   as.numpal(121);
   as.strpalin("Madam");
   
   try (Scanner sc = new Scanner(System.in)) {
	System.out.println("Enter the weather");
	String a = sc.nextLine();
	 if( ! as.weather(a).contains("Good")||a.contains("Bad 1")||a.contains("Bad 2")){
		  System.out.println("****");
		  sc.close();
	  }
	  else {
	as.display();
       
         as.innings("Ind");
         as.wickets();  
	}
	/*
	as.weather(sc.nextLine());
	as.sleep();
    as.innings("Ind");
    as.wickets();  
    sc.close();
    */
	}
}
}