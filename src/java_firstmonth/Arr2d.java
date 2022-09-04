package java_firstmonth;

public class Arr2d {
	
	public void arr2d() {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{9,8,7},{6,5,4},{3,2,1}};
		for(int i =0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");	
			}
			System.out.println();
		}
		
		for(int i = 0;i<b.length;i++) {
			for(int j = 0;j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		int[][]c = new int [3][3];
		for(int i = 0;i<c.length;i++) {
			for(int j = 0;j<c[i].length;j++) {
		 c[i][j]= a[i][j]+b[i][j];
			}
		 System.out.println();
			}
		for(int i = 0;i<c.length;i++) {
			for(int j = 0;j<c[i].length;j++) {
		 System.out.print(c[i][j]+" ");
			}System.out.println();
			}
	}	

public void bubble(int[]arr) {
	for(int i = 0;i<arr.length-1;i++) {
		for(int j = 0 ;j<arr.length-i-1;j++) {
		if(arr[j+1]<arr[j]) {
			int temp = arr[j+1];
			arr[j+1]=arr[j];
			arr[j]=temp;
		}
		}
	}
}
public void selection(int[]arr) {
	for(int i =0;i<arr.length-1;i++) {
		int minval = i;
		for(int j =i+1;j<arr.length-1;j++) {
			if(minval>arr[j]) {
			minval = j;
			}
		}
		int temp = arr[minval];
		arr[minval]=arr[i];
		arr[i]=temp;
		
	}
}
public void insert(int []arr) {
	for(int i =0;i<arr.length-1;i++) {
		int key = arr[i];
		int j = i-1;
		while(j>=0&&arr[j]>key) {
			arr[j+1]=arr[j];
			j=j-1;
		}
		arr[j+1]=key;
	} 
}
public static int LinSearch(int[] arr1,int e) {
	int id = -1;
	for(int i=0;i<arr1.length-1;i++) {
		if(e ==arr1[i]) {
			id = i;
			break;
			
		}
	} return id;
}
public int BinarySearch(int []arr2,int l,int r,int x) {
	
	if(r>=l) {
		int mid = l+(r-l)/2;
		//if element is mid
	if(arr2[mid]==x) {
		return mid;
	}
	else {
		//if element left
		if(arr2[mid]>x) {
			return BinarySearch(arr2,l,mid-1,x);
		}
		else {
			//if element right
			return BinarySearch(arr2,mid+1,r,x);
		}
	}
	
}// no element
	return -1;
	}
public int binary(int are[],int l, int r,int x) {

	for(int i = 0;i<are.length;i++) {
		for(int j = 0;j<are.length-i-1;j++) {
			  if(are[j]>are[j+1]) {
				  int temp = are[j];
				  are[j]=are[j+1];
				  are[j+1]=temp;
			  }
		}
	}
	if(r>=l) {
		int mid = l+(r-1)/2;
		if(are[mid]==x) {
			return mid;
		}
		else if(are[mid]>x) {
			return binary(are,l,mid-1,x);
		}
		else {
			return binary(are,mid+1,r,x);
		}
	}return -1;
}


	public static void main(String[] args) {
	Arr2d ar = new Arr2d();
	ar.arr2d();
	int arr[]= {1,3,2,6,5};
      ar.bubble(arr);
      for(int i:arr) {
    	  System.out.print(i+" ");
      }System.out.println();
    ar.selection(arr);
    for(int i:arr) {
  	  System.out.print(i+" ");
}System.out.println();
    ar.insert(arr);
    for(int i:arr) {
    	  System.out.print(i+" ");
  }System.out.println();
  
  int [] arr1 = {1,4,3,2,5,6};
  int e =3;
  int found = LinSearch(arr1,e);
  if(found!=-1) {
	  System.out.println("Element "+e+ " is at "+ found);
  }else {
	  System.out.println("Error");
  }
  int[] arr2 = {1,2,3,4,5};
  int el = 4;
  int foun = ar.BinarySearch(arr2, 0,arr2.length-1 ,el);
  if(foun!=-1) {
	  System.out.println("Element "+el+ " is at "+ foun);
  }else {
	  System.out.println("Error");
  }
  int [] are = {1,5,2,4,3};
  System.out.println("Original array ");
  for(int i:are) {
	  System.out.print(i+" ");
  }System.out.println();
  int x = 3;
  int f = ar.binary(are, 0,are.length-1, x);
  System.out.println("Arranged array: ");
  for(int i:are) {
	  System.out.print(i+" ");
  }System.out.println();
  if(f!=1) {
	  System.out.println("Element "+x+ " is at "+f);
  }
  else {
	  System.out.println("Element not found");
  }
}
}