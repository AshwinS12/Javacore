package core;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Geekforgeeks {

	public void input(String n) {
		System.out.println(n);
	}
	public void trianglepattern() {
		for(int i =0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				//for(int i=5;i>0;i--){
				//for(int j=i-1;j<5;j++)    both give same result
				System.out.print("*");
			}System.out.println();
		}
	}
	public void searcharray(int n) {
		int ar[]= {1,2,3,4,5};
		boolean value = false;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==n) {
				System.out.println("element "+n+ " is at "+i);
				break;
			}
			}
		}
public void tdarray() {
	int arr[][]= {{2,4,6},{1,3,5},{7,8,9}};
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(arr[i][j]+" ");
		}System.out.println();
	}
}
public void fetchchar(char n) {
	String a = "Dramatically";
  char[]ch = a.toCharArray();
	  for(int i=0;i<a.length();i++) {
		  if(ch[i]==n) {
			  System.out.println("character "+n+" is at "+i);
		  }
	  } 
}
public void initList() {
	List<Integer> li = Arrays.asList(1,2,3,4,5);
	Iterator<Integer> it = li.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
public void AMPM() {
	Date date =new Date();
	System.out.println("Current time is "+date);
	SimpleDateFormat dm = new SimpleDateFormat("hh.mm aa");
	String time = dm.format(date);
	System.out.println(time);
}
public void filesdirect() {
	File[] file = new File("C:\\Users\\ashwi\\OneDrive\\Desktop\\Java diagrams").listFiles();
for(File filename:file) {
	if(filename.isDirectory()) {
		System.out.println("Directory: "+filename.getName());
	}else {
		System.out.println("Filename: "+filename.getName());
	}
}
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	Geekforgeeks gk = new Geekforgeeks();
	System.out.println("enter number");
	//gk.input(sc.nextLine());
	gk.trianglepattern();
	gk.searcharray(5);
	gk.tdarray();
	gk.fetchchar('a');
	gk.AMPM();
	gk.filesdirect();
	}

}
