package core;

import java.util.Random;

public class Producerconsumer {
public static class Producer{
	public int materials( ) {
	 Random rand = new Random();
	 int no = rand.nextInt(6);
	 System.out.println("Production is "+no);
	return no;
	}
}
public static class Consumer{
	public int availability( ) {
		Random rand = new Random();
	 int	av= rand.nextInt(10);
	 System.out.println("Consumption is "+av);
return av;	
	}
}
public static class Market{
	public int stock() {
		Random rand = new Random();
		int a= rand.nextInt(5);
		System.out.println("Stock in market is "+a);
	return a;
	}
}
	public static void main(String[] args) {
		//Producerconsumer pc = new Producerconsumer();
	 Producer p = new Producer();
	 Consumer c = new Consumer();
	 Market m = new Market();
	 int avail = c.availability();
	 int mater = p.materials();
	 int stc = m.stock();
	 if (avail>(mater+stc)){
		 System.out.println("Consuming is more , Supply should be increased ");
	 }else if (avail<(mater+stc)) {
		 System.out.println("Production should be stopped, stock still available in market");
	 }else {
		 System.out.println("Ideal solution");
	 }
	 
	 int total =mater+avail+stc;
	 double supply = (double)(mater+stc)/(double)total;
	 double demand = (double)(stc-avail)/(double)total;
	 System.out.println("Probability of supply is "+ supply);
	 System.out.println("Probability of demand is "+ demand); 
	 
	}

}
