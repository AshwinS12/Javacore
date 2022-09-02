package java_firstmonth;

public class Absexte extends Abstract {

	private String id;
	private String pwd;

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	@Override
	void add() {
		System.out.println("abstract");
		
	}
	public void diff() {
		System.out.println("Child diff");
		
	}
	public void bike() {
		System.out.println("This is my bike");
	}
	public void bike(int a) {
		a=2;
		System.out.println("Second bike");
	}
	public void car(int a) {
		System.out.println("this is my car");
	}
	
	public static void main(String[] args) {
Absexte ab = new Absexte();
ab.add();
		ab.setId("Login");
		System.out.println(ab.getId());
		
		
		ab.diff();
		ab.diff(0);
		ab.bike();
		ab.car(1);
		ab.bike(2);
		ab.car();
	}



}
