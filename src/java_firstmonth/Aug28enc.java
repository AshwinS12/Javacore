package java_firstmonth;

public class Aug28enc extends Aug28abstract{

private int mul;
private int div;
private int a;
private int b;
	
	
	
	
	
	public static void main(String[] args) {
	Aug28enc al = new Aug28enc();
	al.setA(10);
	al.setB(15);
	int c = al.a*al.b;
	int d = al.b/al.a;
	al.setMul(c);
	al.setDiv(d);
System.out.println(al.getDiv());
System.out.println(al.getMul());
System.out.println(al.add());
System.out.println(al.diff());
	}





	public int getMul() {
		return mul;
	}





	public void setMul(int mul) {
		
		this.mul = mul;
	}





	public int getDiv() {
		return div;
	}





	public void setDiv(int div) {
		
		this.div = div;
	}





	public int getA() {
		return a;
	}





	public void setA(int a) {
		this.a = a;
	}





	public int getB() {
		return b;
	}





	public void setB(int b) {
		this.b = b;
	}





	@Override
	int add() {
		System.out.println(a+b);
		return a+b;
	}





	@Override
	int diff() {
	System.out.println(a-b);
		return a-b;
	}
	

}
