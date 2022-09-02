package java_firstmonth;

public class Encapsula {
private int id;
private String name;
private long mobile ;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public static void main(String[]args) {
	Encapsula en = new Encapsula();
	en.setId(1);
	System.out.println(en.getId());
	en.setName("Ash");
	System.out.println(en.getName());
	en.setMobile(903228592);
	System.out.println(en.getMobile());
	
}

}
