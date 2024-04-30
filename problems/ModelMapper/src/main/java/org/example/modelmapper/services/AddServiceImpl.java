package org.example.modelmapper.services;

import org.example.modelmapper.entities.Address;
import org.example.modelmapper.entities.dtos.AddressDTO;
import org.example.modelmapper.repositories.AddressRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@Service
public class AddServiceImpl implements AddService {
    private final AddressRepository addressRepository;
    private final ModelMapper modelMapper;

    public AddServiceImpl(AddressRepository addressRepository, ModelMapper modelMapper) {
        this.addressRepository = addressRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Address create(AddressDTO data) {


        Address address = modelMapper.map(data, Address.class);

        return this.addressRepository.save(address);


    }
}
