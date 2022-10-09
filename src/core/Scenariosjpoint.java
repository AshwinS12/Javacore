package core;

import java.util.*;

public class Scenariosjpoint {
public void fibonnaci(int n) {
	System.out.print("fibonnaci: ");
	int a = 0,b = 1;
	int c =0;
	while(n>=0) {
	 c = a+b;
		a=b;
		b=c;
		n=n-1;
		
		System.out.print(c+" ");
	}System.out.println();
}
public void primenumber(int n) {

for(int i=2;i<n/2;i++) {
	boolean flag = false;
	 if(n%i==0) {
		 flag = true;
	 }if(!flag) {
		 System.out.println("Prime is "+n);
	 }
	 }
 }
public void prime(int n) {
	boolean flag = false;
	for(int i=2;i<Math.sqrt(n);i++) {
		if(n%i==0) {
			flag = true;
		}if(!flag) {
			System.out.println("Prime is "+n);
		}
	}
}
public void palindrome(int n) {
	int rev = 0;
	int temp = n;
	int rem=0;
	while(n>0) {
		rem = n%10;
		rev = (rev*10)+rem;
		n=n/10;
	}if(temp==rev) {
		System.out.println("Palindrome");
	}
}
public void factorial(int n) {
	int temp = n;
	for(int i=n-1;i>0;i--) {
		 temp = temp*i;
	}
	System.out.println("Factorial of "+n+" is " +temp);
}
public void Armstrong(int n) {
	int temp = n;
	int rem = 0;
	int arm = 0;
	while(n>0) {
		rem = n%10;
		arm = (rem*rem*rem)+arm;
		n=n/10;
	}if(arm==temp) {
		System.out.println("Armstrong");
	}
}
public void reverse(int n) {
	int temp=n;
	int rem=0;
	int rev=0;
	while(n>0) {
		rem = n%10;
		rev = (rev*10)+rem;
		n=n/10;
	}System.out.println("Reverse of "+ temp + " is "+rev);
}
public void numbertoword(int n) {
	int un = n%10;
	int ten = n/10;
	int te = ten%10;
	//int hun = n/100;
	int hu = n/100;
	
	String unit [] = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	String tens[] = {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	String hund = "Hundred";
	if(n<1) {
		System.out.println("not supported");
	}else if(n<20) {
		System.out.println(unit[n]);
	}else if(n>20&&n<100) {
		System.out.println(tens[te]+ unit[un]);
	}else if (n>=100 && n<500) {
		System.out.println(unit[hu]+hund+tens[te]+ unit[un]);
	}
}
public void automorphic(int n) {
int sq =(n*n);
 int div = sq%100;
 if(div==n) {
	 System.out.println("Automorphic");
 }
}
public void peterson(int n) {
 
int sum = 0;
int temp = n;
while(n>0) {
	int fact = 1;
	int rem = n%10;
	for(int i=1;i<=rem;i++) {
	fact = fact*i;
	}n=n/10;
	sum = sum+fact;
}System.out.println(sum);
if(temp==sum) {
	System.out.println("peterson");
}
}
	public void sunny(int n) {
		int next = n+1;
		for(int i = 1;i<n;i++) {
			if(next==i*i) {
				System.out.println("sunny");
			}
		}
	}
	public void copyarray() {
		int []a = {1,2,3,4,5};
		int b[] = new int [a.length];
		for(int i=0;i<a.length;i++) {
			b[i]= a[i];
		System.out.print(b[i]+" ");
		}System.out.println();
	}
	public void frequency() {
		int arr[] = {1,1,2,3,3,3,4,4,5};
		int fre[] = new int[arr.length];
		int visit = -1;
		for(int i = 0;i<arr.length;i++) {
			
			int count = 1;
			for(int j =i+1;j<arr.length;j++) {
				
		if(arr[i]==arr[j]) {
		count++;
		fre[j]=visit;
		}
			}if(fre[i]!=visit) {
				fre[i]=count;
			}
		}
		for(int i = 0;i<fre.length;i++) {
			if(fre[i]!=visit) {
			System.out.println(arr[i]+" frequecy "+fre[i]);
		}
		}
		}
	
	public void leftrotation(int n) {
		int []arr = {1,2,3,4,5};
	for(int i=0;i<n;i++) {
		int j ;
		int f = arr[0];
	for( j =0;j<arr.length-1;j++) {	
		arr[j]= arr[j+1];
		
	}
	arr[j]=f;
	}
	System.out.print("Left rotation: ");
	for(int i = 0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}System.out.println();
	}
	public void dupearr() {
		int [] ar = {1,1,2,2,3,4,4,5,6};
		for(int i = 0;i<ar.length;i++) {
			for(int j = i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					System.out.print(ar[j]+" ");
				}
			}
		}System.out.println("dupes of array");
	}
	public void printelements() {
		int []arr = {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println("printing of elements");
	}
	public void matrix() {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println("printing of matrix");
		}
	}
public void  addmatrix() {
	int a[][] = {{1,2,3},{3,2,1},{4,5,6}};
	int b[][]= {{6,5,4},{1,2,3},{1,2,3}};
	for(int i = 0;i<a.length;i++) {
		for(int j = 0;j<a.length;j++) {
			
		}
	}
	for(int i=0;i<b.length;i++) {
		for(int j=0;j<b.length;j++) {
			
		}
	}
	int c[][]=new int[a.length][a.length];
	for(int i=0;i<c.length;i++) {
		for(int j =0;j<c.length;j++) {
			c[i][j]=a[i][j]+b[i][j];
			
		}
	}for(int i =0;i<c.length;i++) {
		for(int j=0;j<c.length;j++) {
			System.out.print(c[i][j]+" ");
		}System.out.println("Addition of matrix");
	}
}  
	public void diffmatrix() {
		int a[][] = {{7,9,5},{3,2,4},{4,5,6}};
		int b[][]= {{6,5,4},{1,2,3},{1,2,3}};
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a.length;j++) {
				
			}
		}
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				
			}
		}
		int c[][]=new int[a.length][a.length];
		for(int i=0;i<c.length;i++) {
			for(int j =0;j<c.length;j++) {
				c[i][j]=a[i][j]-b[i][j];
				
			}
		}for(int i =0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
				System.out.print(c[i][j]+" ");
			}System.out.println("This is diff of matrix");
		}
	}
	public void multimatrix() {
		int a[][] = {{1,2,3},{3,2,1},{4,5,6}};
		int b[][]= {{6,5,4},{1,2,3},{1,2,3}};
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a.length;j++) {
				
			}
		}
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				
			}
		}
		int c[][]=new int[a.length][a.length];
		for(int i=0;i<c.length;i++) {
			for(int j =0;j<c.length;j++) {
				c[i][j]=a[i][j]*b[i][j];
				
			}
		}for(int i =0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
				System.out.print(c[i][j]+" ");
			}System.out.println("Product of matrix");
		}
	}
	public void compare(int[][]a,int b[][],int n) {
		boolean flag = true;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n;j++) {
		if(a[i][j]!=b[i][j]) {
			flag =false;
		}
		}
			
		}if(flag) {
			System.out.println("Elements are identical");
		}else {
			System.out.println("Not identical");
		}
	
	}
	public void totalchars() {
		String a = "The best of both worlds";
		
		int no = 0;
		for(int i = 0;i<a.length();i++) {
			if(a.charAt(i)!=' ') {
					no++;	
			}	
			}System.out.println("total characters without spaces: "+no);
	}
	public void punctuationcount() {
		String c = "Hi! how are you doing? All,well.,";
		int count = 0;
		for(int i =0;i<c.length();i++) {
			if(c.charAt(i)=='!'||c.charAt(i)=='?'||c.charAt(i)=='?'||c.charAt(i)==',') {
				count++;
			}
		}System.out.println("No of punctuations is: "+count);
	}
	public void chars2strings() {
		String a = "String one";
		String b = "String two";
		//String ap = a.concat(b);
		int acount = 0;
		int bcount = 0;
		int abcount ;
		for(int i = 0;i<a.length();i++) {
			if(a.charAt(i)!=' ') {
				acount ++;
			}
			}
		for(int i = 0;i<b.length();i++) {
			if(b.charAt(i)!=' ') {
				bcount ++;
			}
			}
		abcount = acount+bcount;
		System.out.println("A count: "+acount);
		System.out.println("B count: "+bcount);
		System.out.println("Total count: "+abcount);
		}
	public void vowconscount(String n) {
		int vno = 0;
		int cno = 0;
		for(int i = 0;i<n.length();i++) {
			if(n.charAt(i)=='a'||n.charAt(i)=='e'||n.charAt(i)=='i'||n.charAt(i)=='o'||n.charAt(i)=='u') {
				vno++;
			}else if(n.charAt(i)>'a'&&n.charAt(i)<='z') {
				cno++;
			}
		}System.out.println("Vowel count: "+vno);
		System.out.println("Consonant count: "+cno);
	}
	public void anagram() {
		boolean anagram = true;
		String a = "drag";
		String b = "grad";
		char[]a1 = a.toCharArray(); 
		char[]b1 = b.toCharArray();
		if(a.length()!=b.length()) {
			anagram = false;
		}else {
	 Arrays.sort(a1);
	 Arrays.sort(b1);
	 for(int i = 0; i <a.length();i++) {
		 if(a1[i]==b1[i]) {
			anagram = true;
		 }
	 }if(anagram) {
		 System.out.println("anagram");
	 }
		}
		}
	public int LinearSearch(int arr[],int n) {
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==n) {
				return i;
			}
		}
		return -1;
	}
	public int BinarySearch(int arr[],int l , int r , int x) {
		if(l<r) {
			int mid = l+(r-l)/2;
			if(arr[mid]==x) {
				return mid;
			}else if(arr[mid]>x) {
				return BinarySearch(arr,l,mid-1,x);
			}else {
				return BinarySearch(arr,mid+1,r,x);
			}	
		}
		return -1;
	}
	public void bubble() {
		int arr[]= {3,2,1,4,5,6};
		System.out.println("Bubble sort: ");
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = 0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
			
	for(int ib:arr) {
				System.out.print(ib+" ");
	}		System.out.println();
	}
	public void selection() {
		int arr[]= {5,1,4,2,3};
		System.out.println("Selection sort: ");
		for(int i = 0;i<arr.length-1;i++) {
			int min = i;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min = j;
				}
			}
			 int temp = arr[min];
			arr[min] = arr[i];
			arr[i]= temp;
		} for(int h:arr) {
			System.out.print(h+" ");
		}System.out.println();
		}
		
	public void insert() {
		int arr[] = {1,4,2,3,5};
		System.out.println("insertion: ");
		for(int i = 0;i<arr.length;i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0&&arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
				arr[j+1]= key;
			
		}for(int k:arr) {
			System.out.print(k+" ");
		}System.out.println();
	}
	public void conversionString(String n) {
		int a = Integer.parseInt(n);
		int b = 150;
		String h = String.valueOf(b);
		String g = Integer.toString(b);
		long ab = Long.parseLong(n);
		long l = 9993939399L;
		String i = String.valueOf(l);
		String j = Long.toString(l);
		float k = Float.parseFloat(n);
		
		System.out.println("Int: "+ a);
		System.out.println("String: "+ h);
		System.out.println("String: "+ g);
		System.out.println("Long: "+ ab);
		System.out.println("String: "+ i);
		System.out.println("String: "+ j);
		System.out.println("Float: "+ k);
	}
	public void spiralpattern() {
		int n = 3;
		int size = 2*n-1;
		for(int i = 1;i<=size;i++) {
			for(int j =1;j<=size;j++) {
				System.out.print(Math.max(Math.abs(i-n),Math.abs(j-n))+1+" ");
			}System.out.println();
		}
	}
	public void starpattern(int n) {
	for(int i = 1;i<=n;i++) {
		for(int j = n;j>=1;j--) {
			if(j!=i) {
				System.out.print(j+" ");
			}else {
				System.out.print("X"+" ");
			}
		}System.out.println("");
	}
	}
	public void starpatterns(int n) {
		int j ;
		for(int i = 1;i<=n;i++) {
			for( j = 1;j<=n;j++) {
			if(i==j) {
				System.out.print("*");
			}else {
				System.out.print("0");
			}
			}j--;
			System.out.println("*");
			while(j>1) {
				if(i==j) {
					System.out.print("*");
				}else {
					System.out.print("0");
				}j--;
				
			}
			}System.out.println(" ");
	}
	public void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				System.out.print(i*j+" ");
			}
		System.out.println();
		}
}
	public void patterns(int n) {
		int i,j;
		for(i = 1;i<n;i++) {
			for(j=1;j<=n/2;j++) {
				if(i==j) {
					System.out.print(j);
				}else if(i>4&&j==n-i) {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
			}
			j=j-2;
			while(j>0) {
				if(i==j) {
					System.out.print(j);
				}else if(i>(n/2)&&j==(n-i)) {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
				j--;
			}
		System.out.println("");
	}
		}
public void Random() {
	Random rd = new Random();
	int a = rd.nextInt(5);
	System.out.println(a);
	int h = (int)Math.random();
	System.out.println(h);
}
public void star() {
	for(int i = 0;i<5;i++) {
		for(int j = 0;j<i;j++) {
			System.out.print("*");
		}System.out.println();
	}
	for(int i = 5;i>+0;i--) {
		for(int j =0;j<i;j++) {
			System.out.print("*");
		}System.out.println();
	}
	System.out.println();
	for(int i = 0;i<5;i++) {
		for(int j = 2*(5-i);j>0;j--) {
			System.out.print(" ");
		}
		for(int j = 0;j<=i;j++) {
			System.out.print("* ");
		}System.out.println();
	}System.out.println();
	for(int i = 0;i<5;i++) {
		for(int j=5-i;j>0;j--) {
			System.out.print(" ");
		}for(int j =0;j<=i;j++) {
			System.out.print("* ");
		}System.out.println();
	}
	
}
public void Technumber(int n) {
	int digits = 0;
	while(n>0) {
		digits++;
		n=n/10;
	}
	if(digits%2==0) {
		int temp = n;
		int f = temp%(int)Math.pow(10, digits/2);
		int s = temp/(int)Math.pow(10, digits/2);
		int sq = (f+s)*(f+s);
		if(n==sq) {
			System.out.println("Technumber");
		}
	}
}
public void reversearr() {
	int ar[]= {1,2,3,4,5};
	System.out.println("Original Array: ");
	for(int i = 0;i<=ar.length-1;i++) {
		System.out.print(ar[i]+" ");
	}
	System.out.println();
	System.out.println("Reverse Array: ");
	for(int i=ar.length-1;i>=0;i--) {
		System.out.print(ar[i]+" ");
	}System.out.println();
}
public void Ascii(){
	char a = 'A';
	char b = 'B';
	int ch1 = a;
	int ch2 = b;
	System.out.println(ch1+""+ch2+"");
Integer c = ch1;
Integer d = ch2;
System.out.println(c.equals(d));
}
public static boolean Fascinating(int num) {
	int [] freq = new int[10];
	String res = num +""+num*2+""+num*3;
	for(int i = 0;i<res.length();i++) {
		int digit = res.charAt(i)-'0';
		if(freq[digit]>0&&digit!=0) {
			return false;
		}else {
			freq[digit]++;
		}
	}
		for(int i=1;i<freq.length;i++) {
			if(freq[i]==0) {
				return false;
			}
		}
			return true;	
	}
public void keith(int n) {
	int temp = n;
	String h = Integer.toString(n);
	int l = h.length();
	int[]arr = new int[n];
	int i; 
	int sum;
	for(i=l-1;i>=0;i--) {
		arr[i]=temp%10;
		temp = temp/10;
	}
	i =l;sum = 0;
	while(sum<n) {
		sum = 0;
		for(int j =1;j<=l;j++) {
			sum = sum+arr[i-j];
		}
		arr[i]=sum;
		i++;
	}
	if(sum==n) {
		System.out.println("keith");
	}
}
public void neon(int n) {
	int sq = n*n;
	int sum=0;
	while (sq!=0) {
		int rev = sq%10;
		sum = sum+rev;
		sq = sq/10;
	}if(n==sum) {
		System.out.println(n+" neon");
	}
}
public void spynum(int n) {
	int sum=0;
	int product=1;
	int temp = n;
	while(temp>0) {
		int rem = temp%10;
		sum = sum+rem;
		product = product*rem;
		temp = temp/10;
	}if(sum==product) {
		System.out.println(n+" is spy number");
	}
}
public void oddevenarray() {
	int []arr = {1,2,3,4,5,6};
	for(int i =0;i<arr.length;i=i+2) {
		System.out.print("even position "+arr[i]);
	}System.out.println();
	for(int i =1;i<arr.length;i+=2) {
		System.out.print("odd position "+arr[i]);
	}System.out.println();
}
public void largest() {
	int[]arr = {10,30,22,45,90,21,2};
	int largest = arr[0];
	int smallest=arr[0];
  for(int i =0;i<arr.length;i++) {
	  if(arr[i]>largest) {
		  largest=arr[i];
	  }
	  if(arr[i]<smallest) {
		smallest =arr[i];
	  }
  }System.out.println("Largest no is "+largest);
System.out.println("smallest is "+smallest);
}
public void triangular() {
	int arr[][]= {{1,2,3},{8,6,4},{4,5,6}};
	int rows = arr.length;
	int cols = arr[0].length;
	if(rows!=cols) {
		System.out.println("should be sq");
	}else {
		for(int i = 0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(j>i) {
					System.out.print(0+" ");
				}else {
					System.out.print(arr[i][j]+" ");
				}
			}System.out.println();
		}
	}
}
	public static void main(String[] args) {
Scenariosjpoint jp = new Scenariosjpoint();
jp.fibonnaci(4);
jp.primenumber(9);
jp.primenumber(6);
jp.prime(5);
jp.palindrome(121);
jp.factorial(4);
jp.Armstrong(153);
jp.reverse(123);
jp.numbertoword(199);
jp.automorphic(25);
jp.peterson(145);
jp.sunny(80);
jp.copyarray();
jp.frequency();
jp.leftrotation(2);
jp.dupearr();
jp.printelements();
jp.matrix();	
jp.addmatrix();	
jp.diffmatrix();	
jp.multimatrix();
int a[][] = {{1,2,3},{3,2,1},{4,5,6}};
int b[][]= {{1,2,3},{3,2,1},{4,5,6}};
int n = a.length;
jp.compare(a, b, n);
jp.totalchars();
jp.punctuationcount();
jp.chars2strings();
jp.vowconscount("This is a String");
jp.anagram();
jp.bubble();
jp.selection();
jp.insert();
jp.conversionString("123");
jp.spiralpattern();
jp.starpattern(5);
jp.starpatterns(5);
jp.pattern(4);
jp.patterns(6);
jp.Random();
jp.star();
jp.Technumber(2025);
jp.reversearr();
jp.Ascii();

int arr[]= {1,2,3,4};
int s = 3;
System.out.println("the number "+s+" is at "+jp.LinearSearch(arr, s));
System.out.println("the number "+ s+" is at "+jp.BinarySearch(arr, 0, arr.length-1, s));
boolean ans = Fascinating(192);
if(ans) {
	System.out.println("is fascinating");
}
jp.keith(75);
jp.neon(9);
jp.spynum(123);
jp.oddevenarray();
jp.largest();
jp.triangular();
	}
}
