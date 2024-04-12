package prototypeDP;

import companyRoster.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int id = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        String department = scanner.nextLine();;
        double salary = Double.parseDouble(scanner.nextLine());
        String address = scanner.nextLine();

        EmployeeRecord employee1 = new EmployeeRecord(id, name, department, salary, address);
        employee1.showRecord();

        EmployeeRecord employee2 = (EmployeeRecord) employee1.getClone();
        employee2.showRecord();

    }
}
