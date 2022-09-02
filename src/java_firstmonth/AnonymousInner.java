package java_firstmonth;

public class AnonymousInner {
	

	public static void main(String[] args) {
		Abc e = new Abc() {
			
			@Override
			public void function() {
				System.out.println("Example");
				
			}
		};
		
		Abcd a = new Abcd() {
			
			@Override
			public void function() {
				System.out.println("Example2");
				
			}
		};
		a.function();
		e.function();

	}

}
