package core;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.*;

public class Streams {

	public void Collections() {
	//	List<Integer> list = new ArrayList<Integer>();
		List<Integer>list = Arrays.asList(1,2,3,4,5);
	System.out.println(list.stream().filter(a->a%2==0).toList());
list.stream().map(z->z*z).forEach(System.out::print);
	System.out.println(list.stream().map(i->i*i).reduce(0,(a,b)->a+b));
	System.out.println(list.stream().reduce(0,(x,y)->x+y));
	
	
	List arra = Arrays.asList(1,5,2,4,3);
	//arra.stream().sorted().map().forEach(System.out::print);
	System.out.println();
	int []ar = {1,2,3,4,5};
	int[]arr= {1,2,3,4,5};
	int sum=0;
	int i = 0;
	while(i <= arr.length) {
	      sum += i;
	      i++;
	      System.out.println(sum);
	    }

	/*
	int[] arr = {1,2,3,4,5,6};
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			System.out.print(arr[i]+" ");
		}
	}
	}
	*/
	
	}
	public void dateofbirth() {
		LocalDate date =  LocalDate.now();
		LocalDate yd = LocalDate.of(1987, 11, 22);
		int age  = Period.between(yd,date).getYears();
		System.out.println(age +" years ");
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
	}
	public static void main(String[] args) {
		Streams st = new Streams();
		st.Collections();
		st.dateofbirth();
      
	}

}
//System.out.println( list.stream().map(x->x*2).reduce(0,(a,b)->a+b));
//System.out.println(list.stream().filter(x->x%2==0).toList());
