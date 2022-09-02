package java_firstmonth;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {
		
	Stack<Integer> i = new Stack<Integer>();
	i.push(123);
	i.add(234);
	i.push(345);
	System.out.println(i);
	// peek will check topmost element of stack but wont delete it
	System.out.println(i.peek());
	i.push(520);
	//i.push(sq);
	System.out.println(i);
	//pop will remove the top most element of stack ,as it follows LIFO, it
	//removes the most recent one
	i.pop();  
System.out.println(i);
i.add(0,0);

Iterator<Integer> in = i.iterator();
while(in.hasNext()) {
	System.out.println(in.next());
}
Stack<String> st = new Stack<String>();
st.push("a");
st.push("e");
st.push("i");
st.push("o");
st.push("u");
for(String d :st) {
	System.out.println(d);
}
	
PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
pq.add(12);
pq.add(15);
pq.add(18);
pq.add(21);
System.out.println("Element" + pq.element());
System.out.println("Peek " + pq.peek());
for(Iterator<Integer> iq = pq.iterator();iq.hasNext();) {
	System.out.println(iq.next());
	
}
PriorityQueue <String> pr = new PriorityQueue<String>();
pr.add("This");
pr.add("Is");
pr.add("Priority");
pr.add("Queue");
System.out.println("Peek" + pr.peek());
for (String iz: pr) {
	System.out.println(iz);
}
Deque<Integer> de = new ArrayDeque<Integer>();
	
de.add(10);
de.add(5);
de.add(15);
de.addLast(90);
System.out.println(de.peek());
Iterator<Integer> ind = de.iterator();
while(ind.hasNext()) {
	System.out.println(ind.next());
}
Deque<String> ds = new ArrayDeque<String>();
ds.add("This ");
ds.add("is");
ds.add("Deque");
ds.addFirst("yes!");
for(String ff:ds) {
	System.out.println(ff);
	//deque means double ended que
}

}
	
	}


