package core;



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
	}
	

}
