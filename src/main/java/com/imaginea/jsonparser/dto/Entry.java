package com.imaginea.jsonparser.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Entry {

	private String id;
	
	private List<Identifier> identifier; 
	
	private String managingOrganization;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="mm/mm/YYYY")
	private java.util.Date birthDate;
	
	private List<Name> name; 
	
	private Gender gender; 
	
	private List<Extenstion> extension; 
	
	private Address address; 
	
	private List<Telecom> telecom; 
	
	private List<Communication> communication; 
	
	private List<GeneralPractitioner> generalPractitioner; 
	
	private Deceased deceased;

	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}



	public List<Identifier> getIdentifier() {
		return identifier;
	}

	public void setIdentifier(List<Identifier> identifier) {
		this.identifier = identifier;
	}

	public String getManagingOrganization() {
		return managingOrganization;
	}

	public void setManagingOrganization(String managingOrganization) {
		this.managingOrganization = managingOrganization;
	}

	public java.util.Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(java.util.Date birthDate) {
		this.birthDate = birthDate;
	}

	public List<Name> getName() {
		return name;
	}

	public void setName(List<Name> name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public List<Extenstion> getExtension() {
		return extension;
	}

	public void setExtension(List<Extenstion> extension) {
		this.extension = extension;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Telecom> getTelecom() {
		return telecom;
	}

	public void setTelecom(List<Telecom> telecom) {
		this.telecom = telecom;
	}

	public List<Communication> getCommunication() {
		return communication;
	}

	public void setCommunication(List<Communication> communication) {
		this.communication = communication;
	}


	public List<GeneralPractitioner> getGeneralPractitioner() {
		return generalPractitioner;
	}

	public void setGeneralPractitioner(List<GeneralPractitioner> generalPractitioner) {
		this.generalPractitioner = generalPractitioner;
	}

	public Deceased getDeceased() {
		return deceased;
	}

	public void setDeceased(Deceased deceased) {
		this.deceased = deceased;
	}
	
	
	
	
	
}
