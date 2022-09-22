package core;

public class Phones implements Comparable<Phones> {
private String brand;
private int price;
private int ram;

public Phones(String brand, int price, int ram) {
	super();
	this.brand = brand;
	this.price = price;
	this.ram = ram;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
@Override
public String toString() {
	return "Phones [brand=" + brand + ", price=" + price + ", ram=" + ram + "]";
}
@Override
public int compareTo(Phones ph2) {
	// there will be 2 objects now to compare
	//this . > lap 2 = +;
	//this. <lap2 = -;
	//this. = lap = 0;
	
	if(this.getRam()>ph2.getRam()) {
		return 1; //any positive number
	}else {
	
	return -1;
}

}

}
