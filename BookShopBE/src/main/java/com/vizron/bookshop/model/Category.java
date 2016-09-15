package com.vizron.bookshop.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Category {
	@Id
	private String id;
	
	//@Min(5)
	//@Max(15)
	private String name;
	//@NotEmpty
	private String description;
	
	public String getId() {
		return id;
	}
	

	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
