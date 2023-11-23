package main;

public class Voiture extends Vehicule {

	private int doorNumber;
	private double trunkLiters;

	public Voiture() {
		super();
	}

	public Voiture(String name, double horsePower, int doorNumber, double trunkLiters) {
		super(name, horsePower);
		this.doorNumber = doorNumber;
		this.trunkLiters = trunkLiters;
	}

	public Voiture(String name, double horsePower) {
		super(name, horsePower);
	}

	@Override
	public String toString() {
		return super.toString() +
			"Nombre de portes : " + this.doorNumber + "\n"
			+ "Litrage du coffre : " + this.trunkLiters + "\n";
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
