package core;

public class Threads implements Runnable{
	
	public void run() {
		System.out.println("Running the thread");
	}

	public static void main(String[] args) {
		Threads t = new Threads();
		Thread t1 = new Thread(t);  // using the constructor thread
		
		t1.start();

	}

}
