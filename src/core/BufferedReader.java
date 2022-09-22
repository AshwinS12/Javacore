package core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BufferedReader {

	public static void main(String[] args) {
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("demo.txt");
			try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject("this is a file input stream");
			}
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("demo.txt"))) {
				Object h = ois.readObject();
				System.out.println(h);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}