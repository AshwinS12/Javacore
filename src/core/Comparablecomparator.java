package core;

import java.util.*;

public class Comparablecomparator {

	public static void main(String[] args) {
		List<Phones> ph = new ArrayList<Phones>();
		ph.add(new Phones("Google",35000,8));
		ph.add(new Phones("Apple",38000,4));
		ph.add(new Phones("Samsung",37000,6));
	
		//Collections.sort(list); this is used for list of int 
//now after implements comparable, it will now allow .sort after adding
		// compareto method
		Collections.sort (ph);
		for(Phones p :ph) {
			System.out.println(p);
		}
	Comparator<Phones> com = new Comparator<Phones>() {

		@Override
		public int compare(Phones p1, Phones p2) {
		if(p1.getPrice()>p2.getPrice())	{
			return 1;
		}
		else {
			return -1;
		}
		}
	}; // anonymous inner class concept
	Collections.sort(ph,com);
	for(Phones p1:ph) {
		System.out.println(p1);
	}
	}
}

