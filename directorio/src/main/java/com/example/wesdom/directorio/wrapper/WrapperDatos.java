package com.example.wesdom.directorio.wrapper;

import java.util.ArrayList;
import java.util.List;

public class WrapperDatos {

	Long id;
	List<String> phones;
	List<String> addresses;
	
	WrapperDatos(){
		this.phones = new ArrayList<String>(); 
		this.addresses = new ArrayList<String>(); 
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public List<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	
	
}
