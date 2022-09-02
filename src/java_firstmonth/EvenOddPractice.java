package java_firstmonth;

public class EvenOddPractice {

	int num=10;
	public static void main(String[] args) {
EvenOddPractice n = new EvenOddPractice();

System.out.print("The odd numbers from 1 to 10 are");
 for(int i=1;i<10;i++) {
	 if(i%2==0) {
		 continue;
	 }System.out.print(" " + i);
	
 } 
 System.out.println(" ");
 System.out.println("The non static value are "+ n.num);
 System.out.print("the even numbers from 1 to 10 are");
 for(int j = 2;j<10;j++) {
	 if(j%2!=0)
	 //if(j%3==0)
		 {
		 continue;
	 }System.out.print(" "+ j);
 }
 System.out.println(" ");
 for(int q=1;q<5;q++) {
	 for(int r = 5;r>0;r--) {
		 System.out.println((r)+" "+ q);
	 }
 }
	}

}
