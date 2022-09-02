package java_firstmonth;

public class Overloading {

	// method overloading , same method diff parameters.
	
	 void run() { // no parameters same method
	System.out.println("No parameters");
}
	static void run(int a) { // 1 int parameter same method
		System.out.println("1 parameter " + a);
	}
static void run (String a ) {// 1 string parameter same method
	System.out.println(" 1 parameter string " + a);
}
public int run(int a , int b) {// two non static variables same method
	System.out.println(" 2 parameters with return " + (a + b));
	return (a+b);
}
public double run(int a, int b, double c) {// three non static variables same method
	System.out.println("3 parameters with return " +(a+b+c));
	return(a+b+c);
}
public int add() {
	int a = 10;
	int b = 20;
	System.out.println("Parent class a + b" + (a+b));
	return(a+b);
}
public static void main (String[]args) {
	Overloading o = new Overloading();
	o.run(10,20);// object for non static
	o.run();
	run(100);
	run("String one");
	o.run(10, 20,20.5);// object for non static
}
}
