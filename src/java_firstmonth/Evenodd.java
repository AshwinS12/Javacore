package java_firstmonth;

import java.util.*;

public class Evenodd {

public void Whole(int n) {
		for(int i=0;i<n;i++) {
		if(i%2==1) {
			int a = i;
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(a);	
	System.out.println("Odd "+ al);
		}
		else if(i%2==0) {
			int b = i;
	LinkedList<Integer>ll = new LinkedList<Integer>();
	ll.addFirst(0);
	ll.add(b);
	ll.pop();
	
	System.out.println("Even "+ ll);
		}
	}
}
//public void vowcons() {
	public void Vowelconsonant() {
  Character[] cc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
  for(int i =0;i<cc.length;i++) {
	Character b = cc[i];
ArrayList<Character> arl = new ArrayList<Character>();
arl.add(b);
	if(arl.contains('a')||(arl.contains('e')||(arl.contains('i')||(arl.contains('o')||(arl.contains('u')))))){
		//continue;
		System.out.println("Vowels   "+ arl);
	}else {
	System.out.println("Consonants " + arl);
	
	}
}
}
	public static void main(String[] args) {
		Evenodd eo = new Evenodd();
		eo.Vowelconsonant();
		eo.Whole(15);
		
	}
}
