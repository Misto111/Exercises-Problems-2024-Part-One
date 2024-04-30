package org.example.modelmapper.services;

import org.example.modelmapper.entities.Employee;
import org.example.modelmapper.entities.dtos.CreateEmployeeDTO;
import org.example.modelmapper.entities.dtos.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    Employee create(CreateEmployeeDTO employeeDTO);

    List<EmployeeDTO> findAll();
}
