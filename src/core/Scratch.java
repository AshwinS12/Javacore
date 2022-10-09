package core;

import java.io.*;
import java.util.*;

public class Scratch {

	public void typecasting() {
		int a = 19;
		double f = a;
		byte s = (byte)a;
		System.out.println("int "+ a+"double "+f+"byte "+s);
	}
	public void ifswitch() {
		int a = 10;
		int b = 10-4;
		if(a>5) {
			System.out.println("greater than 5");
		}else if(a==5) {
			System.out.println("equals 5");
		}else {
			System.out.println("less than 5");
		}
		switch(b) {
		case 4:
			System.out.println(b+"4");
		break;
		case 6: System.out.println(b+"switch 6");
		break;
		case 10:System.out.println(b+"10");
		break;
		}
	}
public void loops() {
	int a = 12;
	while(a>9) {
		System.out.println("while "+ a);
	a--;
	
	}for(int b = 0;b<=3;b++) {
		System.out.println("for "+b);
	}int c = 15;
	do{
		System.out.println(c);
	}while(c<10);
}
public void Stringsarrays() {
	int arr[]= {1,2,3,4,5};
	String a = "asdfg";
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
	}char[] b =  a.toCharArray();
	int x = a.length()-1;
	while(x>=0) {
		System.out.print(b[x]+" ");
		x--;
	}
	StringBuffer sb = new StringBuffer();
	long time = System.currentTimeMillis();
	for(int i=0;i<12345;i++) {
		sb = sb.append("new one"+i);
	}System.out.println("Time in Stringbuffer is "+(System.currentTimeMillis()-time)+"millis");

StringBuilder sb1 = new StringBuilder();
time =System.currentTimeMillis();
for(int i=0;i<12345;i++) {
	sb1 = sb1.append("new one"+i);
}System.out.println("Time in Builder "+(System.currentTimeMillis()-time)+"milis");
}

public void Lists() {
	ArrayList<Integer>al = new ArrayList<Integer>();
	al.add(null);
	al.add(12);
	al.add(14);
	al.remove(2);
	System.out.println("ArrayList:");
	Iterator<Integer> it = al.iterator();
	while(it.hasNext()) {
		System.out.print(it.next());
	}System.out.println();
	LinkedList<String>ll = new LinkedList<String>();
	ll.add("This");
	ll.addFirst("Yes!");
	ll.addLast("!");
	ll.add("is");
	System.out.println("LinkedList: ");
	for(String z:ll) {
		System.out.print(z+" ");
	}System.out.println();
	Integer ar[]= {1,2,3,4};Integer arr[] = {4,3,2,1};
	int a = 12;Integer b = a; int c = Integer.valueOf(b);
	System.out.println("Wrapper class: "+b+""+c);
	Stack<Integer[]>st = new Stack<Integer[]>();
	st.add(arr);
	st.add(ar);
	System.out.println("Stack:");
	for(int z=0;z<st.size();z++) {
		Integer[] x = st.get(z);
		for(int g:x) {
			System.out.print(g);
		}
	}
	Vector<String[]> v = new Vector<String[]>();
	String[] j= {"Abc","poi","zxc"};
	v.add(j);
	Iterator<String[]> i = v.iterator();
	while(i.hasNext()) {
		System.out.println(Arrays.toString(i.next()));
	}
}
public void Que() {
	PriorityQueue<Integer>pq = new PriorityQueue<Integer>();
	pq.add(12);
	pq.add(15);
	System.out.println("PriorityQue: ");
	for(int z:pq) {
		System.out.print(z);
	}System.out.println();
	ArrayDeque<String>aq = new ArrayDeque<String>();
	System.out.println("ArrayDeque: ");
	aq.add("Array");
	aq.addLast("Deque");
for(String h:aq) {
	System.out.print(h);
}System.out.println();
}
public void set() {
	Set<Integer>st = new HashSet<Integer>();
	st.add(12);
	st.add(12);
	st.add(3);
	System.out.println("Set: ");
	for(int i:st) {
		System.out.print(i+" ");
	}System.out.println();
	LinkedHashSet<String>lhs = new LinkedHashSet<String>();
	lhs.add("this");
	lhs.add(null);
	lhs.add(null);
	System.out.println("LinkedHashSet: ");
	Iterator<String> it = lhs.iterator();
	while(it.hasNext()) {
		System.out.print(it.next());
	}System.out.println();
	Integer []arr = {1,2,3,4,55};
	List<Integer> p = Arrays.asList(arr);
	TreeSet<Integer> ts = new TreeSet<Integer>(p);
	System.out.println("Treeset: ");
Iterator<Integer> t = ts.iterator();
while(t.hasNext()) {
	System.out.print(t.next());
}System.out.println();
}
public void Maps() {
	HashMap<Integer,String>hm = new HashMap<Integer,String>();
	hm.put(1, "this");
	hm.put(1, "that");
	hm.put(2, "yeah");
	for(Map.Entry<Integer,String>me:hm.entrySet()) {
		System.out.println(me.getKey()+""+me.getValue());
	}
	LinkedHashMap<Character,String>lhm = new LinkedHashMap<Character,String>();
	lhm.put('A',"So");
	lhm.put('C', "this");
	lhm.put('B', "is");
	for(Map.Entry<Character,String>m:lhm.entrySet()) {
		System.out.println(m.getKey()+""+m.getValue());
	}
}
public void Exception() throws IOException {
	//throw new IOException("Error");
	try{
		int i =9;
	System.out.println(i/2);
	
	}catch( Exception e) {
		System.out.println("exception found");
	}finally {
		System.out.println("check input ");
	}
}
public void Serialization() {
	FileOutputStream fos;
	try {
		fos = new FileOutputStream("a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject("this is a new file");
		oos.close();
	}
	catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	try {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
		Object h = ois.readObject();
		System.out.println(h);
		ois.close();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void run() {
	System.out.println("running");
}
public static class Stat{
	public void run() {
		System.out.println("This is a static inner class");
	}
}
public class Inner{
	public void run() {
		System.out.println("this is inner ");
	}
	public void method() {
		 class methodinner{
			public void run() {
				System.out.println("method inner");
			}
		} methodinner i = new methodinner();
		i.run();
	}
}

	public static void main(String[] args) {
		Oops op = new Oops();
		op.run();
		op.run(1);
		op.setName("name");
	 System.out.println(op.getName());
		
	Scratch s = new Scratch();
	Scratch.Stat p= new Stat();
	Scratch.Inner i = s.new Inner();
	p.run();
	i.run();
	i.method();
	s.typecasting();
s.ifswitch();
s.loops();
s.Stringsarrays();
s.Lists();
s.Que();
s.set();
s.Maps();
//s.Exception();
s.run();
s.Serialization();
AlphaNumeric an = new AlphaNumeric();
Numeric n = new Numeric(an);
Alpha a = new Alpha(an);
Thread t = new Thread(a);
n.start();
t.start();



	}

}
class Oops extends Encapsule{
 public void run(int a) {
	 
	 System.out.println("extends"+a);
	
 }
}
 class Encapsule implements abstr{
private int num;
public String name;
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public  String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public void run() {
	System.out.println("Abstract implemented");
	
	
}
@Override
public void add() {
	System.out.println("Abstract in encaps");
}
}
interface abstr{
	abstract void run();
	abstract void add();
}
class AlphaNumeric{
	private boolean res=false;
	int num;
public synchronized int get() {
	if(res==false) {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}res=false;
	notify();
	return num;
}
public synchronized void put(int num) {
	if(res==true) {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}res=true;
	this.num=num;
	notify();
}
	
}
class Alpha implements Runnable{
private AlphaNumeric an;
public Alpha(AlphaNumeric an){
	this.an=an;
}
	@Override
	public void run() {
	String ab = "abcde";
	char[]c = ab.toCharArray();
	for (int i=0;i<c.length;i++){
	        an.get();
	       System.out.println(c[i]);
	}
	}
}
class Numeric extends Thread{
	private AlphaNumeric an;
	public Numeric(AlphaNumeric an) {
		this.an=an;
	}
	public void run() {
		for(int i = 1;i<6;i++) {
			an.put(i);
			try {
				sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}