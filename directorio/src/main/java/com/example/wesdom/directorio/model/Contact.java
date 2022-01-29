package com.example.wesdom.directorio.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity(name = "CONDOM")
public class Contact implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8718370828166749874L;

/*
 * -----------------------------------------------------------------------------------------------------------------------------------------------------------------
 * Attributes
 * -----------------------------------------------------------------------------------------------------------------------------------------------------------------
 */
	/**
	 * Name of the column IDECON
	 * The id of the class and entity
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "IDECON",unique=true, nullable = false)
	private Long id;
	
	/**
	 * Name of the column NAMCON
	 * the first and middle name of the contact
	 */

	
	/**
	 * Name of the column SURCON
	 * the last name of the contact 
	 */

	
	/**
	 * Name of the column PHTCON
	 * the path to the photo 
	 */

	
	/**
	 * Name of the column BIRCON
	 * the date of contact's birthday
	 */

	
	/**
	 * List of all phone numbers related to this contact
	 * cascade = CascadeType.ALL,
       fetch = FetchType.LAZY,
	 */

	
	/**
	 * List of all addresses related to this contact
	 * cascade = CascadeType.ALL,
       fetch = FetchType.LAZY,
	 */
		
/*
 * -----------------------------------------------------------------------------------------------------------------------------------------------------------------
 * Constructor
 * -----------------------------------------------------------------------------------------------------------------------------------------------------------------
 */
	/**
	 * Constructor of the class Contact without parameters
	 */
	public Contact() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructor of the class Contact with the attributes by parameter
	 * @param id
	 * @param name
	 * @param surname
	 * @param photo
	 * @param birthday
	 * @param phones
	 * @param addresses
	 */

/*
 * -----------------------------------------------------------------------------------------------------------------------------------------------------------------
 * Methods
 * -----------------------------------------------------------------------------------------------------------------------------------------------------------------
 */


}
