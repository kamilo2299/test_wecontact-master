package com.example.wesdom.directorio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.wesdom.directorio.interfaceService.IPhoneService;
import com.example.wesdom.directorio.interfaces.IPhone;
import com.example.wesdom.directorio.model.Phone;
import com.example.wesdom.directorio.wrapper.WrapperNumeros;
@Service
public class PhoneService implements IPhoneService{

	@Autowired
	private IPhone data;
	@Override
	public List<Phone> getAll() {
		// TODO Auto-generated method stub
		return (List<Phone>) data.findAll();
	}
	
	@Override
	public void cambiarNumeros(WrapperNumeros dataPhones) {
		// TODO Auto-generated method stub
		List<Phone> phones = (List<Phone>) data.findAll();
		
		for(int i=0; i<dataPhones.getIdCambios().size(); i++) {
			for(int j=0; j<phones.size(); j++) {
				if(phones.get(j).getId() == dataPhones.getIdCambios().get(i)) {
					phones.get(j).setNumber(dataPhones.getPhones().get(i));
				}
			}
		}
		
		
		data.saveAll(phones);
	}
}
