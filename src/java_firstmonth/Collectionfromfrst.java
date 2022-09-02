package java_firstmonth;

import java.util.*;

public class Collectionfromfrst {
public void arraylistint() {
	ArrayList<Integer> in = new ArrayList<Integer>();
	in.add(1);
	in.add(0, 0);
	in.remove(1);
	in.add(2);
	Iterator<Integer> it = in.iterator();
	while(it.hasNext()) {
		System.out.println("ArrayList of integers " +it.next());
	}
}
public void arrayliststring() {
	ArrayList<String> st = new ArrayList<String>();
	st.add("This ");
	st.add("is");
	st.add("A L String");
	st.add(null);
	Iterator<String> it = st.iterator();
	while(it.hasNext()) {
		System.out.println("ArrayList of String "+ it.next());
	}
}
public void arraylistarrint() {
	Integer[]n= {0,1,2,3};
	ArrayList<Integer[]> in = new ArrayList<Integer[]>();
	in.add(n);
	for(int a = 0;a<in.size();a++) {
		Integer[]b = in.get(a);
		for(int c:b) {
			System.out.println("ArrayList integers" + c);
		}
	
	}
	
}
public void arrayliststrarr() {
	String[] a= {"This","is","ArrayList","String"};
	ArrayList<String[]> in = new ArrayList<String[]>();
	in.add(a);
	Iterator<String[]> it = in.iterator();
	while(it.hasNext()) {
		String[] n = it.next();
		System.out.println("Arraylist string arrays "+ Arrays.toString(n));
	}
}
public void Linkedlistint() {
	LinkedList<Integer> ll = new LinkedList<Integer>();
	ll.add(2);
	ll.add(4);
	ll.addFirst(1);
	ll.addLast(5);
	ll.add(2, 3);
	for(int i :ll) {
		System.out.println("Linked list integer " +i);
	}
}
public void Linkedliststr() {
	LinkedList<String> ll = new LinkedList<String>();
	ll.add("This");
	ll.add("is");
	ll.add("Linkedlist Integer");
	Iterator<String> it = ll.iterator();
	while(it.hasNext()) {
		System.out.println("Linkedlist of String " + it.next());
	}
}
public void Linkedlistarrint() {
	Integer[]a = {1,2,3};
	Integer[]b = {0};
	LinkedList<Integer[]> ll = new LinkedList<Integer[]>();
	ll.add(a);
	ll.addFirst(b);
	ll.addLast(b);
	for(int x = 0;x<ll.size();x++) {
		Integer[] y = ll.get(x);
		for(int q:y) {
			System.out.println("Linkedlist of array string "+ q);
		}
	}
}
public void Linkedlistarrstr() {
	String[]a = {"This","is ","LinkedList String"};
	LinkedList<String[]>ll = new LinkedList<String[]>();
	ll.add(a);
	Iterator<String[]> it = ll.iterator();
	while(it.hasNext()) {
		String[]b = it.next();
		System.out.println("LinkedList array String "+ Arrays.toString(b));
	}
}
public void stackint() {
	Stack<Integer> st = new Stack<Integer>();
	st.add(10);
	st.push(20);
	st.push(30);
	st.peek();
	st.add(40);
	st.pop();
	for(int a :st) {
		System.out.println("Staack int "+ a);
	}
}
public void stackstr() {
	Stack<String> st = new Stack <String>();
	st.push("This");
	st.push("is");
	st.push("Stack ");
	Iterator<String> it = st.iterator();
	while(it.hasNext()) {
		System.out.println("Stack str " +it.next());
	}
}
public void stackarrint() {
	Integer a [] = {1,2,3};
	Integer[] b = {4,6};
	Stack<Integer[]> st = new Stack<Integer[]>();
	st.push(a);
	st.push(b);
	for(int z = 0;z<st.size();z++) {
		Integer[]x = st.get(z);
		for(int c : x) {
			System.out.println("Stack array int "+ c);
		}
	}
}
public void stackstrarr() {
	String[]a = {"This","is","stack"};
	Stack<String[]> st = new Stack<String[]>();
	st.push(a);
	Iterator<String[]>it = st.iterator();
	while(it.hasNext()) {
		String[]z = it.next();
		System.out.println("Stack string array "+ Arrays.toString(z));
	}
}
public void pqint() {
PriorityQueue<Integer>in = new PriorityQueue<Integer>();
in.add(2);
in.add(4);
in.add(6);
for(int a : in) {
	System.out.println("Priorityqueue int "+ a);
}
}
public void pqstr() {
	PriorityQueue<String>pq =new PriorityQueue<String>();
	pq.add("this");
	pq.add("is");
	pq.add("PQ String");
	Iterator<String>it = pq.iterator();
	while(it.hasNext()) {
		System.out.println("PQ String "+ it.next());
	}
}
public void arraydequeint() {
	Deque<Integer>dq = new ArrayDeque<Integer>();
	dq.add(2);
	dq.addFirst(1);
	dq.add(3);
	dq.addLast(4);
	for(int a :dq) {
		System.out.println("ArrayDQ int "+ a);
	}
}
public void arraydequestr() {
	Deque<String>dq = new ArrayDeque<String>();
	dq.add("This" );
	dq.add("is");
	dq.add("Array DQ " );
	Iterator<String>it = dq.iterator();
	while(it.hasNext()) {
		System.out.println("ArrayDQ str" + it.next());
	}
}
public void hashsetint() {
	HashSet<Integer>hs = new HashSet<Integer>();
	hs.add(1);
	hs.add(2);
	hs.add(3);
	for(int a : hs) {
		System.out.println("Hshset int "+ a);
	}
}
public void hashsetstr() {
	HashSet<String>hs = new HashSet<String>();
	hs.add("this");
	hs.add("is");
	hs.add("Hashset string");
	for(String z : hs) {
		System.out.println("HashSet String "+ z);
	}
}
public void hashsetintarr() {
	Integer []a = {1,3,5};
	List<Integer> aa = Arrays.asList(a);
	HashSet<Integer>hs = new HashSet<Integer>(aa);
	Iterator<Integer> it = hs.iterator();
	while(it.hasNext()) {
		System.out.println("HashSet Int Arr "+ it.next());
	}
}
public void hashsetstrarr() {
	String[]a = {"this","is","Hashset"};
	List<String> ll = Arrays.asList(a);
	HashSet<String>hs = new HashSet<String>(ll);
 Iterator<String> it = hs.iterator();
 while(it.hasNext()) {
	 System.out.println("HashSet Str Arr "+ it.next());
 }
}
public void linkhashint() {
	LinkedHashSet<Integer>ls = new LinkedHashSet<Integer>();
	ls.add(10);
	ls.add(20);
	ls.add(30);
	Iterator<Integer> it = ls.iterator();
	while(it.hasNext()) {
		System.out.println("Linkedhashint "+ it.next());
	}
}
public void linkhashstr() {
	LinkedHashSet<String>ls = new LinkedHashSet<String>();
	ls.add("This");
	ls.add("is");
	ls.add("Linkedhashset" );
	for(String s : ls) {
		System.out.println("Linkedhashset string " +s);
	}
}
public void linkhashintarr() {
  Integer[]a = {1,2,3};
  List<Integer>b = Arrays.asList(a);
  LinkedHashSet<Integer> ls = new LinkedHashSet<Integer>(b);
  for(int z : ls) {
	  System.out.println("Linkedhashset arr "+ z);
  }
}
public void linkhashstrarr() {
	String[]a = {"This " , "is","Linked HashSet String"};
	List<String>b = Arrays.asList(a);
	LinkedHashSet<String>ls = new LinkedHashSet<String>(b);
	for(String c : ls) {
		System.out.println("Linked Hashset string "+ c);
	}
}
public void treesetint() {
	TreeSet<Integer>ts = new TreeSet<Integer>();
	ts.add(10);
	ts.add(20);
	ts.add(30);
for(int a :ts) {
	System.out.println("Treeset int "+ a);
}
}
public void treesetstr() {
	Set<String>ts = new TreeSet<String>();
	ts.add("This");
	ts.add("is");
	ts.add("treeset");
	for(String a:ts) {
		System.out.println("Treeset str "+ a);
	}
}
public void treesetintarr() {
	Integer[]a = {10,20,30};
	List<Integer>l = Arrays.asList(a);
	Set<Integer>s = new TreeSet<Integer>(l);
	for(int c:s) {
		System.out.println("Treeset arr "+ c);
	}
}
public void treesetstrarr() {
	String[]a = {"This","Is","Treeset Array"};
	List<String>l=Arrays.asList(a);
	Set<String>s=new TreeSet<String>(l);
	for(String c : s) {
		System.out.println("treeset arr"+ c);
	}
}
public void hashmap() {
	HashMap<Integer,String>hm = new HashMap<Integer,String>();
	hm.put(0, null);
	hm.put(1, "This ");
	hm.put(2, null);
	for(Map.Entry<Integer,String>m :hm.entrySet()) {
		System.out.println("hashmap "+ m.getKey()+ " "+ m.getValue());
	}
}
public void hashmapp() {
	HashMap<Integer,String>hm = new HashMap<Integer,String>();
	hm.put(0,"This");
	hm.put(1,"is ");
	hm.put(2,"hashmap");
	for(Map.Entry<Integer,String>me : hm.entrySet()) {
		System.out.println("Hashmap "+ me.getKey()+" "+ me.getValue() );
	}
}
public void Linkedhash() {
	LinkedHashMap<Integer,Integer>lh = new LinkedHashMap<Integer,Integer>();
	lh.put(1,10);
	lh.put(2, null);
	lh.put(3, 30);
	for(Map.Entry<Integer,Integer>me : lh.entrySet()) {
		System.out.println("Linkedhashmap " +me.getKey()+""+me.getValue());
	}
}
public void Linkedhas() {
	LinkedHashMap<Character,String>lh = new LinkedHashMap<Character,String>();
	lh.put('a',"This");
	lh.put('A',"That");
	lh.put(null, null);
	for(Map.Entry<Character,String>me :lh.entrySet()) {
		System.out.println("Linkedhashmap "+me.getKey()+" "+ me.getValue());
	}
}
public void treemap() {
	TreeMap<Integer,String>tm = new TreeMap<Integer,String>();
	tm.put(1, null);
	tm.put(2,"This");
	tm.put(0,"That");
	for(Map.Entry<Integer,String>me : tm.entrySet()) {
		System.out.println("TreeMap "+ me.getKey()+ " "+me.getValue());
	}
}
public void HashTable() {
	Hashtable<Integer,String>ht = new Hashtable<Integer,String>();
	ht.put(0,"This");
	ht.put(1, "is");
	ht.put(2, "HashTable");
	for(Map.Entry<Integer,String>me:ht.entrySet()) {
		System.out.println("hashTable "+me.getKey()+""+me.getValue());
	}
}
	public static void main(String[] args) {
		Collectionfromfrst cf = new Collectionfromfrst();
		cf.arraylistint();
		cf.arrayliststring();
		cf.arraylistarrint();
		cf.arrayliststrarr();
		cf.Linkedlistint();
		cf.Linkedliststr();
		cf.Linkedlistarrint();
		cf.Linkedlistarrstr();
		cf.stackint();
		cf.stackstr();
		cf.stackarrint();
		cf.stackstrarr();
		cf.pqint();
		cf.pqstr();
		cf.arraydequeint();
		cf.arraydequestr();
		cf.hashsetint();
		cf.hashsetstr();
		cf.hashsetintarr();
		cf.hashsetstrarr();
		cf.linkhashint();
		cf.linkhashstr();
		cf.linkhashintarr();
		cf.linkhashstrarr();
		cf.treesetint();
		cf.treesetstr();
		cf.treesetintarr();
		cf.treesetstrarr();
		cf.hashmap();
		cf.hashmapp();
		cf.Linkedhash();
		cf.Linkedhas();
		cf.treemap();
		cf.HashTable();

	}

}
