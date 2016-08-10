package com.vizron.bookstore.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

	    @Entity
	    @Table
	    @Component
		public class Category {
			private String categoryId;
			private String categoryName;
	@Transient
			private String description;
		public String getCategoryId() {
		return categoryId;
			}
		public void setCategoryId(String categoryId) {
			this.categoryId = categoryId;
	}
		public String getCategoryName() {
		return categoryName;
	}
		public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
		public String getDescription() {
		return description;
	}
		public void setDescription(String description) {
		this.description = description;
	}
	
	

}
