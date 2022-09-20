package core;

import java.util.*;

public class Typecasting {
	public Typecasting() {
		System.out.println("This is a constructor");
	}
	public Typecasting(String g) {
		System.out.println("This is a constructor "+ g);
	}
	
int a = 12;
int b = 24;
static int c = 36;
static int d = 48;

public void numbers() {
	int e = 45;
	int f = 60;
	System.out.println(e+f);
}

public void samppleifelse() {
	int a = 12;
	int b = 15;
	if(a>b) {
		System.out.println("a in greater than b");
	}else if (a==b) {
		System.out.println("a is equal to b");
	}else {
		System.out.println("b is greater than a");
	}
}
public void sampleswitch(char Grade) {
	switch(Grade) {
	case 'A' :
		System.out.println("A");
	    break;
	case 'B' :
		System.out.println("B");
		break;
	case 'C' :
		System.out.println("C");
		break;
	default : 
		System.out.println("Not A or B or C");
	}
}
public void Stringmanipulation(String n) {
	String b = n.toLowerCase();
	String c = n.concat(b);
	String d = n.replace("s","k");
	String e = n.substring(0,3);
	String f = n.trim();
	char g = n.charAt(1);
	boolean h = n.equals(c);
	boolean i = n.startsWith(c);
	System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+" "+h+" "+i);
}
public void Stringbufferbuilder() {
	StringBuffer a1 = new StringBuffer();
		String b = "this is a buffer";
		StringBuilder c = new StringBuilder();
		
	a1=a1.append(b);
	c.append(b);
	System.out.println(a1.charAt(2));
	c.append(a1);
    //a.toString();
    System.out.println(a1);
    System.out.println(b);
    System.out.println(c);
    b.concat("String");// string
    c.append("String");// string buffer
    a1.append("String");//string builder
    System.out.println(b);
    System.out.println(c);
    System.out.println(a1);
}
public void samplearrays() {
//	int []a = {1,2};
//	int []b= new int[2];
	//b[0]=3;
//	b[1]=4;
	int[][]c = {{1,2},{2,3}};
	for(int i = 0;i<c.length;i++) {
		for(int j =0;j<c.length;j++) {
			System.out.print(c[i][j]);
		}System.out.println();
	}
	int [][][] g = {{{1,2,3},{3,2,1}},{{1,1,1},{2,2,2}},{{1,2,3},{3,2,1}}};
	System.out.println(g[0][1][1]);
}
public void loops() {
	int i = 10;
	while(i>5) {
		System.out.println(i);
		i--;
	}
	for(int j = 0;j<5;j++) {
		System.out.println(j);
	}
	int a = 12;
	do{
		System.out.println(a);
		a++;
	
}while(a<10);
}
public void list() {
	ArrayList<Integer>al = new ArrayList<Integer>();
	al.add(1);
	al.add(3);
	al.add(5);
	al.add(1, 0);
	al.remove(1);
	al.get(0);
	for(int i:al) {
		System.out.println(i);
	}
	LinkedList<String>ll = new LinkedList<String>();
	ll.add("two");
	ll.add(0, null);
	ll.addFirst("One");
	ll.remove(0);
	ll.get(1);
	Iterator<String>it = ll.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	Stack<Integer[]>st = new Stack<Integer[]>();
	Integer[]a= {1,2,3,4};
	Integer[]b = {9,8,7,6};
	Integer[]c = {1,2};
	st.push(a);
	st.push(b);
	st.add(c);
	st.pop();
	for(int z = 0; z<st.size();z++) {
		Integer []x = st.get(z);
		for(int u:x) {
			System.out.println(u);
		}
	}
	Vector<String[]>vc = new Vector<String[]>();
	String[]d = {"this","is","string"};
	vc.add(d);
	Iterator<String[]>itr = vc.iterator();
	while(itr.hasNext()) {
		String[] w = itr.next();
		System.out.println(Arrays.toString(w));
	}
}
public void queue() {
	PriorityQueue<Integer>pq= new PriorityQueue<Integer>();
	pq.add(10);
	pq.add(2);
	pq.peek();
	pq.remove();
	
for(int z:pq) {
	System.out.println(z);
}
Deque<String>aq = new ArrayDeque<String>();
aq.add("is");
aq.addFirst("This");
aq.addLast("is");
System.out.println(aq.poll());
for(String r:aq) {
	System.out.println(r);
}
}

public void sets() {
	HashSet<Integer>hs = new HashSet<Integer>();
	hs.add(1);
	hs.add(null);
	hs.add(2);
	hs.add(2);
	Iterator<Integer>it=hs.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	LinkedHashSet<String>lhs = new LinkedHashSet<String>();
	lhs.add(null);
	lhs.add("This");
	lhs.add("this");
	Iterator<String> h =lhs.iterator();
	while(h.hasNext()){
		System.out.println(h.next());
	}
	Integer[]ar = {1,2,3,4,5};
	List<Integer>al = Arrays.asList(ar);
	TreeSet<Integer>ts = new TreeSet<Integer>(al);
	for(int r:ts) {
		System.out.println(r);
	}
	HashMap<Integer,String>hm = new HashMap<Integer,String>();
	hm.put(null, null);
	hm.put(1, "element");
	hm.put(2, "this");
	for(Map.Entry<Integer,String>me:hm.entrySet()) {
		System.out.println(me.getKey()+" "+me.getValue());
	}
	LinkedHashMap<Character,Integer>lhm=new LinkedHashMap<Character,Integer>();
	lhm.put('A',95);
	lhm.put('B', 80);
	lhm.put(null, null);
	for(Map.Entry<Character,Integer>me:lhm.entrySet()) {
		System.out.println(me.getKey()+" "+me.getValue());
	}
	TreeMap<Integer,Integer>tm=new TreeMap<Integer,Integer>();
    tm.put(10, 1);
    tm.put(5, 5);
    tm.put(1, 10);
    for(Map.Entry<Integer,Integer>me:tm.entrySet()) {
    	System.out.println(me.getKey()+" "+me.getValue());
    }
}
public void method() {
	System.out.println("This is a method");
}
public void method(int i) {
	System.out.println("this is a method "+i);
}
	public static void main(String[] args) {	
Typecasting tp = new Typecasting();
Typecasting tp1 = new Typecasting("this");
tp1.method();
tp.numbers();
System.out.println(c+d);
System.out.println(tp.a+tp.b);

long g = c;
int h = (int)g;
System.out.println(g+h);
tp.sampleswitch('A');
tp.samppleifelse();
tp.Stringbufferbuilder();
tp.Stringmanipulation("This is good");
tp.samplearrays();
tp.loops();
tp.list();
tp.queue();
tp.sets();
	}

}
