package extractSuperclass;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super();
		this.brand = brand;
        this.year = year;
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public void drive() {
       
    }
}
