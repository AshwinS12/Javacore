package java_firstmonth;

public class Leftout {
int c;
static int d;

public class Inner {
	public Inner(){
		System.out.println("This is inner class constructor");
	}
	
	int a = 5;
	public int function() {
		
	 class display{
		 public display() {
			 System.out.println("This is method inner class");
		 }
		 int n;
		public int add() {
			System.out.println("The sum is "+ n);
			
			return n+5;	
		}	 
	 }
	 display dd =new display();
	 dd.n=5;
	 return dd.add();
	}	
}
public static class difference {
	public difference() {
		System.out.println("Static inner class constructor");
	}
	public static void diff() {
		
		 int e =10;
		System.out.println(d-e);
	}
}
	public  Leftout() {
		System.out.println("This is a constructor");
	}
	public Leftout(int a) {
		a = 10;
		System.out.println("Constructor with a parameter "+ a);
	}
	public static void main(String[] args) {
		Leftout l = new Leftout();
    Leftout.Inner li = l.new Inner();
      l.c= li.function();
      System.out.println(l.c);
      d=15;
      difference.diff();
     // Leftout.difference dl = new Leftout.difference();
    //  dl.diff();
      
      Integer z = d;
      int e = z;
      System.out.println(e+z+d);      
	}
	}

	
	

