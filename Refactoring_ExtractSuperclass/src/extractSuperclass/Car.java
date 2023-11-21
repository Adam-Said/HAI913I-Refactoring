package extractSuperclass;

public class Car {
    private String brand;
    private int year;
    private int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        this.brand = brand;
        this.year = year;
        this.numberOfDoors = numberOfDoors;
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



	public int getNumberOfDoors() {
		return numberOfDoors;
	}



	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}



	public void drive() {
       
    }
}
