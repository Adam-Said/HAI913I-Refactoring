package main;

/**
 * 
 */
public class Vehicule {

	private String name;
	private double horsePower;
	
	public Vehicule(String name, double horsePower) {
		super();
		this.name = name;
		this.horsePower = horsePower;
	}
	
	public Vehicule() {}
	
	@Override
	public String toString() {
		return 	this.name + "\n" 
				+ "Chevaux : " + this.horsePower + "\n";
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
	
}
