package core;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/*
 JVM (Java Virtual Machine) is an abstract machine that enables your 
 computer to run a Java program.
 JRE (Java Runtime Environment) is a software package that provides Java class 
 libraries, Java Virtual Machine (JVM), and other components that are required 
 to run Java applications.
 JDK (Java Development Kit) is a software development kit required to develop 
 applications in Java. When you download JDK, JRE is also downloaded with it.
 */

/*
 While it appears both are same, they have some differences like == operator compares 
 reference or memory location of objects in a heap, wheter they point to same location or not 
.equals is used for content comparision , in other words, == is used for checking same
 memory location wheras .equals evaluates to comare values in objects
 */

/*
 In Java 8, a new notion called functional interfaces was introduced. A Functional Interface
  is an interface that has exactly one abstract method. To designate an interface as a 
  Functional Interface, we don’t need to use the @FunctionalInterface annotation.
  In Java 8, the Java.lang interface now supports a “forEach” function. Iterable that can 
  iterate over the collection’s items. The Iterable interface has a default method called 
  “forEach.” Collection classes use it to iterate items, which extends the Iterable interface.
 The Stream API is used to handle a collection of items and allows many iterations. A Stream 
 is a collection of items (elements) that enables you to combine multiple techniques to 
 achieve your goals.
 Under the package java.time, Java 8 offers a new date-time API. The following are the most 
 prominent classes among them:
    Local: Simplified date-time API with no timezone management complexity.
    Zoned: specialized date-time API that can handle several time zones.
    
 */

public class Assignment15 {
public static class innerclass{
	public void print() {
		System.out.println("Inner");
	}
}
	public void Area(String area) {
	//String [] areas = {"Hyd","Vja","Mumbai"};
	//for(String h:areas) {
		
		System.out.println("The area is "+area);
	}
	//}
	
	public void Movie(String movie) {
	/*	String[]movies = {"GodFather","Brahmastra","Avengers"};
		for(String h:movies) {
			if(!h.equalsIgnoreCase(movie)) {
				System.out.println("Sorry movie is not selected properly");
				break;
		}else { */
			System.out.println("The movie is "+movie);
		}
	//}
//	}
	public void slots(String slots) {
		System.out.println("Please select the row and number of seats");
		HashMap<Integer,Character>hm =new HashMap<Integer,Character>();
		for(int i =1;i<=10;i++) {
			hm.put(i, 'A');
		}
		for(Map.Entry<Integer,Character>me:hm.entrySet()) {
			System.out.print( me.getKey()+":"+me.getValue()+" ");
		}
		HashMap<Integer,Character>hm1 =new HashMap<Integer,Character>();
		System.out.println();
		for(int i =1;i<=10;i++) {
			hm1.put(i, 'B');
		}
		for(Map.Entry<Integer,Character>me1:hm1.entrySet()) {
			System.out.print( me1.getKey()+":"+me1.getValue()+" ");
		}
		HashMap<Integer,Character>hm2 =new HashMap<Integer,Character>();
		System.out.println();
		for(int i =1;i<=10;i++) {
			hm2.put(i, 'C');
		}
		for(Map.Entry<Integer,Character>me2:hm2.entrySet()) {
			System.out.print( me2.getKey()+":"+me2.getValue()+" ");
		}System.out.println();
		
		}
	public void Selectseats(char a,int b) {
		Random rand= new Random();
		System.out.println("Seats selected are : ");
		while(b>0) {
	int h = rand.nextInt(10);
	System.out.print(a+""+h+" ");
	b--;
		}System.out.println();
	}
	public void combos(String n) {
		if(!n.equalsIgnoreCase("yes")) {
			System.out.println("Thank you for your purchase, enjoy the show!");
		}else {
			TreeMap<String,Integer>hm= new TreeMap<String,Integer>();
			hm.put("Fries Combo",150);
			hm.put("PopCorn Combo",250);
			hm.put("Jumbo Box",500);
			for(Map.Entry<String,Integer>me:hm.entrySet()) {
				System.out.println(me.getKey()+" "+me.getValue());
			}
			}
		}
	public void yescombo(String n) {
		Integer m = Integer.valueOf(n);
		switch(m) {
		case 1: System.out.println("Thank you for choosing FriesCombo @150/-");
		break;
		case 2:System.out.println("Thank you for choosing Popcorn Combo @250/-");
		break;
		case 3:System.out.println("Thank you for choosing JumboBox @500/-");
		}
	}
	public void sleep() {
	try {
		TimeUnit.SECONDS.sleep(1);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
	
	public static void main(String[] args) {
		Hihi h = new Hihi();
		Hellohello he = new Hellohello();
		Thread t = new Thread(he);
		h.start();
		t.start();
		Assignment15 as =new Assignment15();
		innerclass in = new innerclass();
		in.print();
	Scanner sc=new Scanner(System.in);
	System.out.println("Select an Area ");
	as.Area(sc.nextLine());
	System.out.println("Select a movie");
	as.Movie(sc.nextLine());
	as.slots(sc.nextLine());
	System.out.println("Select number of seats");
	
	System.out.println(sc.nextLine());
	as.Selectseats('A', 3);
	System.out.println("Thank you enjoy the show ");
	}

}
class Hihi extends Thread{
	public void run() {
		System.out.println("Hi Thread");
try {
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("assignment.txt"));
oos.writeObject("This is a serialised file  ");
oos.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
}
class Hellohello implements Runnable{
	public void run() {
		System.out.println("Hello Thread");
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("assignment.txt"));
		Object o = ois.readObject();
		System.out.println(o);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}