package java_firstmonth;

import java.util.*;

public class Evenodduserdefined {

	public void evenodd() {
			System.out.println("Please enter a number below 100");
			try (Scanner sc = new Scanner(System.in)) {
				
				int no = sc.nextInt();	
				if( no<=100) {
				for(Integer i = 0;i<=no;i++) {        		  
				if(i%2==0) {
				PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
				pq.add(i);
				System.out.println("Even "+ i);
				}
				else if (i%2!=0) {
					Deque<Integer> dq = new ArrayDeque<Integer>();
					dq.add(i);
					System.out.println("Odd "+ i);
				}
        	  }
        	  
          }else {
        	  System.out.println("Incorrect value");
          }
          }
			
		catch(InputMismatchException e) {
			System.out.println("Please enter valid number");
		}
	}
	public void HashMap() {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0,"This");
		hm.put(1, "HashMap");
		for(Map.Entry<Integer,String>me:hm.entrySet()) {
			System.out.println(me.getKey()+" "+me.getValue());
		}
		Integer arr[] = {1,2,3};
		ArrayList<Integer[]> al = new ArrayList<Integer[]>();
		al.add(arr);
		for(int a=0;a<al.size();a++) {
			Integer[] b = al.get(a);
			for(int z:b) {
				System.out.println(z);
			}
		}		
	}
	public void lists() {
		ArrayList<Integer[]> n = new ArrayList<Integer[]> ();
		Integer[] aa = {1,2,3,4};
		Integer[] ab= {2,4,6,8};
		Integer[] ac = {1,3,5,7};
		n.add(aa);
		n.add(ab);
		n.add(ac);
		for(int x = 0;x<n.size();x++) {
			Integer[] y = n.get(x);
			for(int q:y) {
				System.out.println("ArrayList "+ q);
		}
			}
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("This");
		pq.add("is");
		pq.add("Queue");
		Iterator<String> it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		List<Integer> l = Arrays.asList(aa);
		HashSet<Integer> hs = new HashSet<Integer>(l);
		for(int a : hs) {
			System.out.println("Set "+ a);
		}
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0,"Yes");
		hm.put(1,"Yess");
		for(Map.Entry<Integer,String>me:hm.entrySet()) {
			System.out.println(me.getKey()+ " "+ me.getValue());
		}
		LinkedList<String[]>ls = new LinkedList<String[]>();
		String[] ar= {"this","is","linklist"};
		ls.add(ar);
		Iterator<String[]> itr = ls.iterator();
		while(itr.hasNext()) {
			String[] rr = itr.next();
			System.out.println(Arrays.toString(rr));
		}
		Hashtable<Integer,Integer>st = new Hashtable<Integer,Integer>();
		st.put(0, 0);
		st.put(1, 1);
		for(Map.Entry<Integer, Integer>mm :st.entrySet()) {
			System.out.println(mm.getKey()+ " "+ mm.getValue());
		}
		Stack<String> sk = new Stack<String>();
		sk.push("this");
		sk.pop();
		sk.push("Stack");
		sk.push("Vector stack");
		sk.peek();
		for(String gg:sk) {
			System.out.println(gg);
		}
	}
	public static void main(String[] args) {
Evenodduserdefined eo = new Evenodduserdefined();
    eo.evenodd();
    eo.HashMap();
    eo.lists();
	}

}
