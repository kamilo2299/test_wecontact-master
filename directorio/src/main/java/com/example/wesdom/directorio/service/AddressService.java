package com.example.wesdom.directorio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.wesdom.directorio.interfaceService.IAddressService;
import com.example.wesdom.directorio.interfaces.IAddress;
import com.example.wesdom.directorio.model.Address;
@Service
public class AddressService implements IAddressService{

	@Autowired
	private IAddress data;
	@Override
	public List<Address> getAll() {
		// TODO Auto-generated method stub
		return (List<Address>) data.findAll();
	}

}
