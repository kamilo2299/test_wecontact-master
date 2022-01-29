package com.example.wesdom.directorio.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "ADRDOM")
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4740783361965400544L;

/*
 * -----------------------------------------------------------------------------------------------------------------------------------------------------------------
 * Attributes
 * -----------------------------------------------------------------------------------------------------------------------------------------------------------------
 */
	/**
	 * Name of the column IDEADR
	 * The id of the class and entity
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "IDEADR",unique=true, nullable = false)
	private Long id;
	
	/**
	 * Name of the column LABADR
	 * the identifier or type of the address
	 */

	
	/**
	 * Name of the column ADRADR
	 * the address
	 */
	
	/**
	 * Name of the column CONADR
	 * the FK of contac entity
	 */
	
/*
 * -----------------------------------------------------------------------------------------------------------------------------------------------------------------
 * Constructor
 * -----------------------------------------------------------------------------------------------------------------------------------------------------------------
 */
	/**
	 * Constructor of the class Address without parameters
	 */
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 *  Constructor of the class Address with the attributes by parameter
	 * @param id
	 * @param label
	 * @param address
	 */
/*
 * -----------------------------------------------------------------------------------------------------------------------------------------------------------------
 * Methods
 * -----------------------------------------------------------------------------------------------------------------------------------------------------------------
 */


}
