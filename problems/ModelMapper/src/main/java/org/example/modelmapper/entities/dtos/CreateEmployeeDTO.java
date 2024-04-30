package org.example.modelmapper.entities.dtos;

import org.example.modelmapper.entities.Address;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CreateEmployeeDTO {
    private final String firstName;
    private final String lastName;
    private final BigDecimal salary;
    private final LocalDate birthDate;
    private final Address address;

    public CreateEmployeeDTO(String firstName, String lastName, BigDecimal salary, LocalDate birthDate, Address address) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.birthDate = birthDate;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Address getAddress() {
        return address;
    }
}
