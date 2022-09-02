package java_firstmonth;

public class RunTime2 extends RunTimePoly {
	void run() {
		System.out.println("safely with 50km");
	}

	public static void main(String[] args) {
		RunTimePoly a = new RunTime2();  //upcasting
		a.run();

	}

}
