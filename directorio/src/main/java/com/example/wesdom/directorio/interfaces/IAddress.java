package com.example.wesdom.directorio.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.wesdom.directorio.model.Address;

@Repository
public interface IAddress extends CrudRepository<Address, Long>{

}
