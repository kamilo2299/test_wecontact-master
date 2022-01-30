package com.example.wesdom.directorio.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.wesdom.directorio.model.Contact;

@Repository
public interface IContact  extends CrudRepository<Contact, Long>{

}
