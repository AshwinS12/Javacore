package java_firstmonth;

import java.util.*;

public class Basic {
	
	public Basic(int a , String b) {
		System.out.println("This is a constructor");
		System.out.println(a);
		System.out.println(b);
	}
	
	static int a;
	int b;
	
	private int run;
	
	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public void function() {
		int c = 13;
		a=20;
		System.out.println(a);
		System.out.println(c);
	}
	
	public int Multiplication() {
		//int e = 12;
		int f = 24;
		return f;
	
	}
	public void loops() {
		for(int a=1;a<10;a++) {
			if(a%2==0) {
				continue;
			}else {
				System.out.println(a);
			}
		}
	}
	public void arr() {
		
		try {
		int[]b = new int[3];
		b[0]=1;
		b[1]=3;
		b[2]=5;
		b[3]=6;
	
		for(int nn =0 ; nn<b.length;nn++) {
			System.out.println(b[nn]);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("please check your array");
		}finally {
			System.out.println("Good");
		}
	
		int [][]arr = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
				//System.out.println(arr[1][1]);
			}System.out.println();
		}	
	}
	public void Collections() {
		//String a = "This is a string";
		
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(1);
	al.add(2);
	al.add(null);
	al.add(4);
  al.add(2, 3);
	al.add(null);
	al.remove(3);
	System.out.println(al.get(2));
	System.out.println(al);
	Iterator<Integer> it = al.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	ArrayList<String> al1 = new ArrayList<String>();
		al1.add("this");
		al1.add("this");
		al1.add("is");
		al1.add("a");
		al1.add("String");
		for(String p:al1) {
			System.out.println(p);
		}
	LinkedList<Integer[]>ll = new LinkedList<Integer[]>();
	Integer []a = {2,4,6};
	Integer []b = new Integer[3];
	b[0]=1;
	b[1]=3;
	b[2]=5;
	ll.add(a);
	ll.addFirst(b);
	for(int ab=0;ab<ll.size();ab++) {
		Integer [] zx = ll.get(ab);
		for(Integer v:zx) {
			System.out.println(v);
		}
	}
	Stack <String> ss = new Stack<String>();
	ss.push("This");
	ss.push("is");
	ss.push("String");
	System.out.println(ss.peek());
	ss.pop();
	for(String gg:ss) {
		System.out.println(gg);
	}
	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	pq.add(12);
	pq.add(23);
	pq.add(34);
	pq.add(45);
	pq.add(56);
	pq.remove();
	
	Iterator<Integer> it1 = pq.iterator();
	while(it1.hasNext()) {
		System.out.println(it1.next());
	}
	ArrayDeque<String>aq = new ArrayDeque<String>();
	aq.add("is");
	aq.add("is");
	aq.addFirst("This");
	aq.addLast("Yes");
	aq.add("String");
	for(String cc: aq) {
		System.out.println(cc);
	}
	HashSet<Integer> se = new HashSet<Integer>();
	se.add(1);
	se.add(null);
	se.add(1);
	se.add(2);
	Iterator<Integer>it2 = se.iterator();
	while(it2.hasNext()) {
		System.out.println(it2.next());
	}
	LinkedHashSet<String> ls = new LinkedHashSet<String>();
	ls.add("String");
	ls.add("String");
	for(String hg:ls) {
		System.out.println(hg);
	}
	String[] st= {"this", "is", "String"};
	List<String> p = Arrays.asList(st);
	TreeSet<String>ts = new TreeSet<String>(p);
	for(String xx:ts) {
		System.out.println(xx);
	}
	HashMap<Integer,String>hm = new HashMap<Integer,String>();
	hm.put(1,"this");
	hm.put(null, null);
	hm.put(1, "this");
	hm.put(2, "this");
	hm.put(4, "String");
	hm.put(null, "Yes");
	for(Map.Entry<Integer,String>me :hm.entrySet()) {
		System.out.println(me.getKey()+" "+me.getValue());
	}
	}

	
	public static void main(String[] args) {
		int d = 123;
Basic ba = new Basic(1,"Constructor");
ba.b=21;
System.out.println(d);
System.out.println(ba.b);
ba.function();
System.out.println(ba.Multiplication());
ba.loops();
ba.setRun(120);
System.out.println(ba.getRun());
ba.arr();
ba.Collections();


Scanner scan = new Scanner(System.in);
System.out.println("Please enter a number");
int dd = scan.nextInt();
if(dd<10) {
	System.out.println("number less than 10");
}else {
	System.out.println("number greater than 10");
	scan.close();
	
	
} 

}
}
