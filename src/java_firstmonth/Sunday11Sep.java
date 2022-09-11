package java_firstmonth;

import java.util.*;

public class Sunday11Sep {
int a = 0;
int b = 1;
int c =0;
	
public Sunday11Sep() {
	System.out.println("this is a constructor");
}
public boolean ArraysandStrings() {
	String[]aa = {"1A","2B","3C"};
	//String a = "ASDF";
	String b = String.join(" ", aa);// converts array to string
	System.out.println(b);
	String q = "this";
	String q1 = q.toLowerCase();
	String p = "shit";
	String p1 = p.toLowerCase();
	char[]ch = q1.toCharArray();
	char[]ch1 = p1.toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch);
	String h = "this";
	String rev = "";
	for(int ii = h.length()-1;ii>=0;ii--) {
	 rev = rev + h.charAt(ii);
	}
	System.out.println(rev);
	String z = "this is a good one";
	char[]l=z.toCharArray();
	HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	for(char m:l) {
		if(hm.containsKey(m)) {
			hm.put(m,hm.get(m)+1);
		} else {
			hm.put(m,1);
		}
	}
	for(Map.Entry<Character,Integer>me:hm.entrySet()) {
		System.out.println(me.getKey()+" "+me.getValue());
	}
	return Arrays.equals(ch,ch1);
}
public int BinarysearchArrays(int arr[],int l , int r,int x) {
	for(int i = 0;i<arr.length;i++) {
		for(int j = 0 ;j<arr.length-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}	
		}
	if(r>=l) {
		int mid = l+(r-l)/2;
		if(x == arr[mid]) {
			return mid;
		}else if(arr[mid]>x) {
		return BinarysearchArrays(arr, l, mid-1, x);
		}else {
			return BinarysearchArrays(arr,mid+1,r,x);
		}
	
}
	return -1;
}
public ArrayList<Integer> collection(int s, int e) {
	ArrayList<Integer>ae = new ArrayList<Integer>();
	for(int n = s ;n<=e;n++) {
		boolean re = true;
		int l = 2;
	while(l<=n/2) {
		if(n%l==0) {
			re = false;
			break;
		}
		l++;
	}if(re) {
		ae.add(n);
	}
	}
	return ae;
	
}
public void fibonacci(int n) {
	if(n>0) {
c = a+b;
a = b;
b = c;
System.out.println(" fibonacci "+ c);
fibonacci(n-1);
}
}
public void squareroot(int n) {
	for(int i = 0;i<n;i++) {
		if(n==i*i) {
			System.out.println("sq root of "+ n +"is"+i);
		}
	}
}

public void Armstrong(int n) {
	int temp = n;
	int a = 0;
	while(n>0) {
	int rem = n%10;
	a = (rem*rem*rem)+a;
	n=n/10;
	}
	if(temp==a) {
		System.out.println("Armstrong");
	}
}
public int factorial(int n) {
	if(n==1) {
		return 1;
	}else {
	return n*factorial(n-1);
}
}
public void palint(int n) {
	int temp = n;
	int rev = 0;
	int re = 0;
	while(n>0) {
		 rev = n%10;
		re =(re*10)+ rev;
		n=n/10;
	}if(temp==re) {
		System.out.println("Palindrome");
	}

}
public void palinstring(String s) {
	boolean flag = true;
	for(int i =0;i<s.length()/2;i++) {
		if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
			flag = false;
			break;
		}
	}
		if(flag) {
			System.out.println("Palindrome");
		}
	}

	public static void main(String[] args) {
		Sunday11Sep s = new Sunday11Sep();
		s.ArraysandStrings();
		int arr[]= {1,9,2,8,3,7,5};
		int e = 3;
	int f=	s.BinarysearchArrays(arr, 0,arr.length-1, e);
	for(int ii :arr) {
		System.out.print(ii + " " );
	}System.out.println();
	if(f!=1) {
		  System.out.println("Element "+e+ " is at "+f);
	  }
	  else {
		  System.out.println("Element not found");
	  }
	System.out.println(s.collection(0,100));
	s.fibonacci(5);
	s.squareroot(4);
	s.Armstrong(153);
	System.out.println(s.factorial(5));
	s.palint(121);
	s.palinstring("hadah");
	}

}
