package java_firstmonth;

public class Overridingp extends Overloading {
 void run () {
	 System.out.println(" this is a sub class ");
 }
 public int add() {
	 int a = 100;
	 int b = 150;
	 System.out.println(" The sub class add is " + (a+b));
	 return (a+b);
 }
 public static void main(String[]args) {
	 Overloading op = new Overridingp();

	 op.run();
	 op.run(10, 20);// this is taken from superclass with 2 parameters
	 op.add();
 }
}
