package java_firstmonth;

public class Operators{
	
	int a;
	public void palin(int n) {
		  int temp = n;
//1 2 1   
// 
		  int rem;
		  int tot=0;
		while(n>0) {
		rem = n%10;
		tot = (tot*10)+rem;
		n = n/10;
		}
		if(temp==tot) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not palindrome");
		}
		
	}

	public static void main(String[] args) {
	Operators op = new Operators();
	op.palin(121);
	}
}