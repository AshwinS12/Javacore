package java_firstmonth;

public class ExtendedAbstract extends Abstractcls {
// adding unimplemented methods by right click or hovering over error
	int a = 10;
	int b = 20;
	@Override
	public void add() {
		System.out.println("Add is " + (a+b));
		
	}

	@Override
	public void diff() {
System.out.println("Diff is " + (b-a));
		
	}

	public static void main(String[] args) {
		Abstractcls ab = new ExtendedAbstract();
		ab.add();
		ab.diff();

	}

}
