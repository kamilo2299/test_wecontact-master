package com.example.wesdom.directorio.interfaceService;

import java.util.List;

import com.example.wesdom.directorio.model.Phone;
import com.example.wesdom.directorio.wrapper.WrapperNumeros;

public interface IPhoneService {

	List<Phone> getAll();
	void cambiarNumeros(WrapperNumeros data);

}
