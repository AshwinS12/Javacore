package java_firstmonth;

public class ExampleExten extends ExampleConst {
String b = "String";

void thi() {
	System.out.println(b);
	System.out.println(super.a);
}

	public static void main(String[] args) {
		ExampleExten e = new ExampleExten();
		e.thi();

	}

}
