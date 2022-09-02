package java_firstmonth;

import java.util.*;

public class Aug18cltarr {

	public void ArrayList() {
		ArrayList<Integer>al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(0, 0);
		Iterator<Integer>it = al.iterator();
		while(it.hasNext()) {
		System.out.println("Array list "+it.next());
		}
		ArrayList<String>all = new ArrayList<String>();
		all.add("This");
		all.add("is");
		all.add("Arraylist string");
		for(String a:all) {
			System.out.println("Array list " + a);
		}
		ArrayList<Integer[]> arl = new ArrayList<Integer[]>();
		Integer[] arr= {1,2,3};
		arl.add(arr);
		for(int z = 0;z<arl.size();z++) {
			Integer [] x = arl.get(z);
			for(int q:x) {
				System.out.println(q);
			}
		}
	}
	public void LinkedList() {
		LinkedList<Integer>ll = new LinkedList<Integer>();
		ll.add(12);
		ll.add(15);
		for(int z : ll) {
			System.out.println("Linkedlist "+ z);
		}
		LinkedList<String>li = new LinkedList<String>();
		li.add("This");
		li.add("is");
		li.add("Linkedlist");
		Iterator<String> it = li.iterator();
		while(it.hasNext()) {
			System.out.println("Linkedlist "+ it.next() );
		}
		LinkedList<String[]> lll= new LinkedList<String[]>();
		String arr[]= {"this","is","linkedlist"};
		lll.add(arr);
		Iterator<String[]> itr = lll.iterator();
		while(itr.hasNext()) {
			String[] z = itr.next();
			System.out.println(Arrays.toString(z));
		}
		Stack<Integer> st = new Stack<Integer>();
		st.add(0);
		st.push(10);
		st.push(15);
		System.out.println(st.peek());
		st.pop();
	    for(int q :st) {
	    	System.out.println(q);
	    }
	}
	public void queue() {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(15);
		pq.add(20);
		Iterator<Integer>it = pq.iterator();
		while(it.hasNext()) {
			System.out.println("Queue" + it.next());
		}
		Deque <String> dq = new ArrayDeque<String>();
		dq.add("This");
		dq.add("is");
		dq.add("DQ");
		for(String d:dq) {
			System.out.println("DQ " + d);
		}	
	}
	public void set() {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		for(int h:hs) {
			System.out.println("Hashset "+ h);
		}
		String[]st = {"This","is","Linkedhashset"};
		List<String> ls = Arrays.asList(st);
		LinkedHashSet<String> lh = new LinkedHashSet<String>(ls);
		for(String l : lh) {
			System.out.println(l);
		}
		TreeSet<String>ts = new TreeSet<String>();
		ts.add("this");
		ts.add("is");
		ts.add("tree");
		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			System.out.println("Tree set "+ it.next());
		}
	}
	public void Map() {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0,"this");
		hm.put(1, "hashmap");
		for(Map.Entry<Integer,String>me:hm.entrySet()) {
			System.out.println(me.getKey()+" " + me.getValue());
		}
		LinkedHashMap<Character,Double> lh = new LinkedHashMap<Character,Double>();
		lh.put('A',12.5);
		lh.put('B', 15.5);
		for(Map.Entry<Character,Double>m:lh.entrySet()) {
			System.out.println(m.getKey()+ " "+ m.getValue());
		}
		TreeMap<Integer,Integer>tm = new TreeMap<Integer,Integer>();
		tm.put(1,1);
		tm.put(2,2);
		tm.put(0,0);
		for(Map.Entry<Integer,Integer>e:tm.entrySet()) {
			System.out.println(e.getKey() + " "+ e.getValue());
		}
	}
	public void arrayrev() {
		
		// using arraylist to reverse
	 Integer arr[] = {1,2,3,4};
	 System.out.print("Array: ");// for printing array : in front of the array
	 for (int a=0;a<arr.length;a++) {
		 
	 System.out.print( arr[a]+ " ");// for printing the contents of the array
	 }
	 System.out.println(" ");
	 Collections.reverse(Arrays.asList(arr));
		System.out.print("Reverse : " + Arrays.asList(arr));
		System.out.println(" ");
		
	// using reverse indexing
		
		Integer arl[]= {1,2,3,4};
		System.out.print("Array: ");
		for(int b = 0 ;b<arl.length;b++) {
			System.out.print(arl[b]+ " ");
		}
		System.out.println();
		System.out.print("Reverse : ");
		for(int i=arl.length-1;i>=0;i--) {
			System.out.print(arl[i]+ " ");
		}
}
	public static void main(String[] args) {
       Aug18cltarr ca = new Aug18cltarr();
	ca.ArrayList();
	ca.LinkedList();
	ca.queue();
	ca.set();
	ca.Map();
	ca.arrayrev();
	
	
	}

}
