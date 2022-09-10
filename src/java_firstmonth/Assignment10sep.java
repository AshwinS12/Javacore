package java_firstmonth;

import java.util.*;

public class Assignment10sep {

	public ArrayList<Integer> arrayprime(int min,int max) {
		ArrayList<Integer> al = new ArrayList<Integer>();
	for(int n = min;n<max;n++) {
		boolean res= true;
		int a = 2;
		while(a<=n/2) {
			if(n%a==0) {
				res = false;
				break;
			}
			a++;
		}
		if(res) {
			al.add(n);
		}
	}
	return al;
	}
	
	public void Theatre() {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		String []a = {"Bimbi","Shamsher","Vikranth Rona","Top Gun"};
		List<String> aa = Arrays.asList(a);
        HashSet<String> hs = new HashSet<String>(aa);
        pq.addAll(hs);
        if(hs.size()>1){
        	pq.remove();
        }
        for(String x:pq) {
        	System.out.println(x);
        }
	}
	
	public void UnionIntersection() {
		Set<Integer> a = new HashSet<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		Set<Integer> b = new HashSet<Integer>();
		b.add(2);
		b.add(4);
		b.add(6);
		b.add(8);
		
		Set<Integer> union = new LinkedHashSet<Integer>(a);
		union.addAll(b);
		System.out.println(union);
		Set<Integer> inter = new HashSet<Integer>(a);
		a.retainAll(b);
		System.out.println(inter);
	}
	
	public void Repeatedwords(String s) {
		String[]a = s.split(" ");
		HashMap<String,Integer>hm = new HashMap<String,Integer>();
		for(String z : a) {
			if(hm.containsKey(z)) {
				hm.put(z,hm.get(z)+1);
			}
			else {
				hm.put(z, 1);
			}
		}
		for(Map.Entry<String,Integer>me:hm.entrySet()) {
			if(me.getValue()>1) {
			System.out.println(me.getKey()+" : "+me.getValue());
		}	
		}
	}
	public static void main(String[] args) {
	Assignment10sep as = new Assignment10sep();
	System.out.println(as.arrayprime(0, 100));
	as.Repeatedwords("this is this is that throw");
	as.Theatre();
	as.UnionIntersection();

	}

}
