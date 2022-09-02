package java_firstmonth;

import java.io.*;
import java.util.Scanner;

public class SerializationExample{

	public void scan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit for whole number");
		int a = sc.nextInt();
		System.out.println("Whole numbers till " + a+ "are : ");
		for(int n = 0;n<=a;n++) {
			System.out.print(n + " ");
		}sc.close();

		}
	public void scfile() {
		
		System.out.println("Please select the file ");
		try {
		File file = new File("C:\\Users\\ashwi\\OneDrive\\Desktop\\Assignment 18 aug.txt");
		Scanner scn = new Scanner(file);
		while (scn.hasNext()) {
			System.out.println(scn.nextLine());
		}
		scn.close();
	}catch(Exception e) {
		System.out.println(e);
	}
		
	}
	public void scfilewr() {
		
		System.out.println("Please select the file ");
		
		File file = new File("C:\\Users\\ashwi\\OneDrive\\Desktop\\Assignment 18 aug.txt");
		try (Scanner scn = new Scanner(file)) {
			String filecont=" This is a new file";
			while(scn.hasNextLine()) {
				filecont = filecont.concat(scn.nextLine()+"\n");
			}
			FileWriter fw = new FileWriter("C:\\Users\\ashwi\\OneDrive\\Desktop\\Ab.txt");
			fw.write(filecont);
			fw.close();
		
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void FileIO() {
		try {
		SingleInheritance si = new SingleInheritance("This",20);
		FileOutputStream fos = new FileOutputStream ("C:\\Users\\ashwi\\OneDrive\\Desktop\\a.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	 oos.writeObject(si);
	oos.flush();
	oos.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\ashwi\\OneDrive\\Desktop\\a.txt"));
			SingleInheritance si = (SingleInheritance)ois.readObject();
			System.out.println(si.a + " "+ si.b);
			ois.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
	SerializationExample se = new SerializationExample();
	se.scan();
	se.scfile();
	se.FileIO();
	se.scfilewr();
		/*
		try {
			Student s = new Student(21, "Ashwin"); //created object
			
			//creating stream and writing the object
			
			FileOutputStream fos = new FileOutputStream("t.txt"); // convertion to bytes
			
			ObjectOutputStream oos = new ObjectOutputStream(fos); // reads the object and stores in fos
			
			oos.writeObject(s); // writing the object to oos
			oos.flush();
			oos.close();
			
			System.out.println("Success");
		} catch(Exception e) {
			System.out.println(e);
		} try {
			// creating stream to read the object
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("t.txt"));
			Student s =(Student) ois.readObject();
			
			System.out.println(s.id +""+ s.name);
			ois.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
*/
	}
}

