package java_firstmonth;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Scenariosexec {
	int a=0;
	int b=1;
	int c =0;
	public void fibonnacci(int n ) {
		
		if(n>0) {
     	c=a+b;
		a=b;
		b=c;
		System.out.println("fibonnaci " + c );
		fibonnacci(n-1);
		}
	}
	public void palin(int n) {
		
		int rev = 0;
		int sm=0;
		int temp = n;
		while(n>0) {
			rev=n%10;
			sm = (sm*10)+rev;
			n=n/10;
		}
		if(sm==temp) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}
	public void palinstr(String s) {
		String ss = s.toLowerCase();
		boolean flag = true;
		for(int i=0;i<ss.length()/2;i++) {
			if(ss.charAt(i)!=ss.charAt(ss.length()-i-1)) {
				flag = false;
				break;
			}
		}if(flag) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
	public void vowcons(String s) {
		int vow = 0;
		int cons = 0;
		String ss = s.toLowerCase();
		char[]ch = ss.toCharArray();
	for(int i =0;i<s.length();i++) {
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
			vow ++;
		}
			else {
				cons++;
			}
		}System.out.println("Total vowels in the word : "+vow);
		System.out.println("Total consonants in word : "+cons);
	}
	public void repeatedwords(String s) {
		String ss = s.toLowerCase();
		String[]se = ss.split(" ");
		LinkedHashMap<String,Integer> hm = new LinkedHashMap<String,Integer>();
		for(String a:se) {
			if(hm.containsKey(a)) {
				hm.put(a, hm.get(a)+1);
			}else {
				hm.put(a, 1);
			}
		}
		for(Map.Entry<String,Integer>me:hm.entrySet()) {
			System.out.println(me.getKey()+" :"+ me.getValue());
		}
	}
	public void sortarr() {
		int arr[]= {1,2,5,4};
		String[] ar = {"three","zero","one","nine"};
		Arrays.sort(arr);
		Arrays.sort(ar);
		ArrayList<Integer>al = new ArrayList<Integer>();
		al.add(21);
		al.add(32);
		al.add(9);
		Collections.sort(al);
		ArrayList<String>arl = new ArrayList<String>();
		arl.add("zero");
		arl.add("one");
		arl.add("three");
		Collections.sort(arl);
		System.out.println("sorted order : "+arl);
		System.out.println("sorted order : "+ al);
	}
	public String reverstring(String s) {
		int len = 0;
		String rev = " ";
		char[]ch = new char[s.length()];
		for(int i = s.length()-1;i>=0;i--) {
			ch[len]=s.charAt(i);
			len++;
		}
		for(int i=0;i<s.length();i++) {	
			rev = rev+ch[i];
			
		}return rev;
	}
	public String revword(String s) {
		String rev =" ";
		String[] se = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=se.length-1;i>=0; i--) {
		sb.append(se[i]).append(" " );
		}	System.out.println("reverse string: "+ sb);
	return rev;
	}
	public void pattern(int n) {
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j );
				
			}System.out.println(" ");
		}
		for(int i=n;i>0;i--) {
			for(int j = 1;j<=i;j++) {
				System.out.print(j);
			}System.out.println(" ");
		}
	}
	public void add2nums() {
		try(Scanner sc = new Scanner(System.in);){
		System.out.println("Enter first num");
		int a = sc.nextInt();
		System.out.println("Enter next num");
		int b = sc.nextInt();
		System.out.println("Sum is "+(a+b));
		sc.close();
		}catch(InputMismatchException e) {
			System.out.println("Only number is supported");
		}
	}
	public void random() {
		Random r = new Random();
		int rr = r.nextInt(10);
		System.out.println(rr);
	}
	public void age() {
		LocalDate today=  LocalDate.now();
		LocalDate birth = LocalDate.of(1992,5,28);
	    int years=	Period.between(today, birth).getYears();
		System.out.println(years);
	}
	public ArrayList<Integer> primenos(int st, int en) {
	
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int n =st;n<en;n++) {
		boolean prime = true;
		int a =2;
		while(a<=n/2) {
		if(n%a==0) {
			prime = false;
			break;
		}
		a++;
		}
		if(prime) {
			al.add(n);
		}
		}
		return al;
	}
public void oddeven(int s) {
	for(int a = 0;a<s;a++) {
		if(a%2==0) {
		HashSet<Integer>hs = new HashSet<Integer>();
		hs.add(a);
		System.out.println("Even: "+a);
		
		}else  {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(a);
		System.out.println("Odd: "+a);
		
		}
	}
}
public void numtoword(int n) {
	int units;
	int tens;
	int hundreds;
	int thousands;
	if(n<0||n>9999) {
		System.out.println("Wrong input");
	}else {
	 units = n%10;
	 int ut = n/10;
	 tens = ut%10;
	 int tt= ut/10;
	 hundreds = tt%10;
	 thousands = n/1000;
	 String [] u = {" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"
	};
	 String []t = {" ","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
String h = "Hundred";
String tr = "Thousand";
if(n<20) {
	System.out.println(u[n]);
	
}else if (n>20&&n<100) {
	System.out.println(t[tens]+u[units]+" ");
}
else if(n<1000) {
	System.out.println(u[hundreds]+h+t[tens]+u[units]+" ");
}else {
	System.out.println(u[thousands]+" "+tr+" "+u[hundreds]+" "+h+" "+t[tens]+" "+u[units]+" ");
}
	}	
	}
public int factorial(int n) {
	if(n==1) {
		return 1;
	}else {

		return n*factorial(n-1);
	}
}
	public static void main(String[] args) {
		Scenariosexec sc = new Scenariosexec();
		sc.palin(123);
		sc.palinstr("Ada");
		sc.fibonnacci(4);
		sc.vowcons("this is a good day" );
	sc.repeatedwords("this is ? what is this ?");
	String z = sc.reverstring("This is great");
	System.out.println(z);
	String y = sc.revword("this is great");
	System.out.println(y);
	sc.pattern(4);
	sc.add2nums();
	System.out.println(sc.primenos(10, 100));
	sc.oddeven(100);
	sc.numtoword(9998);
	System.out.println(sc.factorial(6));
	}
// have to discuss on Con
}
