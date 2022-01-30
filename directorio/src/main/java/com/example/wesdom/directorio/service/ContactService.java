package com.example.wesdom.directorio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.wesdom.directorio.interfaceService.IContactService;
import com.example.wesdom.directorio.interfaces.IAddress;
import com.example.wesdom.directorio.interfaces.IContact;
import com.example.wesdom.directorio.model.Address;
import com.example.wesdom.directorio.model.Contact;
@Service
public class ContactService implements IContactService{
	@Autowired
	private IContact data;
	@Override
	public List<Contact> getAll() {
		// TODO Auto-generated method stub
		return (List<Contact>) data.findAll();
	}
}
