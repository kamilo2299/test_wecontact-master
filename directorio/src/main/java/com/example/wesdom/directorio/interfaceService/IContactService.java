package com.example.wesdom.directorio.interfaceService;

import java.util.List;

import com.example.wesdom.directorio.model.Contact;
import com.example.wesdom.directorio.wrapper.WrapperDatos;

public interface IContactService {

	List<Contact> getAll();
	Contact find(Long idUsuario);


	void agregarDatos(WrapperDatos datosNuevos);

}
