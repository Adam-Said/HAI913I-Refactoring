package main;

public class Main {

	public static void main(String[] args) {
		System.out.println("Création d'une moto : ");
		System.out.println("------------------------");;
		Moto moto = new Moto("Harley", 1235);
		System.out.println("Ma moto : " + moto.toString());
		
		System.out.println("Création d'une voiture : ");
		System.out.println("------------------------");
		Voiture voiture = new Voiture("Mazda RX-7", 321, 3, 23);
		System.out.println("Ma voiture : " + voiture.toString());
		
	}

}
