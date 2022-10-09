package core;

public class Threadspractice {
	public static void main(String[] args) throws InterruptedException {
		Operation o = new Operation();
		Hi h = new Hi(o);
		Hello he = new Hello(o);
		h.start();
		Thread t = new Thread(he);
		t.start();
		h.join();
		t.join();
	System.out.println("Execution done");
	}
}
class Operation{
	private int num;
	boolean result = false;
	public Operation() {	
	}
	public synchronized int get() throws InterruptedException {
		while(result ==false) {
			wait();
		}
		result = false;
		notify();
		return num;
	}
	public synchronized void put(int num) throws InterruptedException {
		while(result==true) {
			wait();
		}
		result = true;
		this.num=num;
		notify();
	}
	
}
 class Hi extends Thread{
private Operation op;
public Hi(Operation op) {
		this.op=op;
	}
public void run() {
	for(int i =0;i<5;i++) {
		try {
			op.put(i);
			System.out.println("hi method"+i);
			sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
	
}
class Hello implements Runnable{
	private Operation op;
	public Hello(Operation op) {
		this.op = op;
	}
	public void run() {
		for(int i =0;i<5;i++) {
			try {
				int val = op.get();
				System.out.println("hello method"+ val);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
	
}