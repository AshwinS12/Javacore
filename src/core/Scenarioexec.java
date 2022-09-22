package core;

import java.util.*;
import java.util.stream.Collectors;

public class Scenarioexec {
int a = 0;
int b = 1;
int c = 0;
	public int factorial(int n) {
		if(n==1) {
		 return 1;
		}else {
		 return n*factorial(n-1);
		}
	}
	public void fibonacci(int n) {
		if(n>0) {
			c = a+b;
			a=b;
			b=c;
			System.out.println("fibonnaci "+ c);
			fibonacci(n-1);
		}
	}
	public void vowconscount(String n) {
		int vowcount = 0;
		int conscount = 0;
		String n1 = n.toLowerCase();
		char [] c = n1.toCharArray();
		for(int i = 0;i<c.length;i++) {
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
				vowcount++;
			}else {
				conscount++;
			}
		}System.out.println("Vowel count: "+vowcount);
		System.out.println("Consonant count: "+conscount);
	}
	public void bubblesort() {
		int ar[]= {1,2,6,5,4};
		for(int i = 0;i<ar.length;i++) {
			for(int j = 0;j<ar.length-i-1;j++) {
				if(ar[j]>ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
			}
			for(int a:ar) {
				System.out.print(a);
			}
		System.out.println();
	}
	public int binarysearch(int arr[],int l , int r , int x) {
		if(r>=l) {
			int mid = l+(r-1)/2;
			if(arr[mid]==x) {
				return mid;
			}else if(arr[mid]>x) {
				return binarysearch(arr,l,mid-1,x);
			}else {
				return binarysearch(arr,mid+1,r,x);
			}
		}
		return -1;
	}
	public void matrixcalculation() {
		int a[][]= {{1,3},{2,4}};
		int b[][]= {{3,1},{4,2}};
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
		for(int i = 0;i<b.length;i++) {
			for(int j = 0;j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}System.out.println();
	}
	int c[][]=new int [2][2];
	for(int i = 0;i<c.length;i++) {
		for(int j = 0;j<c[i].length;j++) {
			c[i][j]=a[i][j]+b[i][j];
		}
	}
	for(int i = 0;i<c.length;i++) {
		for(int j = 0;j<c[i].length;j++) {
			System.out.print(c[i][j]+" ");
		}System.out.println();
	}
	}
	public void palindromeint(int n) {
		int temp = n;
		int rev = 0;
		int sum = 0;
		while(n>0) {
			rev = n%10;
			sum = (sum*10)+rev;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}
	public void palindromestring(String n) {
		String b = n.toLowerCase();
		for(int i =0;i<n.length()/2;i++) {
			if(b.charAt(i)!= b.charAt(b.length()-i-1)){
				System.out.println("Not palindrome");
			}else {
				System.out.println("Palindrome");
			}
		}
	}
	public void repeatedletters(String n) {
		String n1 = n.toLowerCase();
		char[]c = n1.toCharArray();
		HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		for(Character z:c) {
			if(hm.containsKey(z)) {
				hm.put(z, hm.get(z)+1);
			}else {
				hm.put(z, 1);
			}
		}
		for(Map.Entry<Character,Integer>me:hm.entrySet()) {
			if(me.getValue()>1) {
			System.out.println(me.getKey()+" : "+me.getValue());
		}
		}	
	}
	public ArrayList<Integer> primenumbers(int st,int la) {
	ArrayList<Integer>al=new ArrayList<Integer>();	
		for(int n=st;n<la;n++) {
			boolean res = true;
		int az = 2;
		while(az<=n/2) {
			if(n%az==0) {
		 res = false;
		 break;
			}
			az++;
		}
	   if(res) {
		   al.add(n);
	   }
		}
		return al;
	}
	public void evenodd(int n) {
	for(int a=0;a<=n;a++) {
		HashSet<Integer>hs =new HashSet<Integer>();
		if(a%2==0) {
			hs.add(a);
			for(int g:hs) {
			System.out.println("even: "+g);
		}
		}else {
			hs.add(a);
			for(int h:hs) {
				System.out.println("odd: "+h);
			}
		}
	}
	}
	public void Squaring() {
		ArrayList<Integer>num = new ArrayList<Integer>();
		num.add(2);
		num.add(2);
		num.add(4);
		num.add(6);
		
		HashSet<String>hs = new HashSet<String>();
		hs.add("Integer");
		hs.add("Index");
		hs.add("HashSet");
		
	/*	ArrayList<Integer>sq = new ArrayList<Integer>();
		for(int i:num) {
			sq.add(i*i);
			for(int j:sq) {
				System.out.println(j);
			}
		} */
		
		Set<Integer> sqr = num.stream().map(i->i*i).collect(Collectors.toSet());
		List<Integer>sort = sqr.stream().sorted().collect(Collectors.toList());
		List<String> res = hs.stream().filter(x->x.startsWith("I")).collect(Collectors.toList());
        int p = num.stream().reduce(0,(x,y)->x+y);
      
      
      System.out.println(p);
		System.out.println(sqr);
		System.out.println(sort);
		System.out.println(res);
	
	}
	
	public static void main(String[] args) {
		Scenarioexec se = new Scenarioexec();
		System.out.println(se.factorial(4));
		se.fibonacci(4);
		se.vowconscount("this");
		se.bubblesort();
		int [] arr = {1,2,3,4,5};
		int x = 4;
		int f = se.binarysearch(arr, 0,arr.length-1, x);
		if(f!=-1) {
			System.out.println("Element "+ x+ "is at "+ f);
		}else {
			System.out.println("element not found");
		}
		se.matrixcalculation();
		se.palindromeint(121);
		se.palindromestring("mam");
		se.repeatedletters("Dictionaries");
	System.out.println(se.primenumbers(10,100));
	se.evenodd(10);
	se.Squaring();
	}

}
