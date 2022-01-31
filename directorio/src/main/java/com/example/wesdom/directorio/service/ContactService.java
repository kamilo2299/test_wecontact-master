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
	public void agregarDatos(List<WrapperDatos> datosNuevos) {
		// TODO Auto-generated method stub
		
		
		for(int i=0; i<datosNuevos.size(); i++) {
			Contact c = new Contact();
			List<Contact> contactos = (List<Contact>) dataContact.findAll();
			for(int j=0; j<contactos.size(); j++) {
				if(contactos.get(j).getId() == datosNuevos.get(i).getId()) {
					c = contactos.get(j);
				}
			}
			try {
				if(datosNuevos.get(i).getPhones().size()>0) {
					boolean existe = false;
					List<Phone> phones = (List<Phone>) dataPhone.findAll();
					for(int j=0; j<datosNuevos.get(i).getPhones().size(); j++) {
						for(int k=0; k<phones.size() && existe == false; k++) {
							if(phones.get(k).getNumber().contains(datosNuevos.get(i).getPhones().get(j))) {
								c.addPhone(phones.get(k));
								existe = true;
							}
						}
						existe = false;
					}
				}
				if(datosNuevos.get(i).getAddresses().size()>0) {
					List<Address> addresses = (List<Address>) dataAddress.findAll();
					for(int j=0; j<datosNuevos.get(i).getAddresses().size(); j++) {
						for(int k=0; k<addresses.size(); k++) {
							if(addresses.get(k).getAddress().contains(datosNuevos.get(i).getAddresses().get(j))) {
								c.addAddress(addresses.get(k));
							}
						}
					}
				}
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			dataContact.save(c);
		}
		
		

		
		
	}


	@Override
	public Contact find(Long idUsuario) {
		// TODO Auto-generated method stub
		Contact c = dataContact.findById(idUsuario).get();
		return c;
	}


}
