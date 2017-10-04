package com.imaginea.jsonparser.dto;

public class Identifier {

	private String use; 
	
	private Type type;

	private String value; 
	
	private Assigner assigner;

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Assigner getAssigner() {
		return assigner;
	}

	public void setAssigner(Assigner assigner) {
		this.assigner = assigner;
	}
	
	
	
}

