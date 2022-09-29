package core;



public class Vtalent {

	public static void main(String[] args) {
		
Vtalent vt = new Vtalent();
Training t1 = new Training();

Course cs = new Course(t1,20);
Thread t2 = new Thread(cs);

Trainer trr = new Trainer(t1,10);
t2.start();
trr.start();

	}

}
class Training {
private int num;
private boolean avail= false;


public synchronized int get() {
	while(avail==false) {
		try {
			wait();
		}catch(Exception ie) {
			ie.printStackTrace();		}
	}
	avail= false;
	notifyAll();
	return num;
}
public synchronized void put(int st) {
	while(avail==true) {
		try {
			wait();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	avail=true;
	num = st;
	
	notifyAll();
	
}
}
class Course implements Runnable{
	private Training tr;
	private int batch;
	
	public Course(Training tr,int batch) {
		this.batch=batch;
		this.tr=tr;
		
	}
	public void run() {
		String[] arr = {".Net","Java","Devops"};
		for(int a = 0;a<arr.length;a++) {
		int stu = 0;
		for(int i = 0;i<10;i++) {
		stu = tr.get();	
		System.out.println("Course "+ batch+"student count:  "+stu);
		}
	}
}
}
class Trainer extends Thread{
	private Training tr;
	private int av;
	
	public Trainer(Training tr , int av) {
		this.tr= tr;
		this.av=av;
	
	}
	
	public void run() {
		String[] arr = {".Net","Java","Devops"};
		for(int a = 0;a<arr.length;a++) {
		for(int i =0;i<10;i++) {
			tr.put(i);
			System.out.println(arr[a]+"Trainer available for "+ i+" hours ");
		try {
			sleep(400);
		}catch(Exception e) {
		}
		}
		}
	}
 }
