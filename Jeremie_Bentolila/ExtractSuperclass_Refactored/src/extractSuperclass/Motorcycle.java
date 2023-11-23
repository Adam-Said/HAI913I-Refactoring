package extractSuperclass;

public class Motorcycle extends Vehicle {
	
	private boolean hasSideCar;

	public Motorcycle(String brand, int year, boolean hasSideCar) {
		super(brand, year);
		this.hasSideCar = hasSideCar;
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
