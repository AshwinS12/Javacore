package java_firstmonth;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class scenario {

		int a=0;
		int b=1;
		int c=0;

		public void fibonacci(int count) {
			if(count>0) {
		c = a+b;
		a=b;
		b=c;
		System.out.println("Fibonnaci "+ c +" ");
		fibonacci(count-1);
		}
		}	

		public void palin(int n) {
			int sum=0;
			int temp = n;
			while(n>0) {
				int r = n%10;
				sum = (sum*10)+r;
				n = n/10;	
			}
			if(temp==sum) {
				System.out.println("Palindrome");
			}else {
				System.out.println("not palindrome");
			}	
		}
		public void vowcons(String st) {
			int vcount = 0;
			int ccount = 0;
			st= st.toLowerCase();
			char[]c = st.toCharArray();
			for(int i = 0;i<c.length;i++) {
				if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
					vcount++;
				}
				else if(c[i]>='a'&&c[i]<='z') {
					ccount++;
					
				}
			}
			System.out.println("Number of vowels : "+ vcount);
			System.out.println("Number of Consonants: "+ccount);
		}
		public void stgpalin(String pal) {
			boolean flag = true;
			pal = pal.toLowerCase();
			for(int i = 0;i<=pal.length()/2;i++) {
				if(pal.charAt(i)!=pal.charAt(pal.length()-i-1)) {
					flag = false;
					break;
				}
			}
				if(flag) {
					System.out.println("Palindrome");
				}else {
					System.out.println("not palindrome");
				
			}
		}
		public void repeatwords(String st) {
			int count = 0;
			st = st.toLowerCase();
			String[] str = st.split(" ");
			System.out.println("Duplicate words :");
			for(int i =0;i<str.length;i++) {
				count = 1;
				for(int j =i+1;j<str.length;j++) {
					if(str[i].equals(str[j])) {
						count ++;
						str[j]="0";
					}
				}
				if(count>1&&str[i]!="0") {
					System.out.println(str[i]);
				}
			}
		}
		public void Hashmapdupes(String pal) {
			HashMap<Character,Integer>mp = new HashMap<Character,Integer>();
			char[] ch = pal.toCharArray();
			for(Character a:ch) {
				if(mp.containsKey(a)) {
				mp.put(a,mp.get(a)+1);
				}else {
					mp.put(a, 1);
				}
			}
			for(Map.Entry<Character,Integer>me :mp.entrySet()) {
				if(me.getValue()>1) {
					System.out.println(me.getKey()+" : "+me.getValue() );
				}
			}
		}
		public void list() {
			ArrayList<String> al = new ArrayList<String>();
			al.add("this");
			al.add("is");
			al.add("that");
			al.add("was");
			Collections.sort(al);
			System.out.println("Sorted using collection sort is "+ al);
			Integer arr[]= {1,4,2,3};
			List<Integer>in = Arrays.asList(arr);
			Collections.sort(in);
			System.out.println("Sorted using Collection sort "+ in);
		}
		public void array() {
			String[]arr= {"this","that","is","was"};
			Integer[]arl = {1,5,3};
			Arrays.sort(arr);
			Arrays.sort(arl);
		}
public String Stringrev(String s) {
	int len = 0;
	String rev = "";
	char[] c = new char [s.length()];//using char arrays to split string to individual chars
	for(int i = s.length()-1;i>=0;i--) {//not used char arrays yet
		c[len] = s.charAt(i); // assigning array index with string method char at index i
		len++;
	}
	for(int i = 0;i<s.length();i++) {
		rev = rev+c[i];
	}return rev;
}
public int Intrev(int s) {
 
 int r = 0;// creating reverse variable
 int rev=0; //creating new variable to store the reversed number
 while (s>0) {
 r = s%10; // storing the remainder
 rev = (rev*10)+r;
 s=s/10;
 }return rev;
}
	
public void pattern(int s) {
	for(int i = 1;i<=s;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
		}System.out.println(" ");
	}
	for(int i=s-1;i>0;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print(j+" " );
		}System.out.println(" ");
	}
}
public void add2num() {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter first num");
		int a = sc.nextInt();
		System.out.println("Enter second num");
		int b = sc.nextInt();
		System.out.println("sum is " +(a+b));
	}
	
}
public void rand() {
	Random ran = new Random();// inbuilt function hasve to import in java
	int a =ran.nextInt(10);
	System.out.println("Random num from 0 to 10 is "+a);
}
public void dupli(String s) {
	int a = s.length();
	String characters = " ";
	String dupe = " ";
	for(int i =0;i<a;i++) {
		String ch = Character.toString(s.charAt(i));
		if(characters.contains(ch)) {
			if(!dupe.contains(ch)) {
			dupe +=ch;
			
		}
		}
		characters += s.charAt(i);
	}System.out.println(dupe + " ");
	
	HashMap<Character,Integer>hm = new HashMap<Character,Integer>();
	String ss = s.toLowerCase();
	char[] r = ss.toCharArray();
	for(Character z:r) {
		if(hm.containsKey(z)) {
			hm.put(z,hm.get(z)+1);
		}else {
			hm.put(z, 1);
		}
	}for(Map.Entry<Character,Integer>me :hm.entrySet()) {
		System.out.println(me.getKey()+ ":"+ me.getValue());
	}
}
public void age() {
LocalDate startdate =LocalDate.of(1992,5,28);
LocalDate today = LocalDate.now();
	int years = Period.between(startdate,today).getYears();
	
	System.out.println( years);
}
public ArrayList<Integer> primenos(int st , int en) {
	ArrayList<Integer> al = new ArrayList<Integer>();	
	for(int n=st;n<en;n++) {
		boolean prime = true;
      int i=2;
      while(i<=n/2) {
    	  if(n%i==0) {
    		  prime = false;
    		  break;
    	  }
    	  i++;
      } 
      if (prime) {
    	  al.add(n);
      }
		
	}
	
	return al;
}

public void minmax() {
int[] n = {12,32,9,11,31,9};
int min=n[0];
int max=n[0];
for(int i=0;i<n.length;i++) {
	if(n[i]<min) {
		min = n[i];
	}
	else if(n[i]>max) {
		max = n[i];
		
	}
}
System.out.println(" min is "+min+" max is "+max);
}
public void reverse() {
	int[]ar = {1,2,3,4,5};
	int[] rev = new int[ar.length];
	int j = 0;
	for(int i =ar.length-1;i>=0;i--) {
	rev[j] = ar[i];
	      System.out.print(rev[j]+" ");
		}System.out.println();
}
public void reversestring() {
	String a[] = {"this","that","is"};
	String rev[] = new String[a.length];
	int j =0;
	for(int i = a.length-1;i>=0;i--) {
		rev[j]=a[i];
		System.out.print(rev[j]+" ");
	}System.out.println();
}
public void currencyformatter() {
	System.out.println("Enter value for curency");
	Scanner sc = new Scanner(System.in);
	double payments = sc.nextDouble();
String Us = 	NumberFormat.getCurrencyInstance(Locale.US).format(payments);
String china = 	NumberFormat.getCurrencyInstance(Locale.CHINESE).format(payments);
String Canada =	NumberFormat.getCurrencyInstance(Locale.CANADA).format(payments);
String India =	NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payments);
	sc.close();
	System.out.println("Us "+ Us);
	System.out.println("China "+china);
	System.out.println("Canada "+Canada);
	System.out.println("India "+ India);
	
}
    public int Armstrong(int n) {
	int rev;
	int arm=0;
	int temp = n;
	while(n>0) {
		rev = n%10;
		arm = (rev*rev*rev)+arm;
		n=n/10;
	}
	if(temp==arm) {
		System.out.println("Armstrong");
	}else{
		System.out.println("Not armstrong");
	}
	return arm;
}
public void basicencdec(String a) {
	char[] b=a.toCharArray();
	for(char c:b) {
		System.out.print(c);
		c+=2;
		System.out.print(c);
	}
}
public void Squareroot(int n) {
	for(int i=0;i<=n/2;i++) {
		if(n==i*i) {
			System.out.println("Square root of "+n+" is "+i);
		}
	}
}
public void cube(int n) {
	int s = n*n*n;
System.out.println("Cube of "+n+" is "+s);
		
	}


	public static void main(String[] args) {
		scenario sc = new scenario();
		String r = sc.Stringrev("This is cool!! ");
System.out.println(r);
	    int re = sc.Intrev(123);
	    System.out.println(re);
	sc.pattern(4);
	//sc.add2num();
	sc.rand();
	sc.dupli("this is was");
	sc.age();
	System.out.println(sc.primenos(1, 100));
	sc.stgpalin("madamm");
	sc.Armstrong(153);
	sc.Squareroot(16);
	sc.cube(4);
	}
}
