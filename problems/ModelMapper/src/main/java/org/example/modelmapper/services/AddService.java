package org.example.modelmapper.services;

import org.example.modelmapper.entities.Address;
import org.example.modelmapper.entities.dtos.AddressDTO;


public interface AddService {
    Address create(AddressDTO data);
}
