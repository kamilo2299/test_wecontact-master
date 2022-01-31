package com.example.wesdom.directorio.wrapper;

import java.util.ArrayList;
import java.util.List;

public class WrapperNumeros {

	Long idUsuario;
	List<Long> idCambios;
	List<String> phones;
	
	WrapperNumeros(){
		this.phones = new ArrayList<String>(); 
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

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	
	
}
