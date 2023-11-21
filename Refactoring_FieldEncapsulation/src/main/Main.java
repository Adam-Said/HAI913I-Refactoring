package main;

import models.Employee;
import models.Manager;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 30, 50000.0);
        emp.displayEmployeeDetails();

        Manager manager = new Manager("Jane Smith", 35, 80000.0, 1000.);
        manager.displayManagerDetails();

        // Directly accessing and modifying fields
        emp.name = "Alice Johnson";
        emp.age = 25;
        emp.salary = 60000.0;
        emp.displayEmployeeDetails();

        manager.name = "Bob Williams";
        manager.age = 56;
        manager.salary = 90000.;
        manager.bonus = 5000.0;
        manager.displayManagerDetails();
    }
}