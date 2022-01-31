package com.example.wesdom.directorio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.wesdom.directorio.interfaceService.IAddressService;
import com.example.wesdom.directorio.interfaces.IAddress;
import com.example.wesdom.directorio.model.Address;
import com.example.wesdom.directorio.model.Phone;
import com.example.wesdom.directorio.wrapper.WrapperDirecciones;
@Service
public class AddressService implements IAddressService{

	@Autowired
	private IAddress data;
	@Override
	public List<Address> getAll() {
		// TODO Auto-generated method stub
		return (List<Address>) data.findAll();
	}
	@Override
	public void cambiarDireccioes(WrapperDirecciones dataAddresses) {
		// TODO Auto-generated method stub
		List<Address> addresses = (List<Address>) data.findAll();
		
		for(int i=0; i<dataAddresses.getIdCambios().size(); i++) {
			for(int j=0; j<addresses.size(); j++) {
				if(addresses.get(j).getId() == dataAddresses.getIdCambios().get(i)) {
					addresses.get(j).setAddress(dataAddresses.getAddresses().get(j));
				}
			}
		}
		
		
		data.saveAll(addresses);
	}

}
