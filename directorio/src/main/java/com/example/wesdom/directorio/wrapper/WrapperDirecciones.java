package com.example.wesdom.directorio.wrapper;

import java.util.ArrayList;
import java.util.List;

public class WrapperDirecciones {

	Long idUsuario;
	List<Long> idCambios;
	List<String> addresses;
	
	WrapperDirecciones (){
		this.addresses = new ArrayList<String>(); 
		this.idCambios = new ArrayList<Long>(); 
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public List<Long> getIdCambios() {
		return idCambios;
	}

	public void setIdCambios(List<Long> idCambios) {
		this.idCambios = idCambios;
	}

	public List<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}


	
}
