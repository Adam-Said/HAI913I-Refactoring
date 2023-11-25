package extractSuperclass;

public class Main {
	// Dans ce programme les classes Car et Motorcycle ont des attributs communs
	// Il serait préférable d'avoir une super-classe pour regrouper ces 2 attributs
	
	public static void main(String[] args) {
        // Utilisation de la classe Car
        Car car = new Car("Toyota", 2022, 4);
        System.out.println("Car Brand: " + car.getBrand());
        System.out.println("Car Year: " + car.getYear());
        System.out.println("Number of Doors: " + car.getNumberOfDoors());
        car.drive();
        System.out.println();

        // Utilisation de la classe Motorcycle
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", 2022, false);
        System.out.println("Motorcycle Brand: " + motorcycle.getBrand());
        System.out.println("Motorcycle Year: " + motorcycle.getYear());
        System.out.println("Has SideCar: " + motorcycle.isHasSideCar());
        motorcycle.ride();
    }

}
