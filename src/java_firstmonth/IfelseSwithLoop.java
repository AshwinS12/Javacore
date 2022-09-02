package java_firstmonth;

public class IfelseSwithLoop {

	public static void main(String[] args) {
		
int a = 10 ;
int b = 10;
if (a>b) {
	System.out.println("A is greater than B");
}
else if(a==b){
	System.out.println("A is equal to B");
	
}
else {
	System.out.println("B is greater than A ");
}

int c = 0;
for(int n = 1;n<=10;n++) {
	c = c + n;
	
}
System.out.println("The sum of looped values is " + c);

double a1 = a;
double b1 = b;

System.out.println("Explicit type cast of a and b is " + (a1)+ " ," +(b1));

short a2 = (short)a1;
short b2 =(short)b1;
System.out.println("Implicit typecast of a and b is "+ (a2)+" , " + (b2));

int z= 10; // declaring variable for switch
switch(z) {
case 0 :System.out.println("Number is 0");
break;
case 10 : System.out.println("Number is 10");
break;
case 20: System.out.println("Number is 20");
break;
}
int i =0;
while(i<=5) {
System.out.println("Inside while loop"+i);
i++;
}
int j =5;
do {
	System.out.println("Dowhile" + j);
	j--;
}while(j>1);

char grade;
grade = 'A';
switch (grade) {
case 'A':
	System.out.println("The grade is A");
break;
case 'B': 
	System.out.println("The grade is B");
	break;
case 'C':
	System.out.println(" The grade is C");
break;
default: System.out.println("Grade not present, please check the code");
break;
}
// used -= instead of in-10
for(int in = 50 ; in>=10;in-=10) {
	if(in==20 || in ==40) {// used or operator to remove these two variables
		continue;
	}
	System.out.println("continue skipped numbers are " + in);
}

for(int nt=50;nt>10;nt-=10) {
	if(nt==30) {
		break;
		
	}
System.out.println("Values of break values are "+ nt);
}
String ring =  Returnname();
System.out.println(ring);
	}
public static String Returnname() {
String str = "This is return keyword";
return str;
}
}

		


	


