package com.example.wesdom.directorio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.wesdom.directorio.interfaceService.IAddressService;
import com.example.wesdom.directorio.interfaceService.IContactService;
import com.example.wesdom.directorio.interfaceService.IPhoneService;
import com.example.wesdom.directorio.model.Address;
import com.example.wesdom.directorio.model.Contact;
import com.example.wesdom.directorio.model.Phone;

@RestController
@RequestMapping
public class controller {
	
	@Autowired
	private IAddressService addressService;
	
	@Autowired
	private IPhoneService phoneService;
	
	@Autowired
	private IContactService contactService;
	
	@GetMapping(value="/listarDirecciones")
	public List<Address> getAllAddress() {
		List<Address> addresses = addressService.getAll();
		return addresses;
	}
	
	@GetMapping(value="/listarTelefonos")
	public List<Phone> getAllPhones() {
		List<Phone> phones = phoneService.getAll();
		return phones;
	}
	
	@GetMapping(value="/listarContactos")
	public List<Contact> getAllContacts() {
		List<Contact> contacts = contactService.getAll();
		return contacts;
	}
}
