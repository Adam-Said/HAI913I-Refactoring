package extractSuperclass;

public class Main {
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
