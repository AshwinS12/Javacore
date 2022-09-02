package java_firstmonth;

public class StringsConcept {

	public static void main(String[] args) {
		String a = "ASHWIN"; // creating string using literal method
		String a1 = new String ("Ashwin"); // using new keyword
		String a2 = "";
		String a3 = "    A S H W I N    ";
		String a4 = "Hi this is Ashwin";
		int b = 123;
		
		 // changing uppercase to lowercase .
		System.out.println(" Using lowercase method  " + a.toLowerCase());
	    // changing lowercase to uppercase . 
		System.out.println("Using uppercase method  " + a.toUpperCase());
		// picking up a particular index from the lot
		System.out.println("The character at 3rd index is  " + a1.charAt(3));
		// to check if object of one string equals another, gives boolean value in op
		System.out.println("Equals method " + a.equals(a1));
// returns value as true only if length=0,will return false,even if  blank space present
		System.out.println("Return method " + a3.isEmpty());
		System.out.println("Return method " + a2.isEmpty());
		// replace a character or series of characters in the string
		System.out.println("Replace method " + a1.replace("Ashwin", "Ash"));
		// compares two strings ignoring cases and returns a boolean value
		System.out.println("Equals ignore case " + a.equalsIgnoreCase(a1));
		// removes blanks spaces before and after the string but not in between
		System.out.println("Trim method " + a3.trim());
		// to check if the string contains specific characters 
		System.out.println("Contains method " +a4.contains("Hi"));
		// to create a small sub part of the existing string 
		System.out.println(" Substring method " +a4.subSequence(0, 7));
		// to get the character at that specific index
		System.out.println(" char at method " + a4.charAt(5) );
		// to get total index size of the string from 0,1,2,----
		System.out.println("length method "+ a4.length());
		// to check if the string value is starting from a particular prefix 
		System.out.println(a4.startsWith("Hi"));
		// to check if the string value ends with a particular suffix
		System.out.println(a4.endsWith("in"));
		// convert any data type to String 
		String bb = String.valueOf(b);
		System.out.println(" Value of method "+ bb);

		long st = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<10000;i++){
			sb.append("asd");
	}
	System.out.println("Time taken for string builder is " + (System.currentTimeMillis() - st) + "millisecs");
st = System.currentTimeMillis();
StringBuffer sb2 = new StringBuffer();
for(int i=0;i<10000;i++){
sb2.append("asdf");
	}
	System.out.println("time taken by string buffer is "+(System.currentTimeMillis()-st)+"millisecs");

	}
	}


