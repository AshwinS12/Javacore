package core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.w3c.dom.Node;

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
	public void conversionString() {
		String n = "123";
		int a = Integer.parseInt(n);
		int b = 150;
		String h = String.valueOf(b);
		String g = Integer.toString(b);
		long ab = Long.parseLong(n);
		long l = 9993939399L;
		String i = String.valueOf(l);
		String j = Long.toString(l);
		float k = Float.parseFloat(n);
		String m = String.valueOf(k);
		String s = "123.345";
		double d = Double.parseDouble(s);
		String d1 = String.valueOf(d);
		Date date = Calendar.getInstance().getTime();
		String dateform = date.toString();
		String dateform1 = "12/12/2020";
		try {
			Date date1 = new SimpleDateFormat().parse(dateform1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

		System.out.println("Int: "+ a);
		System.out.println("String: "+ h);
		System.out.println("String: "+ g);
		System.out.println("Long: "+ ab);
		System.out.println("String: "+ i);
		System.out.println("String: "+ j);
		System.out.println("Float: "+ k);
		System.out.println("date "+dateform);
		System.out.println("String "+dateform1);
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
	public void uptrian() {
		int arr[][]= {{1,2,3},{8,6,4},{4,5,6}};
		int rows = arr.length;
		int col = arr[0].length;
		if(rows!=col) {
			System.out.println("error in input");
		}else {
			for(int i =0;i<rows;i++) {
				for(int j =0;j<col;j++) {
					if(i>j) {
						System.out.print(0+" ");
					}else {
						System.out.print(arr[i][j]+" ");
					}
				}System.out.println();
			}
		}
	}
	public void frequencyoddeven() {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int even = 0;
		int odd = 0;
		int rows = arr.length;
		int col = arr[0].length;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				if(arr[i][j]%2==0) {
					even ++;
				}else {
					odd++;
				}
			}
		}System.out.println("Frequency of even is "+even+" and odd is "+ odd);
	}
	public void productmatrix() {
		int arr[][]= {{1,3,2},{3,1,1},{1,2,2}};
		int are[][]= {{2,1,1},{1,0,1},{1,3,1}};
		int row1 = arr.length;
		int col1 = arr[0].length;
		int row2 = are.length;
		int col2= are[0].length;
		if(row1!=col2) {
			System.out.println("error in input");
		}else {
			int prod[][]= new int[row1][col2];
			for(int i=0;i<row1;i++) {
				for(int j=0;j<col2;j++) {
					for(int k=0;k<row2;k++) {
						prod[i][j]=prod[i][j]+arr[i][k]*are[k][j];	
					}
				}
			}for(int i=0;i<row1;i++) {
				for(int j =0;j<col2;j++) {
					System.out.print(prod[i][j]+" ");
				}System.out.println();
			}
		}
	}
	public void rowcolsum() {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int row = arr.length;
		int col = arr[0].length;
		int rowsum=0;
		int colsum=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				rowsum=rowsum+arr[i][j];
			} System.out.println("row sum for "+(i+1)+" = "+rowsum);
		}
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				colsum=colsum+arr[j][i];
			}System.out.println("col sum for "+(i+1)+" = "+colsum);
		}
	}
	public void Npartssring() {
		String a="aaaabbbbccccdddd";
		int n=4;
		int temp=0;
		int len = a.length();
		int chars = len/n;
		String[]arr= new String[n];
		if(len%n!=0) {
			System.out.println("error , cant divide");
		}else {
			for(int i=0;i<len;i=i+chars) {
				String part = a.substring(i,i+ chars);
				arr[temp] = part;
				temp++;
			}System.out.println("equal parts are :");
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public void substrings() {
		String a = "AND";
		int len = a.length();
		int temp=0;
		String []s = new String[len*(len+1)/2];
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				s[temp]=a.substring(i,j+1);
				temp++;
			}
		}for(int i =0;i<s.length-1;i++) {
			System.out.println( s[i]);
		}
	}
	public int longestsubseq() {
		String a = "AABBCSDBAB";
		int l = a.length();
		int [][]h =new int[l+1][l+1];
		for(int i=1;i<=l;i++) {
			for(int j=1;j<=l;j++) {
				if(a.charAt(i-1)==a.charAt(j-1)&&i!=j) {
					h[i][j]=1+h[i-1][j-1];
				}else {
					h[i][j]=Math.max(h[i][j-1],h[i-1][j]);
				}
			}
		}
		return h[l][l];
	}

	public void permute(String b,int l,int r) {
		if(l==r) {
			System.out.println(b);
		}else {
			for(int i=l;i<=r;i++) {
				b=swap(b,l,i);
				permute(b,l+1,r);
				b=swap(b,l,i);
			}
		}
	}
	public String swap(String a, int i, int j) {
		char temp;
		char[]ch = a.toCharArray();
		temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		return String.valueOf(ch);
	}
	public void whitespace() {
		String a="This is a String";
		String b = a.replaceAll(" ","");
		System.out.println(b);
	}
	public void Autographic() {
		int n = 21200;
		String a = Integer.toString(n);
		int number = a.length();
		int sum = 0;
		while(n>0) {
			int rev = n%10;
			sum+=rev;
			n=n/10;
		}if(sum==number) {
			System.out.println("Autographic");
		}
	}
	public boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if( n%i==0) {
				return false;
			}
		}
		return true;
	}
	public boolean isRev(int n) {
		if(isPrime(n)==false) {
			return false;
		}int rem = 0;
		int rev = 0;
		while(n>0) {
			rem = n%10;
			rev = rev*10+rem;
			n=n/10;
		}
		return isPrime(rev);
	}
	public void Buzz(int n) {
		int temp = n;
		int rem = temp%10;
		if(n%7==0||rem==7) {
			System.out.println("Buzz");
		}
	}
	public void sumarray() {
		int arr[]= {1,2,3,4,5};
		int sum=0;
		for(int i =0;i<arr.length;i++) {
			sum+=arr[i];
		}System.out.println(sum);
	}
	public void Rightrotation() {
		int arr[]= new int[]{1,2,3,4,5};
		int n = 3;

		for(int i=0;i<n;i++) {
			int j,last;
			last = arr[arr.length-1];
			for(j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=last;
			System.out.println();
		}

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
	public void ascend() {
		int arr[]= {1,4,2,3,5};
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]);
		}System.out.println();
		for(int j=arr.length-1;j>=0;j--) {
			System.out.print(arr[j]);
		}System.out.println();
	}
	public void Transpose() {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int row = arr.length;
		int col = arr[0].length;
		int t[][]= new int[col][row];
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				t[i][j]=arr[j][i];
			}
		}for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(t[i][j]+" ");
			}System.out.println();
		}
	}
	public void identitymatrix() {
		boolean flag = true;
		int matrix[][]= {{1,0,0},{0,1,0},{0,0,1}};
		int row = matrix.length;
		int col = matrix[0].length;
		if(row!=col) {
			System.out.println("error in matrix");
		}else {
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					if(i==j&&matrix[i][j]!=1) {
						flag=false;
						break;
					}
					if(i!=j&&matrix[i][j]!=0) {
						flag = false;
						break;
					}
				}
			}
			if(flag) {
				System.out.println("given matrix is identity");
			}
		}
	}
	public void Sparsematrix() {
		int a[][]= {{4,0,0},{0,5,0},{0,0,6}};
		int count = 0;
		int row = a.length;
		int col = a[0].length;
		int size = row*col;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(a[i][j]==0) {
					count++;
				}
			}
		}
		if(count>size/2) {
			System.out.println("yes");
		}
	}
	public void Stringprog() {
		String s = "Great Power";
		StringBuffer buff = new StringBuffer(s);
		for(int i=0;i<s.length();i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				buff.setCharAt(i,Character.toLowerCase(s.charAt(i)));
			}else if(Character.isLowerCase(s.charAt(i))) {
				buff.setCharAt(i,Character.toUpperCase(s.charAt(i)));	
			}
		}
		System.out.println("New conversion is "+buff);
		String ss = s.replace(" ", "*");
		System.out.println(ss);
	}
	public boolean Duck(int n) {

		while(n!=0) {
			if(n%10==0){
				return true;
			}n=n/10;
		}
		return false;
	}
	public int Krishnamurthy(int n) {
		int f=1;
		while(n!=0) {
			f=f*n;
			n--;
		}
		return f;
	}
	public boolean digitfact(int n) {
		int temp=n;
		int sum=0;
		while(temp!=0) {
			sum+=Krishnamurthy(temp%10);
			temp=temp/10;
		}
		return (sum==n);
	}
	public boolean  increasing(int n) {
		boolean flag = true;
		String g = String.valueOf(n);
		char digit;
		for(int i = 0;i<g.length()-1;i++) {
			digit = g.charAt(i);
			if(digit>g.charAt(i+1)) {
				flag = false;
				break;
			}

		}
		return flag;
	}
	public boolean  decreasing(int n) {
		boolean flag = true;
		String g = String.valueOf(n);
		char digit;
		for(int i = 0;i<g.length()-1;i++) {
			digit = g.charAt(i);
		 	if(digit<g.charAt(i+1)) {
				flag = false;
				break;
			}

		}
		return flag;
	}
	public static int rever(int n) {
		String l=" ";
		String g = Integer.toString(n);
		for(int k =g.length()-1;k>=0;k--) {
			l = l +g.charAt(k);
		}
		int rev = Integer.parseInt(g);
		return rev;
	}
	public void Mystery(int n) {
		for(int i =1;i<=n/2;i++) {
			int j = rever(i);
			if(i+j==n) {
				System.out.println("Mystery"+n+" "+i+" "+j);
			}
		}
	}
	public void Thirdmax() {
		int arr[]= {1,5,6,10,9,7,4,3,13,15};
		Arrays.sort(arr);
		int l = arr.length;
		int min = arr[0];
		int max = arr[0];
		System.out.println("Third largest number is "+arr[l-3]);
		System.out.println("Second largest number is "+arr[l-2]);
		System.out.println("Largest number is "+arr[l-1]);
		for(int i=0;i<l;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}if(arr[i]>max) {
				max = arr[i];
			}
		}System.out.println("Min is "+ min+" Max is "+max);
	}
	public static int removedupes(int []ar,int n) {
		if(n==0||n==1) {
			return n;
		}int temp[]= new int [n];
		int j = 0;
		for(int i=0;i<n-1;i++) {
			if(ar[i]!=ar[i+1]) {
				temp[j++]=ar[i];
			}
		}temp[j++]=ar[n-1];
		for(int i=0;i<j;i++) {
			ar[i]=temp[i];
		}
		return j;
	}
	public void evenoedd() {
		int arr[]= {1,2,3,4,5,6};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("even: "+arr[i]);
			}else {
				System.out.println("odd: "+arr[i]);
			}
		}
	}
	public void strpalindrome(String n) {
		for(int i = 0;i<n.length()-1/2;i++) {
			if(n.charAt(i)!=n.charAt(n.length()-1-i)) {
				System.out.println("not palindrome");
			}
		}
	}
	public void rotatestring() {
		String a = "abcde";
		String b = "deabc";
		
		 if(a.length()!=b.length()) {
			 System.out.println("Error in input");
		 }else {
			 String c = a.concat(a);
			 if(c.contains(b)) {
				 System.out.println("Rotation found");
			 }
		 }
	}
	public void Maxminocc() {
		String n = "The grass is greener ";
		int fre[]= new int[n.length()];
		char minch = n.charAt(0);
		char maxch = n.charAt(0);
		int i ,j,min,max;
		char[]chst=n.toCharArray();
		for(i=0;i<chst.length;i++) {
			fre[i]=1;
			for(j=i+1;j<chst.length;j++) {
				if(chst[i]==chst[j]&&chst[i]!=' '&&chst[i]!='0') {
					fre[i]++;
					chst[j]='0';
				}
			}
		}
		min=max=fre[0];
		for(i=0;i<fre.length;i++) {
			if(min>fre[i]&&fre[i]!='0') {
				min=fre[i];
				minch=chst[i];
			}
			if(max<fre[i]&&fre[i]!='0') {
				max=fre[i];
				maxch=chst[i];
			}
		}
		System.out.println("Max char "+maxch+" "+max);
		System.out.println("Min char "+minch+" "+min);
	}
public void Revstring() {
	String a = "Dinosaur is a big animal";
	String rev = " ";
	for(int i=a.length()-1;i>=0;i--) {
		rev = rev+a.charAt(i);
	}System.out.println(rev);
}
public void dupchar() {
	String st="Dinosaur is a big animal";
	int count ;
	char[] ch = st.toCharArray();
	System.out.println("Duplicate elements: ");
	for(int i=0;i<ch.length;i++) {
		count=1;
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]&&ch[i]!=' ') {
				count++;
				ch[j]='0';
			}
		}
		if(count>1&&ch[i]!='0') {
			System.out.print(ch[i]+" ");
		}
	}System.out.println();
}
public void dupestr() {
	String st = "Big black big butter big";
	int count;
	String[] word = st.split(" ");
	System.out.println("Duplicate :");
	for(int i=0;i<word.length;i++) {
		count = 1;
		for(int j = i+1;j<word.length;j++) {
			if(word[i].equals(word[j])){
				count++;
				word[j]="0";
			}
		}if(count>1&&word[i]!="0") {
			System.out.println(word[i]);
		}
	}
}
public void freqchars() {
	String st = "picture perfect";
	int fre[]= new int[st.length()];
	int i,j;
 char[] ch = st.toCharArray();
 for( i=0;i<ch.length;i++) {
	 fre[i]=1;
	 for(j=i+1;j<ch.length;j++) {
		 if(ch[i]==ch[j]) {
			 fre[i]++;
			 ch[j]='0';
			 
		 }
	 }
 }System.out.println("Freq: ");
 for(i=0;i<fre.length;i++) {
	 if(ch[i]!=' '&&ch[i]!='0') {
		 System.out.println(ch[i]+" - "+fre[i]);
	 }
 }
}
public void smallarge() {
	String st = "Hard work is Hardwork";
	String word = "",small="",large="";
	String[] words= new String[100];
	int length=0;
	st = st+" ";
	for(int i=0;i<st.length();i++) {
		if(st.charAt(i)!=' ') {
			word = word+st.charAt(i);
		}else {
			words[length]=word;
			length++;
			word="";
		}
	}small = large=words[0];
	for(int k = 0;k<length;k++) {
		if(small.length()>words[k].length()) {
			small = words[k];
		}if(large.length()<words[k].length()) {
			large=words[k];
		}
	}System.out.println("Small: "+small);
	System.out.println("Large: "+large);
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
		//jp.conversionString();
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
		jp.frequencyoddeven();
		int arr[]= {1,2,3,4};
		int s = 3;
		System.out.println("the number "+s+" is at "+jp.LinearSearch(arr, s));
		System.out.println("the number "+ s+" is at "+jp.BinarySearch(arr, 0, arr.length-1, s));
		boolean ans = Fascinating(192);
		if(ans) {
			System.out.println("is fascinating");
		} jp.substrings();
		jp.keith(75);
		jp.neon(9);
		jp.spynum(123);
		jp.oddevenarray();
		jp.largest();
		jp.triangular();
		jp.uptrian();
		jp.productmatrix();
		jp.rowcolsum();
		jp.Npartssring();
		System.out.println("longest rpeating sequence is "+jp.longestsubseq());
		String st = "ABC";
		int no=st.length();
		jp.permute(st, 0, no-1);
		jp.whitespace();
		jp.Autographic();
		int num = 79;
		if(jp.isRev(num)) {
			System.out.println("Emrip number ");
		}
		jp.Buzz(42);
		jp.sumarray();
		jp.Rightrotation();
		jp.ascend();
		jp.Transpose();
		jp.identitymatrix();
		jp.Sparsematrix();
		jp.Stringprog();
		jp.Thirdmax();
		jp.Mystery(154);
		num = 1020;
		if(jp.Duck(num)) {
			System.out.println(num + " IS duck No.");
		} int nu=145;
		if(jp.digitfact(nu)) {
			System.out.println("Krishnamurthy number");
		}
		int nom=1231;
		if(jp.increasing(nom)||jp.decreasing(nom)||nom<101) {
			System.out.println("not bouncy");
		}else {
			System.out.println("bouncy");
		}
	 int ar[]= {1,2,1,2,3,4,5,1,9};
	 Arrays.sort(ar);
	 int len = ar.length;
	 len = jp.removedupes(ar, len);
	 for(int i=0;i<len;i++) {
		 System.out.print(ar[i]+" ");
	 }
	 jp.evenoedd();
	 jp.strpalindrome("madam");
	 jp.rotatestring();
	 jp.Maxminocc();
	 jp.Revstring();
	 jp.dupchar();
	 jp.dupestr();
	 jp.freqchars();
	 jp.smallarge();
	}
}
