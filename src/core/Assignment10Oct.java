package core;

import java.io.*;
import java.util.Arrays;

public class Assignment10Oct {
	
//1. Program to prove string is immutable
	public void Immutable() {
		String a = "this is the original String";
		a.concat(" Immutable "); // this will just concat string variable without changing its value
		System.out.println(a);
	}
//2. Reverse an array without spaces 
	public void revarray() {
		String arr = "this is original";
		String[]c = arr.split(" ");
		String []d = new String[c.length];
		int j = 0;
		for(int i=c.length-1;i>=0;i--) {
			d[j]=c[i];
			System.out.print(d[j]);
		}System.out.println();
	}
	public void reverseint() {
		int[]a = {1,2,3,4,5};
		int j = 0;
		int[]b = new int[a.length];
		for(int i = a.length-1;i>=0;i--) {
			b[j]=a[i];
			System.out.print(b[j]);
		}System.out.println();
	}
// 3. Divide by zero exception
	public void exception() {
		try {
		  int i = 10/0;
		  System.out.println(i);
		}catch(ArithmeticException e) {
			System.out.println("number cannot be divided by 0");
		}finally {
			System.out.println("Enter a non zero number");
		}
	}
//4. Anagram program
	public void anagrams() {
		boolean result = true;
		String a = "Dino";
		String b = "Odin";
		String a1 = a.toLowerCase();
		String b1 = b.toLowerCase();
		char[] c = a1.toCharArray();
		char[]d = b1.toCharArray();
		if(c.length!=d.length) {
			System.out.println("error in input");
		}else {
			Arrays.sort(c);
			Arrays.sort(d);
			for(int i = 0;i<c.length;i++) {
				if(c[i]==d[i]) {
					result = true;
				}else {
					result = false;
				}
			}if(result) {
				System.out.println("Anagram");
			}
		}
	}
//5. Simple threads program attached at the bottom 
//6. it throws an arithematic exception 
//7. it swaps the element so the result is 0th index is 20 and 1st is 10
//8.Serialisation and deserialization in Java:
	//Serialization is a mechanism of converting the state of an object into a byte stream.
	//Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory.
public void SerialDeserial() {
	FileOutputStream fos;
	try {
		fos = new FileOutputStream("dummy.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject("this is from serialisation and deserialisation ");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
try {
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dummy.txt"));
	Object g =(ois.readObject());
	ois.close();
	System.out.println(g);
} catch (IOException e) {
	e.printStackTrace();
} catch (ClassNotFoundException e) {
	e.printStackTrace();
}	
}	

/*9. Servlet and its objectives
Servlet technology is used to create a web application 
(resides at server side and generates a dynamic web page).
Objectives of Servlet:
-Used to create a web application.
-An API that provides many interfaces and classes including documentation.
-An interface that must be implemented for creating any Servlet.
-A class that extends the capabilities of the servers and responds to the incoming requests. It can respond to any requests.
-Servlet is a web component that is deployed on the server to create a dynamic web page.
	*/

	public static void main(String[] args) {
		Assignment10Oct as =new Assignment10Oct();
		extend e = new extend();
		implement i = new implement();
		Thread t = new Thread(i);
		e.start();
		t.start();
		as.Immutable();
		as.revarray();
		as.reverseint();
		as.anagrams();
as.exception();
as.SerialDeserial();
	}
}
//5.Simple threads program
class extend extends Thread{
	public void run() {
		System.out.println("Hi simple thread");
	}
}
class implement implements Runnable{

	@Override
	public void run() {
		System.out.println("hello simple thread");

	}

}
