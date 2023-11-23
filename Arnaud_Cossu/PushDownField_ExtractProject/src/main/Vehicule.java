package main;

/**
 * 
 */
public class Vehicule {

	private String name;
	private double horsePower;
	private int doorNumber;
	private double trunkLiters;
	
	public Vehicule(String name, double horsePower, int doorNumber, double trunkLiters) {
		super();
		this.name = name;
		this.horsePower = horsePower;
		this.doorNumber = doorNumber;
		this.trunkLiters = trunkLiters;
	}
	
	public Vehicule(String name, double horsePower) {
		super();
		this.name = name;
		this.horsePower = horsePower;
	}
	
	public Vehicule() {}
	
	@Override
	public String toString() {
		return 	this.name + "\n" 
				+ "Chevaux : " + this.horsePower + "\n"
				+ "Nombre de portes : " + this.doorNumber + "\n"
				+ "Litrage du coffre : " + this.trunkLiters + "\n";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(double horsePower) {
		this.horsePower = horsePower;
	}
	public int getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}
	public double getTrunkLiters() {
		return trunkLiters;
	}
	public void setTrunkLiters(double trunkLiters) {
		this.trunkLiters = trunkLiters;
	}
}
