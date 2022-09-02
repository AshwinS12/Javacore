package java_firstmonth;

import java.util.*;

public class ExampleMap {
	
	// what is the internal working of hashmap
	

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "java");
		map.put(2, "session");
		map.put(3, "on map");
		map.put(4, "");
		map.put(null, null);
		//non-generic
		//Set s = map.entrySet();  //converting to set so that we get traverse
	
	//	Iterator i = s.iterator();
		
		//while(i.hasNext()) {
		//	Map.Entry e = (Map.Entry)i.next();  //map.entry to get key and value separately 
		//	System.out.println(e.getKey() +""+ e.getValue());
		//}
		
		//generic
		for(Map.Entry<Integer,String> m : map.entrySet()) {
			System.out.println(m.getKey() +""+ m.getValue());
		}

	}

}
