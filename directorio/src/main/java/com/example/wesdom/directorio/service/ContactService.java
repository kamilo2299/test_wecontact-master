package com.example.wesdom.directorio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.wesdom.directorio.interfaceService.IContactService;
import com.example.wesdom.directorio.interfaces.IAddress;
import com.example.wesdom.directorio.interfaces.IContact;
import com.example.wesdom.directorio.interfaces.IPhone;
import com.example.wesdom.directorio.model.Address;
import com.example.wesdom.directorio.model.Contact;
import com.example.wesdom.directorio.model.Phone;
import com.example.wesdom.directorio.wrapper.WrapperDatos;
@Service
public class ContactService implements IContactService{
	@Autowired
	private IContact dataContact;
	
	@Autowired
	private IPhone dataPhone;
	
	@Autowired
	private IAddress dataAddress;
	
	@Override
	public List<Contact> getAll() {
		// TODO Auto-generated method stub
		return (List<Contact>) dataContact.findAll();
	}
	

	@Override
	public void agregarDatos(WrapperDatos datosNuevos) {
		// TODO Auto-generated method stub
		Contact c = new Contact();
		List<Contact> contactos = (List<Contact>) dataContact.findAll();
		for(int i=0; i<contactos.size(); i++) {
			if(contactos.get(i).getId() == datosNuevos.getId()) {
				c = contactos.get(i);
			}
		}
		try {
			if(datosNuevos.getPhones().size()>0) {
				boolean existe = false;
				List<Phone> phones = (List<Phone>) dataPhone.findAll();
				for(int i=0; i<datosNuevos.getPhones().size(); i++) {
					for(int j=0; j<phones.size() && existe == false; j++) {
						if(phones.get(j).getNumber().contains(datosNuevos.getPhones().get(i))) {
							c.addPhone(phones.get(j));
							existe = true;
						}
					}
					existe = false;
				}
			}
			if(datosNuevos.getAddresses().size()>0) {
				List<Address> addresses = (List<Address>) dataAddress.findAll();
				for(int i=0; i<datosNuevos.getAddresses().size(); i++) {
					for(int j=0; j<addresses.size(); j++) {
						if(addresses.get(j).getAddress().contains(datosNuevos.getAddresses().get(i))) {
							c.addAddress(addresses.get(j));
						}
					}
				}
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		dataContact.save(c);
	}


	@Override
	public Contact find(Long idUsuario) {
		// TODO Auto-generated method stub
		Contact c = dataContact.findById(idUsuario).get();
		return c;
	}


}
