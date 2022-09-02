package java_firstmonth;

public class OuterStatic {
	private int i;
	
	public void function() {
		System.out.println("outer class" +i);
	}
	
	static class Inner {
		float f;
		
		public void function() {
			OuterStatic o = new OuterStatic(); // it is cosidering as new
			System.out.println("Inner class" +(f+o.i));
		}
	}

	public static void main(String[] args) {
		OuterStatic o = new OuterStatic(); //assigned value and executed
		o.i = 10;
		o.function();
		
		OuterStatic.Inner in = new OuterStatic.Inner();
		in.f = 1.5f;
		in.function();

	}

}
