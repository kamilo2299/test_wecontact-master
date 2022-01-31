package com.example.wesdom.directorio.interfaceService;

import java.util.List;

import com.example.wesdom.directorio.model.Address;
import com.example.wesdom.directorio.wrapper.WrapperDirecciones;


public interface IAddressService {
	public List<Address> getAll();

	public void cambiarDireccioes(WrapperDirecciones data);
}
