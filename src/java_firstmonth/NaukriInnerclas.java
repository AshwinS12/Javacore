package java_firstmonth;


import java.util.*;
import java.util.Map.Entry;

public class NaukriInnerclas {
	
 private String name;
 private int age;
 private String branch;
 private char grade;
static int exp;
	
class Innerclass{
	public void edu() {
 System.out.println(grade);
 System.out.println(branch);
  	 System.out.println(name);
  	 System.out.println(age);
   }
	}
public void calculations(String tech,int exp) {
HashMap<Set<String>,Integer> hm = new HashMap<Set<String>,Integer>();
String[] aa ={"Java","C","Dotnet","Devops"};
List<String> ac = Arrays.asList(aa);
Set<String> s = new HashSet<String>(ac);

for(String i :s) {
if(i.contains(tech)!=true) {
	continue;
}
else {
	System.out.println(i);
	Set<String> ss = new HashSet<String>();
	ss.add(i);
	hm.put(ss, exp);
}
}for(Entry<Set<String>, Integer> me:hm.entrySet())	{
	System.out.println("You have selected " + me.getKey()+" "+" with experience of "+me.getValue()+" Years");
}
}
public void Ctc(int exp) {
	System.out.print("You are eligible for minimum: ");
	switch(exp) {
	case 1 : System.out.println("250000 p a");
	break;
	case 2: System.out.println("350000 p a");
	break;
	case 3 : System.out.println("450000 p a");
	break;
	case 4 : System.out.println("600000 p a");
	break;
	case 5 : System.out.println("800000 p a");
	break;
	}
	
}
	public static void main(String[] args) {
		try (Scanner scan = new Scanner (System.in)) {
			System.out.println("Please enter your details"); 
			NaukriInnerclas ou = new NaukriInnerclas();
			ou.new Innerclass();
      System.out.println("Name?");
			ou.name=scan.nextLine();
			System.out.println(ou.name);
			System.out.println("age");
			String ag = String.valueOf(ou.age);
      ag= scan.nextLine();
			System.out.println(ag);
    System.out.println("Branch of education");
   ou.branch=scan.nextLine();
   System.out.println(ou.branch);
   System.out.println("Grade");
    String ch = String.valueOf(ou.grade);
    ch = scan.nextLine();
    System.out.println(ch);
    ou.calculations("Java", 5);
    ou.Ctc(5);
    scan.close();
		}
    
	}
}
