package core;

public class Node {

	int data;
	Node next;
}
class LinkedList {
  Node head;
  
  public void insert(int n) {
	  Node node = new Node();
	  node.data=n;
	  node.next=null;
	  
	  if(head==null) {
		  head=node;
	  }else {
		  Node no = head;
		  while(no.next!=null) {
			  no=no.next;
		  }
		  no.next=node;
	  } 
  }
  public void show() {
	  Node node = head;
	  while(node.next!=null) {
		  System.out.println(node.data);
		  node=node.next;
	  }
	  System.out.println(node.data);
  }

}