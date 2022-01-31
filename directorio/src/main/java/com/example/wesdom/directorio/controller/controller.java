package com.example.wesdom.directorio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.wesdom.directorio.interfaceService.IAddressService;
import com.example.wesdom.directorio.interfaceService.IContactService;
import com.example.wesdom.directorio.interfaceService.IPhoneService;
import com.example.wesdom.directorio.model.Address;
import com.example.wesdom.directorio.model.Contact;
import com.example.wesdom.directorio.model.Phone;
import com.example.wesdom.directorio.wrapper.WrapperDatos;
import com.example.wesdom.directorio.wrapper.WrapperDirecciones;
import com.example.wesdom.directorio.wrapper.WrapperNumeros;



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
	
	@GetMapping(value="/contact/{idUsuario}")
	public Contact getContact(
	        @PathVariable("idUsuario") final Long idUsuario
	     ) {
		Contact c = contactService.find(idUsuario);
		return c;
	}
	
	@PostMapping(value="/agregarDatos")
	public void agregarDatos(
			@RequestBody final WrapperDatos data
			) {
		contactService.agregarDatos(data);		
	}
	
	@PostMapping(value="/cambiarNumeros")
	public String cambiarNumeros(
			@RequestBody final WrapperNumeros data
	) {
		phoneService.cambiarNumeros(data);
		return "aa";
		/*
		phoneService.cambiarDatos();
		*/
	}
	
	@PostMapping(value="/cambiarDirecciones")
	public String cambiarDirecciones(
			@RequestBody final WrapperDirecciones data
	) {
		addressService.cambiarDireccioes(data);
		return "aa";
		/*
		phoneService.cambiarDatos();
		*/
	}
	
}
