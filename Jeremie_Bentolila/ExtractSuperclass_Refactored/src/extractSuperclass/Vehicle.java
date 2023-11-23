package extractSuperclass;

public class Vehicle {

	private String brand;
	private int year;
	
	public Vehicle(String brand, int year) {
		super();
		this.brand = brand;
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}
	public int getYear() {
		return year;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
