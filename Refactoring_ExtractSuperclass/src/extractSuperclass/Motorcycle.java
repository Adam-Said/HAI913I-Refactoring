package extractSuperclass;

public class Motorcycle {
	private String brand;
	private int year;
	private boolean hasSideCar;

	public Motorcycle(String brand, int year, boolean hasSideCar) {
		this.brand = brand;
		this.year = year;
		this.hasSideCar = hasSideCar;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isHasSideCar() {
		return hasSideCar;
	}

	public void setHasSideCar(boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}

	public void ride() {

	}
}
