package java_firstmonth;

import java.time.*;
import java.util.*;

public class Aug28all extends Aug28enc {
	static int a=0 ;
	 int b=1;
	int c = 0;
	
	public static class Innerclass {
		public static void display() {
			System.out.println("This is from Innerclass static "+(a));
		}
		public static void addition() {
			System.out.println(a);
		}
	}
	public class nonstatic{
		public void nonstat() {
			System.out.println("This is from non static class"+(b+c));
		}
	}
	public void simple() {
		System.out.println("example of polymorphism");
	}
		
	public void simple(int a) {
		System.out.println("examle of polymorphism"+a);
	}
	public int add() {
		System.out.println("example of polymorphism");
		return 0;
	}
	public void stringmethods() {
		String s = "This is ,a String";
		String s1 = new String("This is a ,new String");
		System.out.println(s.charAt(0));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.compareTo(s1));
		System.out.println(s1.concat("this"));
		System.out.println(s1.contains(s));
		System.out.println(s.strip());
		System.out.println(s1.compareToIgnoreCase(s));
	}
	public void Stringbufferbuilder() {
		StringBuffer sb = new StringBuffer();
		long a = System.currentTimeMillis();
		for(int b = 0;b<123456;b++) {
			sb.append("This is a test");
		}
		System.out.println("StringBuffer "+(System.currentTimeMillis()-a)+"millisecs");
	StringBuilder sb1 = new StringBuilder();
	a=System.currentTimeMillis();
	for(int z = 0 ; z<123456;z++) {
		sb1.append("This is a test");
	}System.out.println("StringBuilder "+ (System.currentTimeMillis()-a)+"millisecs");
	}
	public void Lists() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(null);
		al.clone();
		al.add(2, 11);
		al.remove(1);
		Iterator<Integer>it = al.iterator();
		System.out.println("ArrayList ");
		while(it.hasNext()) {
			System.out.print(it.next());
		}System.out.println();
		
		ArrayList<Integer[]>all = new ArrayList<Integer[]>();
		Integer[]arr= {1,2,3,4,5,6};
		all.add(arr);
		all.isEmpty();
		all.remove(0);
		all.add(arr);
		for(int a=0;a<all.size();a++) {
			Integer[] b = all.get(a);
			System.out.println("ArrayList ");
			for(int z:b) {
				System.out.print(z);
			}System.out.println();
		}
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("is");
		ll.addFirst("This");
		ll.add("a");
		ll.addLast("String");
		ll.add("Yes");
		ll.remove(3);
        Iterator<String> ii = ll.iterator();
        System.out.println("LinkedList ");
        while(ii.hasNext()) {
        	System.out.print(ii.next());
        }System.out.println();
        LinkedList<String[]>li = new LinkedList<String[]>();
        String[]ary = {"this","is","string"};
        li.add(ary);
        Iterator<String[]> rr = li.iterator();
        System.out.println("LinkedList ");
        while(rr.hasNext()) {
        	String[] h = rr.next();
        	System.out.print( Arrays.toString(h));
        }System.out.println();
        Stack<Integer> ss = new Stack<Integer>();
        ss.push(10);
        ss.peek();
        ss.pop();
        ss.push(12);
        ss.push(14);
        ss.pop();
        ss.push(15);
        System.out.println("Stack ");
        for(int x:ss) {
        	System.out.print(x);
        }System.out.println();
        Vector<String>vs = new Vector<String>();
        vs.add("This");
        vs.add(0, "String");
        System.out.println("Vector ");
        for(String v:vs) {
        	System.out.print(v);
        }System.out.println();
	}
	public void Queue() {
		PriorityQueue<Integer>pq = new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(20);
		pq.poll();
		pq.add(30);
		pq.add(5);
		pq.remove();
		System.out.println("PriorityQueue");
		Iterator<Integer>it = pq.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}System.out.println();
		Deque<String> ad = new ArrayDeque<String>();
		ad.add("This");
		ad.addFirst("No1");
		ad.addLast("yes");
		ad.removeFirst();
		System.out.println("ArrayDeque ");
		for(String h:ad) {
			System.out.print(h+" ");
		}
	}
	public void Set() {
		HashSet<Integer>hs = new HashSet<Integer>();
		hs.add(100);
		hs.add(50);
		hs.add(51);
		System.out.println("HashSet ");
		for(int z:hs) {
			System.out.print(z);
		}
		Integer are[] = {1,2,3,4,5};
		List<Integer> l = Arrays.asList(are);
		LinkedHashSet<Integer>lhs = new LinkedHashSet<Integer>(l);
		System.out.println("Set");
		for(int a:lhs) {
			System.out.print(a);
		}
		TreeSet<String>ts = new TreeSet<String>();
		ts.add("This");
		ts.add("is");
		ts.add("String");
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.floor("is"));
		System.out.println("Treeset");
		for(String h:ts) {
			System.out.print(h);
		}
		String[] ary = {"this","is","String"};
		List<String> li =Arrays.asList(ary);
		TreeSet<String>tt = new TreeSet<String>(li);
		System.out.println("TreeSet ");
		for(String e:tt) {
			System.out.print(e);
		}System.out.println();
	}
	public void map() {
		HashMap<Integer,String>hm =new HashMap<Integer,String>();
		hm.put(1, null);
		hm.put(2, "This");
		hm.put(3, "String");
		System.out.println(hm.keySet());
		for(Map.Entry<Integer,String>me:hm.entrySet()) {
			System.out.println(me.getKey()+" : "+ me.getValue());
		}
		LinkedHashMap<Character,Double>lhm = new LinkedHashMap<Character,Double>();
		lhm.put('A', 10.5);
		lhm.put('B', 12.5);
		lhm.putIfAbsent('C', 10.5);
		for(Map.Entry<Character,Double>mm:lhm.entrySet()) {
			System.out.println(mm.getKey()+" :"+mm.getValue());
		}
		TreeMap<Integer,Integer>im = new TreeMap<Integer,Integer>();
		im.put(1, 1);
		im.put(2, 2);
		im.put(3,3);
		System.out.println(im.pollFirstEntry());
		System.out.println(im.pollLastEntry());
		for(Map.Entry<Integer,Integer>em:im.entrySet()) {
			System.out.println(em.getKey()+":"+em.getValue());
		}
	}
	public void fibonacci(int n) {
		
		if(n>0) {
			c = a+b;
			a=b;
			b=c;
			System.out.println("Fibonnaci " +c);
			fibonacci(n-1);
		}
	}
	public void palin(int n) {
		int sum = 0;
		int rem = 0;
		int temp = n;
		while(n>0) {
			rem = n%10;
			sum = (sum*10)+rem;
			n=n/10;
		}if(temp==sum) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Nt Palindrome");
		}
	}
	public void vowcons(String n) {
		n = n.toLowerCase();
		int vcount = 0;
		int ccount=0;
		char[]c = n.toCharArray();
		for(int i =0;i<c.length;i++) {
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
				vcount++;
			}else if(c[i]>'a'&&c[i]<'z') {// to remove spaces
				ccount++;
			}
		}System.out.println("Vowels "+vcount);
		System.out.println("Consonants "+ccount);
		
	}
	public void strpalind(String n) {
		n= n.toLowerCase();
		boolean flag = true;
	for(int i=0;i<n.length()/2;i++) {
		if(n.charAt(i)!=n.charAt(n.length()-i-1)) {
			flag = false;
			break;
		}
	}
		if(flag) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}
	
	public void duplicate(String n ) {
		char[] a = n.toCharArray();
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(char x:a) {
			if(hm.containsKey(x)) {
				hm.put(x,hm.get(x)+1);
			}else {
				hm.put(x,1);
			}
		}
		for(Map.Entry<Character,Integer>me:hm.entrySet()) {
			System.out.println(me.getKey()+" : "+me.getValue());
		}
	}
	public void duplicatestr(String n) {
		n=n.toLowerCase();
		String[] a = n.split(" ");
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		for(String z:a) {
			if(hm.containsKey(z)) {
				hm.put(z, hm.get(z)+1);
			}else {
				hm.put(z, 1);
			}
		}for(Map.Entry<String,Integer> me:hm.entrySet()) {
			System.out.println(me.getKey()+" : "+me.getValue());
		}
	}
	public void sort() {
		Integer []arr = {1,2,4,3,2};
		List<Integer> a = Arrays.asList(arr);
		Collections.sort(a);
		System.out.println(a);
	}
	public String revstring(String n) {
		
		String rev = " ";
		String[]s = n.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=s.length-1;i>=0;i--) {
			sb.append(s[i]).append(" ");
		}System.out.println(sb);
		return rev;
	}
	public String revchar(String n) {
		char[] a = n.toCharArray();
		StringBuffer sb = new StringBuffer();
		String rev = " ";
		for(int i = a.length-1;i>=0;i--) {
			sb.append(a[i]).append("");
		}
		System.out.println(sb);
		return rev;
		
	}
	public void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}System.out.println();
		}for(int i = n;i>0;i--) {
			for(int j =1;j<i;j++) {
				System.out.print(j+" ");
			}System.out.println();
		}
	}
	public void random() {
		Random rand = new Random();
	int a = rand.nextInt(10);
	System.out.println(a);
	}
	public void age() {
	LocalDate today =	LocalDate.now();
	LocalDate dob = LocalDate.of(1992,05,28);
	int age = Period.between(dob,today).getYears();
	System.out.println(age);
	}
	public ArrayList<Integer> primenos(int st , int en) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int n=st;n<en;n++) {
		int i = 2;
		boolean flag = true;
		while(i<=n/2) {
			if(n%i==0) {
				flag = false;
			break;
		} i++;
	}if(flag) {
		al.add(n);
	}
}return al;
	}
	public void minmax() {
		int[]a = {1,2,3,4,5};
		int min = 1;
		int max = 1;
		for(int i = 0;i<a.length;i++) {
		if(a[i]<min) {
			min=a[i];
		}else if(a[i]>max) {
			max = a[i];
		}
	}System.out.println(min);
	System.out.println(max);
	}
	public void arrayrev() {
		int[]a = {1,2,3,4,5};
		int z = 0;
		int rev[] = new int[a.length];
		for(int i = a.length-1;i>=0;i--) {
			rev[z]=a[i];
			System.out.print(rev[z]+" ");
		}System.out.println();
	}
	public void oddeven(int n) {
		for(int i = 0;i<n;i++){
		if(i%2==0) {
			Deque<Integer>hs = new ArrayDeque<Integer>();
			hs.add(i);
			System.out.println("Even: "+ i);
		}else {
			HashSet<Integer>hs1 = new HashSet<Integer>();
			hs1.add(i);
			System.out.println("Odd: "+ i);
		}
	}
	}
	
	public void numtoword(int n) {
		int tens=n/10;
		if(n<0) {
			System.out.println("error");
		}else {
			int ut = n%10;
			int tt = tens%10;
			int ht = n/100;
			
String[]un= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
String[]tn = {"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
String hn = "Hundered";
if(n<20) {
	System.out.println(un[n]);
}else if(n<100&&n>20) {
	System.out.println(tn[tt]+""+un[ut]);
}else {
	System.out.println(un[ht]+hn+tn[tt]+""+un[ut]);
}	
		}
	}
	public static void main(String[] args)  {
		Aug28all al = new Aug28all();
	//int a = 10;
	//double b = a;
	
	//double c = 12.2;
	//int d = (int)c;
	al.add();
	al.stringmethods();
	al.Stringbufferbuilder();
	al.Lists();
	al.Queue();
    al.Set();
    al.map();
    al.fibonacci(4);
    al.palin(12321);
    al.vowcons("This is a String");
    al.strpalind("Madam");
    al.duplicate("This is a very good thing");
    al.duplicatestr("This , is this is really good");
    al.sort();
    al.revstring("This is that");
    al.revchar("Atmosphere");
    al.pattern(5);
    al.random();
    al.age();
    System.out.println(al.primenos(0, 90));
    al.minmax();
    al.arrayrev();
    al.oddeven(10);
    al.numtoword(545);
    
    Innerclass.display(); // static innerclass
    Innerclass.addition();
    Aug28all.nonstatic ns = al.new nonstatic();
    ns.nonstat();
    
    
    
	}

}
