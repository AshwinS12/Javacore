package java_firstmonth;

public class Aug18en extends Aug18ab{
int a = 10;
int b;
static int c = 20;
static int d;
private int prod;
private int div;

@Override
	void add() {
	b =15;
		System.out.println("Sum is "+ (a+b));
		
	}

	public int getProd() {
		return prod;
	}

	public void setProd(int prod) {
		this.prod = prod;
	}

	public int getDiv() {
		return div;
	}

	public void setDiv(int div) {
		this.div = div;
	}
	public void bufferbuilder() {
		long st = System.currentTimeMillis();
		StringBuffer ss = new StringBuffer();
		for(int i =0;i<25000;i++) {
			ss.append("Vtalent");
		}
		System.out.println("Time taken in buffer is "+ (System.currentTimeMillis()-st)+"millisecs");
	StringBuilder sb = new StringBuilder();
	for(int j = 0 ; j<25000;j++) {
		sb.append("Vtalent");
	}
		System.out.println("Time taken in builder is "+(System.currentTimeMillis()-st)+"millisecs");
	
	
	}
void add(int a) {
	int b = 1;
	System.out.println("sum of single parameterised variables "+ (a+b));
}
void diff(int a, int b) {
	System.out.println("Diff between 2 parameterised variables is "+(a-b));
}
	@Override
	void diff() {
	d = 10;
	System.out.println("Diff is "+(c-d));
	}
	public static void main(String[] args) {
		Aug18en au = new Aug18en();
	au.add();
	au.diff();
	au.setProd(d*c);
System.out.println("Prod is " +au.getProd());
au.setDiv(c/d);
System.out.println("Div is "+ au.getDiv());
au.add(5);
au.diff(5,3);
	au.bufferbuilder();
	String a = "This";
	System.out.println(a.toUpperCase());
	System.out.println(a.toLowerCase());
	System.out.println(a.charAt(2));
	System.out.println(a.contains("i"));
	System.out.println(a.isEmpty());
	System.out.println(a.endsWith("s"));
	String b ="that";
	System.out.println(a.concat(b));
 System.out.println(a.compareToIgnoreCase(b));// returns int value of compared values
	
	}
}
