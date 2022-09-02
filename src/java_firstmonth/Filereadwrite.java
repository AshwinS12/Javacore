package java_firstmonth;

import java.io.*;
import java.util.Scanner;

public class Filereadwrite {

	public void fileoutput() {
		try {
FileOutputStream fos = new FileOutputStream("C:\\Users\\ashwi\\OneDrive\\Desktop\\a.txt");
ObjectOutputStream oos = new ObjectOutputStream(fos);
		SingleInheritance si = new SingleInheritance("This is the file",20);
		
		oos.writeObject(si);
		oos.flush();
		oos.close();
		
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
	}
	}
	public void fileinput() {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\ashwi\\OneDrive\\Desktop\\a.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			SingleInheritance si = (SingleInheritance) ois.readObject();
		  ois.close();
		  System.out.println(si.a+" "+ si.b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void Scannerfile() {
	try {
		File file = new File("C:\\Users\\ashwi\\OneDrive\\Desktop\\Java notepad\\Java assignments\\assignment.txt");
	Scanner scan = new Scanner(file);
		while(scan.hasNext()) {
		  System.out.println(scan.nextLine());
		} scan.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
	public void Scannerwrite() {
		try {
			FileWriter fw = new FileWriter("C:\\Users\\ashwi\\OneDrive\\Desktop\\at.txt");
			//Scanner scan = new Scanner (file);
			fw.write("This is used from scanner file writer");
			fw.write(1);
			fw.close();
		}catch(Exception e) {
			System.out.println("exception");
		}
	}
	public void csvreader() {
		String path = "C:\\\\Users\\\\ashwi\\\\OneDrive\\\\Desktop\\Time Sheeet_java 20th batch - Ashwin S.csv";
		String line = " ";
		
			try (BufferedReader br = new BufferedReader(new FileReader(path))) {
				while((line = br.readLine())!=null) {
					String[] val = line.split(",");
				for(int i=0;i<val.length;i++) {
					System.out.print(val[i]+" ");
					}System.out.println();
				}
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
	Filereadwrite rw = new Filereadwrite();
	rw.fileoutput();
	rw.fileinput();
	rw.Scannerfile();
	rw.Scannerwrite();
	rw.csvreader();
	}

}
