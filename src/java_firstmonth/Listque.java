package java_firstmonth;
import java.util.*;

public class Listque {

	int a = 10;
	int b = 20;
	
	public void ArrayList() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(null);
		al.clone();
		System.out.println(al);
		Iterator<Integer> it = al.iterator();
		while(it.hasNext()) {
			System.out.println("ArrayList int " +it.next());
		}
		}
	public void ArrayListSt() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("This");
		al.add("is");
		al.add("ArrayList");
	
		System.out.println(al);
		for(String it : al) {
			System.out.println("ArrayList String " + it);
	}	
	}
	public void ArrayListarr() {
		Integer[]ar = {1,2,3};
		Integer[]ar1 = new Integer[3];
		ar1[0]=10;
		ar1[1]=15;
		ar1[2]=20;
		ArrayList<Integer[]>al = new ArrayList<Integer[]>();
		al.add(ar);
		al.add(ar1);
		for(int x=0;x<al.size();x++) {
			Integer[]z = al.get(x);
			for(int p:z) {
			System.out.println("ArrayList Int arrays " + p);
			}
		}
	}
	public void ArrayListar() {
		String[]ar = {"Array","Of","Strings"};
		String[]ar1 = new String[2];
       ar1[0] = "this";
       ar1[1]= "string";
       
       ArrayList<String[]> al = new ArrayList<String[]>();
       al.add(ar1);
       al.add(ar);
       Iterator<String[]> it = al.iterator();
       while(it.hasNext()) {
    	   System.out.println("ArrayList String arrays " +Arrays.toString( it.next()));
       }
		}
	public void Linkedlist() {
		LinkedList<Integer>li = new LinkedList<Integer>();
		li.add(10);
		li.add(20);
		li.addLast(30);
		li.addFirst(5);
		li.add(null);
		System.out.println(li);
	Iterator<Integer> it = li.iterator();
	while(it.hasNext()) {
		System.out.println("Linked List int " + it.next());
	}
	}
	public void Linkedlistst() {
		LinkedList<String>li = new LinkedList<String>();
		li.addFirst("This");
		li.addLast("is");
		li.clone();
		li.getFirst();
		li.getLast();
		li.element();
		for(Iterator<String>it=li.iterator();it.hasNext();) {
			System.out.println("Linked list string " +it.next());
		}
		li.peek();
	}
	public void Linkedlistarr() {
		LinkedList<Integer[]>li = new LinkedList<Integer[]>();
		Integer[]ar = {1,2,3};
		Integer[]ar1 = new Integer[3];
		ar1[0]=2;
		ar1[1]=4;
		ar1[2]=6;
		
		li.add(ar);
		li.add(ar1);
	for(int a = 0; a<li.size();a++) {
		Integer[] b = li.get(a);
		for(int c:b) {
			System.out.println(c);
		}
	}
	}
	public void LinkedListarra() {
		LinkedList<String[]> li = new LinkedList<String[]>();
		String[]ar = {"a,b,c"};
		String[]ar1 = new String[3];
		ar1[0]="this";
		ar1[1]="is";
		ar1[2]="link";
		li.add(ar1);
		li.add(ar);
		Iterator<String[]>it = li.iterator();
		while(it.hasNext()) {
			//String[]c = it.next();
			System.out.println("Linklist Arrays "+ Arrays.toString(it.next()));
		}
	}
	public void Vecto() {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(10);
		v.add(15);
		v.add(null);
		for(int a:v) {
			System.out.println("Vector "+ a);
		}
	}
	public void Vect() {
		Vector<String>v= new Vector<String>();
		v.add("This");
		v.add("is");
		v.add("vector");
		Iterator<String>it = v.iterator();
		while(it.hasNext()){
			System.out.println("Vector" + it.next());
		}
		
	}
	public void Stac() {
		Stack<Integer> s = new Stack<Integer>();
		s.add(5);
		s.push(10);
		s.push(15);
		Iterator<Integer>it = s.iterator();
		while(it.hasNext()) {
			System.out.println("Stack integer "+ it.next());
		}
		s.pop();
		s.peek();
		System.out.println(s);
	}
	public void Stackst() {
		Stack<String> s = new Stack<String>();
		s.add("This");
		s.add("is");
		s.add("Stack");
		for(String i : s) {
			System.out.println("Stack "+ i);
		}
	}
	public void PriorityQueue() {
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		p.add(0);
		p.add(10);
		p.add(5);
		Iterator<Integer> i = p.iterator();
		while(i.hasNext()) {
			System.out.println("PQ " + i.next());
			System.out.println("PQ "+ p.peek());
			System.out.println("PQ "+p.element());
		}
		
	}
	public void PQst() {
		PriorityQueue<String> p = new PriorityQueue<String>();
		p.add("This");
		p.add("is");
		p.add("PQ");
		p.peek();
		for(String i:p) {
			System.out.println("PQ " + i);
			System.out.println("PQ "+ p.element());
			System.out.println("PQ "+ p.peek());
		}
	}
	public void ArrDQ() {
		Deque<Integer>d = new ArrayDeque<Integer>();
		d.add(10);
		d.addFirst(5);
		d.addLast(15);
		d.add(10);
		Iterator<Integer>it =d.iterator();
		while(it.hasNext()) {
			System.out.println("Deque " +it.next());
		}
	}
	public void ArDQ() {
		Deque<String> d = new ArrayDeque<String>();
		d.add("this");
		d.add("is");
		d.add("Deque");
		for(String i : d) {
			System.out.println(i);
		}
	}
	public void ArrayList(int a) {
		a = 10;
		System.out.println("This is not a ArrayList " + a);
	}
	public void Linkedlistst(String a) {
		a= "no";
		System.out.println("This is not a linked list "+ a);
		a.charAt(0);
		a.isBlank();
		a.split(a, b);
		a.contains(a);
		a.isEmpty();
		StringBuffer sb = new StringBuffer();
		long l = System.currentTimeMillis();
		for(int i = 0 ; i<10000;i++) {
			sb.append("Stringbuffer");
		}
			System.out.println("Time in String buffer is "+ (System.currentTimeMillis()-l )+"Milisecs");
		StringBuilder sb1 = new StringBuilder();
		long z = System.currentTimeMillis();
		for(int j = 0;j<10000;j++) {
			sb1.append("String builder");
		}
			System.out.println("Time in string builder is "+ (System.currentTimeMillis()-z)+"millisecs");
		
		
		
	}
	
}
