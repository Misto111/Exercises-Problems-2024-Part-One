package org.example.modelmapper;

import org.example.modelmapper.entities.Address;
import org.example.modelmapper.entities.Employee;
import org.example.modelmapper.entities.dtos.AddressDTO;
import org.example.modelmapper.entities.dtos.CreateEmployeeDTO;
import org.example.modelmapper.services.AddService;
import org.example.modelmapper.services.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class AppMain implements CommandLineRunner {

    private final AddService addService;
    private final EmployeeService employeeService;
    private final Scanner scanner;

    public AppMain(AddService addService, EmployeeService employeeService, Scanner scanner) {
        this.addService = addService;
        this.employeeService = employeeService;
        this.scanner = scanner;
    }

    @Override
    public void run(String... args) throws Exception {


        printAllEmployees();
        //createEmployee(scanner);

       // createAddress(scanner);

    }

    private void printAllEmployees() {
        this.employeeService.findAll()
                .forEach(System.out::println);
    }

    private void createEmployee(Scanner scanner) {
        String firstName = scanner.nextLine();
        BigDecimal salary = new BigDecimal(scanner.nextLine());
        LocalDate birthDate = LocalDate.parse(scanner.nextLine());
        long addressId = Long.parseLong(scanner.nextLine());

        String country = scanner.nextLine();
        String city = scanner.nextLine();

        Address address = new Address(country, city);

        CreateEmployeeDTO employeeDTO = new CreateEmployeeDTO(firstName, null, salary, birthDate, address);

        Employee employee = this.employeeService.create(employeeDTO);

        System.out.println(employee);
    }

    private void createAddress(Scanner scanner) {
        String country = scanner.nextLine();
        String city = scanner.nextLine();

        AddressDTO data = new AddressDTO(country, city);

        Address address = addService.create(data);

        System.out.println(address.toString());
    }
}
