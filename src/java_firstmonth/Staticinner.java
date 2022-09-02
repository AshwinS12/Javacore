package java_firstmonth;

public class Staticinner {
private int i;

static class inner{
	int j;
	
public void add() {
	Staticinner s = new Staticinner();
	System.out.println("Value is "+ (s.i+j));
}


}
public void add() {
	System.out.println("Value is "+ i);
}
	public static void main(String[] args) {
	//i = 12;

	Staticinner ou = new Staticinner();
	ou.i=10;
	ou.add();
	Staticinner.inner st= new Staticinner.inner();
		st.j = 10;
st.add();
	}

}
