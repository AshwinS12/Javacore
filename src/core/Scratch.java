package core;

import java.io.*;
import java.util.*;

abstract class Abstract{
	abstract void show();
}
interface inter{
	void ford();
}
class Encap extends Abstract  implements inter{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void ford() {
		System.out.println("Interface");
	}
	public void ford(String g) {
		System.out.println(g);
	}
	@Override
	void show() {
		System.out.println("Abstraction");	
	}
}
public class Scratch {

	public void Type() {
		int a = 12;
		double b = a;
		double c = 12.5;
		int d = (int)c;
		System.out.println(b+""+d);
	}
	public void Array() {
		int[]a = {1,2,3,4,5};
		for(int i=a.length-1;i>0;i--) {
			System.out.print(a[i]);
		}System.out.println();
	}
	public void Collections() {
		List<Integer> li =	Arrays.asList(1,2,3,4,5);
		Iterator<Integer>it = li.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		HashMap<String,Integer>hm =new HashMap<String,Integer>();
		hm.put("One", 1);
		hm.put("Two", 2);
		for(Map.Entry<String,Integer>me:hm.entrySet()) {
			System.out.println(me.getKey()+""+me.getValue());
		}
	}
	public void Serialisable() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("practice.txt"));
			oos.writeObject("this is a very good one right , dont you think it is cool ");
			oos.close();
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("practice.txt"));
			Object h = ois.readObject();
			System.out.println(h);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public void Streams() {
	ArrayList<Integer>al= new ArrayList<Integer>();
	al.add(1);
	al.add(5);
	al.add(10);
	al.add(4);
	al.add(3);
	 al.forEach((no)->System.out.print(no+" "));
	List li= al.stream().map(x->x*2).toList();
	List re = al.stream().filter(x->x%5==0).toList();
    int  fg = al.stream().reduce(0,(a,b)->a+b);
    boolean po= al.parallelStream().allMatch(x->x%2==0);
   
    System.out.println(li);
    System.out.println(re);
    System.out.println(fg);
    System.out.println(po);
}

	public static void main(String[] args) {
		Scratch sc = new Scratch();
		Encap ee = new Encap();
		ee.ford();
		ee.show();
		ee.setId(12);
		ee.ford("this");
		System.out.println(ee.getId());
		sc.Type();
		sc.Array();
		sc.Collections();
		sc.Serialisable();
		sc.Streams();
	
		
		
		Market m = new Market();
	HiThread h = new HiThread(m);
	HelloThread hh= new HelloThread(m);
	Thread t = new Thread(h);
	hh.start();
	t.start();
		
	List<Laptop>li = new ArrayList<Laptop>();
	li.add(new Laptop(12,"Great",12000));
	li.add(new Laptop(10,"Zeto",15000));
	li.add(new Laptop(22,"Der",5000));
	Collections.sort(li);
	li.forEach((Lp)->System.out.println(Lp));
	Comparator<Laptop>co = new Comparator<Laptop>() {

		@Override
		public int compare(Laptop o1, Laptop o2) {
			if(o1.getPrice()>o2.getPrice()) {
			return 1;
		}
			else {
				return -1;
			}
	}
	};
	Collections.sort(li,co);
	for(Laptop p:li) {
		System.out.println(p);
	}
	}
}

class Market{
	private int no;
	private boolean flag=false;
public synchronized int get() {
	while(flag==false) {
		try {
			wait();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}notifyAll();
	flag=false;
	return no;
}
public synchronized void put(int n) {
	while(flag==true) {
		try {
			wait();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}notifyAll();
	flag=true;
	no=n;
}
	
}

class HiThread implements Runnable{
	Market mr;
	
	public HiThread(Market mr) {
		
		this.mr = mr;
	}

	@Override
	public void run() {
		int n = 0;
		for(int i=0;i<10;i++) {
			n=mr.get();
		System.out.println("Hi Thread"+n);
		
		}
	}
}
class HelloThread extends Thread {
	Market mr;
	
	public HelloThread(Market mr) {
		
		this.mr = mr;
	}

	public void run() {
		for(int i = 0;i<10;i++) {
			mr.put(i);
		System.out.println("Hello Thread"+i);
		try {
			sleep((int)(Math.random()*100));
		}
		catch(Exception ie) {
			ie.printStackTrace();
		}
	}
	}
}


class Laptop implements Comparable<Laptop>{
	
	private int no;
	private String model;
private int price;

	public Laptop(int no, String model, int price) {
	super();
	this.no = no;
	this.model = model;
	this.price = price;
}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
		
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [no=" + no + ", model=" + model + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Laptop o) {
		if(this.getNo()>o.getNo()) {
			return 1;
		}
			else {
				return -1;
			}
	}	
}
