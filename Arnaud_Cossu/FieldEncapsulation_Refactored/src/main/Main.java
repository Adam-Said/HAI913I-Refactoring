package main;

import models.Employee;
import models.Manager;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 30, 50000.0);
        emp.displayEmployeeDetails();

        Manager manager = new Manager("Jane Smith", 35, 80000.0, 1000.);
        manager.displayManagerDetails();

        // Utilisation des getters et setters
        emp.setName("Alice Johnson");
        emp.setAge(25);
        emp.setSalary(60000.0);
        emp.displayEmployeeDetails();

        manager.setName("Bob Williams");
        manager.setAge(56);
        manager.setSalary(90000.);
        manager.setBonus(5000.0);
        manager.displayManagerDetails();
    }
}