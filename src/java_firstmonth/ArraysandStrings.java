package java_firstmonth;

public class ArraysandStrings {
public void Stringman(String st) {
	String str = "This is a String";
	System.out.println(str.charAt(1));
	System.out.println(str.concat(st));
	System.out.println(str.compareTo(st));
	System.out.println(str.endsWith("ing"));
	System.out.println(str.contains("is"));
	System.out.println(str.contentEquals(st));
	System.out.println(str.matches(st));
	System.out.println(str.indexOf("a"));
	System.out.println(str.replace('T', 'K'));
	System.out.println(str.substring(0, 4));
	System.out.println(str.toUpperCase());
	
}

public int bubblebinary(int []a,int l , int r , int x) {
	
for(int i = 0;i<a.length-1;i++) {
	for(int j = 0;j<a.length-i-1;j++) {
		//always use array[index] and array[index+1] to compare
		if(a[j]>a[j+1]) {
			int temp = a[j];
			a[j] =a [j+1];
			a[j+1]=temp;
		}
	}
} 
 if(r>=l) {
	int mid = l+(r-1)/2;
	 if(a[mid] == x) {
	return mid;
	 }
	 else if(a[mid]>x) {
		return bubblebinary(a,l,mid-1,x);
	 }
	 else {
		 return bubblebinary(a,mid+1,r,x); 
	 }
 }
 return -1;
}
public void matrixmul() {
int[][]a = {{1,2,3},{4,5,6},{7,8,9}};
int[][]b = {{9,8,7},{6,5,4},{3,2,1}};
System.out.println("First array");
for(int i = 0;i<a.length;i++) {
	for(int j =0;j<a[i].length;j++) {
		System.out.print(a[i][j]+" ");
	}System.out.println();
}
System.out.println("Second array");
for(int i=0;i<b.length;i++) {
	for(int j =0;j<b[i].length;j++) {
		System.out.print(b[i][j]+" ");
	}System.out.println();
}
System.out.println("Multiplication array ");
int c [][]=new int [3][3];
for(int i = 0;i<c.length;i++) {
	for(int j = 0;j<c[i].length;j++) {
		c[i][j]=a[i][j]*b[i][j];
	}
} for(int i = 0;i<c.length;i++) {
	for(int j = 0;j<c[i].length;j++) {
System.out.print(c[i][j]+" ");
}System.out.println();
}
}

public int bubinary(int ab[],int l , int r ,int x) {

	for(int i = 0;i<ab.length;i++) {
		for(int j =0;j<ab.length-i-1;j++) {
			if(ab[j]>ab[j+1]) {
				int temp = ab[j];
				ab[j]=ab[j+1];
				ab[j+1]=temp;
			}
		}
	}
	for(int y:ab) {
		System.out.print(y+"");
	}
	System.out.println();
	if(r>=l) {
		int mid = l+(r-l)/2;
		if(ab[mid]==x) {
			return mid;
		}else if(ab[mid]>x) {
			return bubinary(ab,l,mid-1,x);
		}else {
			return bubinary(ab,mid+1,r,x);
		}
	}
	return -1;
}

	public static void main(String[] args) {
	ArraysandStrings as = new ArraysandStrings();
	as.Stringman("This is cool");
	as.matrixmul();
	int[] ab = {9,1,5,2,4,8};
	int []a = {1,2,3,4,5,6};
	int e = 5;
	int f = as.bubblebinary(a,0,a.length-1,e);
	System.out.println("Element "+ e+" is at "+f);
	
	int el = 5;
	int fo = as.bubinary(ab,0,ab.length-1,el);
	
		System.out.println("element "+el+" is at "+fo);
	}
	}


