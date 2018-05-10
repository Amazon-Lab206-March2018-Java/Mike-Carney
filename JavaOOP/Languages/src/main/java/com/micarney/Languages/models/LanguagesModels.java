package com.micarney.Languages.models;

import javax.validation.constraints.Size;


public class LanguagesModels {
	@Size(min = 2, max = 20, message = "Must be 2-20 characters")
	private String name;
	
	@Size(min = 2, max = 20, message = "Must be 2-20 characters")
	private String creator;
	
	@Size(min = 1, message = "Version required")
	private String version;
	
	public LanguagesModels() {
		
	}
	
	public LanguagesModels(String name, String creator, String version) {
		this.name = name;
		this.creator = creator;
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	
	
	
}
