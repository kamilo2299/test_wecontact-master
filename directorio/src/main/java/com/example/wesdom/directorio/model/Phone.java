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

@Entity(name = "PHODOM")
public class Phone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1068401382172754017L;

/*
 * -----------------------------------------------------------------------------------------------------------------------------------------------------------------
 * Attributes
 * -----------------------------------------------------------------------------------------------------------------------------------------------------------------
 */
	/**
	 * Name of the column IDEPHO
	 * The id of the class and entity
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "IDEPHO",unique=true, nullable = false)
	private Long id;
	
	/**
	 * Name of the column COUPHO
	 * the code number that represents the country
	 */
	private String label;
	
	/**
	 * Name of the column LABPHO
	 * the identifier of category of the phone number
	 */
	private Long country;
	
	/**
	 * Name of the column NUMPHO
	 * the phone number
	 */
	private String number;
	/**
	 * Name of the column CONPHO
	 * the phone number
	 */
/*
 * -----------------------------------------------------------------------------------------------------------------------------------------------------------------
 * Constructor
 * -----------------------------------------------------------------------------------------------------------------------------------------------------------------
 */
	/**
	 * Constructor of the class Phone without parameters
	 */
	public Phone() {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Long getCountry() {
		return country;
	}
	public void setCountry(Long country) {
		this.country = country;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	/**
	 * Constructor of the class Phone with the attributes by parameter
	 * @param id - the unique code 
	 * @param country - the code number that represents the country
	 * @param label - the identifier of category of the phone number
	 * @param number - the phone number
	 */

/*
 * -----------------------------------------------------------------------------------------------------------------------------------------------------------------
 * Methods
 * -----------------------------------------------------------------------------------------------------------------------------------------------------------------
 */
	
	
}
