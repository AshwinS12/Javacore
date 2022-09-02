package java_firstmonth;

public class Typecasting {
// used for commenting 
	int a = 12; // non static variable
	static int b = 15; // static variable 
	
	public static void main(String[] args) {
		
int c = 20; // local variable 
  Typecasting t = new Typecasting(); // creating the object using new
  System.out.println("Value of a is" + t.a);// a is a global variable hence referenced with object
  System.out.println("Value of b is "+ b);// b is static and accessed anywhere without object
  System.out.println("Value of c is " + c);// c is local variable hence no object required
  
  // Explicit Casting 
  int d = 25;
  long e = d;
  float f = e;
  
  System.out.println("Value of int = " + d);
  System.out.println("Value of long =" + e);
  System.out.println("Value of float =" + f);
  
  //Implicit Casting
  double g= 123.45;
  long h = (long)g;
  int i = (int)h;
  
  System.out.println("Value of double" + g);
 System.out.println("Value of long " + h);
 System.out.println("Value of int" + i);
  
 byte z=1;
 short x=z;
 
 //char cv= x;
 
 int cvb= x;
 long cvbn= cvb;
 float cvbnm=cvbn;
 double xcv=cvbnm;
 System.out.println(xcv);
 
 float qq = 1.2f;
 int qw = (int) qq;
 short qwe = (short)qw;
 byte qwer = (byte)qwe;
 System.out.println(qwer);
	}

}
