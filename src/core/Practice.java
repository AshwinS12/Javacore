package core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Practice {

	public void typecasting() {
		int n = 12;
		long m = n;
		byte q = (byte)m;
		System.out.println(q);
	}
	public void loops() {
		int a = 0;
		while(a<3) {
			a++;
			System.out.println(a);
		}
		for(int b = 3;b>=0;b--) {
			System.out.println(b);
		}
	}
	public void ifelse() {
		if(5>4) {
			System.out.println(5);
		}else {
			System.out.println(4);
		}
	}
	public void Arrays() {
		int[]arr = {1,2,3};
		int [][]ar = {{1,2,3},{4,5,6}};
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public void Serialisable() {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("demo.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos); 
			oos.writeObject("this is a practice ");
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("demo.txt"));
			Object y = ois.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Collections() {
		ArrayList<Integer>al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		List s = al.stream().map(i->i*2).toList();
		System.out.println(al.stream().reduce(0,(i,j)->i+j));
		
		HashMap<Integer,Character>hm = new HashMap<Integer,Character>();
		hm.put(1,'A');
		hm.put(2,'B');
		for(Map.Entry<Integer,Character>me:hm.entrySet()) {
			System.out.println(me.getValue()+" "+me.getKey());
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
Practice pr = new Practice();
pr.Arrays();
pr.ifelse();
pr.typecasting();
pr.loops();
pr.Collections();
Thd td = new Thd();
td.start();
td.stop();
	}

}
class Thd extends Thread {
	public void run() {
		System.out.println("running");
	}
}
