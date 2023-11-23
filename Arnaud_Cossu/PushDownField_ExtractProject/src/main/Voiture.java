package main;

public class Voiture extends Vehicule {

	public Voiture() {
		super();
	}

	public Voiture(String name, double horsePower, int doorNumber, double trunkLiters) {
		super(name, horsePower, doorNumber, trunkLiters);
	}

	public Voiture(String name, double horsePower) {
		super(name, horsePower);
	}
}
