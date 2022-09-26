package core;

import java.util.*;

public class Probability {
public void runner() {
	Random rand = new Random();
	Integer no = rand.nextInt(9);
	HashMap<Integer,String>hm = new HashMap<Integer,String>();
	hm.put(1,"Red");
	hm.put(2, "Red");
	hm.put(3,"Red");
	hm.put(4, "Red");
	hm.put(5, "Blue");
	hm.put(6,"Blue");
	hm.put(7, "Blue");
	hm.put(8,"Green");
	hm.put(9, "Green");
	hm.put(10, "Green");
	
	if(hm.containsKey(no)) {
	System.out.println("The winner is "+hm.get(no)+" "+ no);
	}
	int red = 4;
	int blue = 3;
    int green = 3;
    int total= red+ green+ blue;
   double redwin = (double)red/(double)total;
   double bluewin = (double)blue/(double)total;
   double greenwin= (double)green/(double)total;
    System.out.println("The probability of red winning is "+ redwin +"and that of blue is "+ bluewin+" and green is "+ greenwin );
}



	public static void main(String[] args) {
		Probability p = new Probability();
		p.runner();

	}

}
