package com.example.wesdom.directorio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.wesdom.directorio.interfaceService.IPhoneService;
import com.example.wesdom.directorio.interfaces.IPhone;
import com.example.wesdom.directorio.model.Phone;
@Service
public class PhoneService implements IPhoneService{

	@Autowired
	private IPhone data;
	@Override
	public List<Phone> getAll() {
		// TODO Auto-generated method stub
		return (List<Phone>) data.findAll();
	}
}
