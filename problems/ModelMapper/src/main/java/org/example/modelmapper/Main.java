package org.example.modelmapper;

import org.example.modelmapper.entities.Address;
import org.example.modelmapper.entities.Employee;
import org.example.modelmapper.entities.dtos.EmployeeDTO;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;


public class Main implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        ModelMapper modelMapper = new ModelMapper();

        TypeMap<Employee, EmployeeDTO> typeMap = modelMapper.createTypeMap(Employee.class, EmployeeDTO.class);
        typeMap.addMappings(mapping-> mapping.map(
                source-> source.getAddress().getCity(),
                EmployeeDTO::setAddressCity));

        Address address = new Address("Bulgaria", "Plovdiv");
        Employee employee = new Employee("John", BigDecimal.TEN, address);

        EmployeeDTO employeeDTO = typeMap.map(employee);

        System.out.println(employeeDTO);

    }
}
