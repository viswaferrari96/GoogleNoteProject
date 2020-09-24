package com.example.googlenote.model;

import javax.persistence.*;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long category_id;
	@Column
	private String category_name;
	@Column
	private String category_descr;
	@Column
	private String category_creation_date;
	@Column
	private String category_creator;
	
	public Category()
	{
		
	}
	
	public Category(long category_id,String category_name,String category_descr,String category_creation_date,String category_creator)
	{
		this.category_id = category_id;
		this.category_name = category_name;
		this.category_descr = category_descr;
		this.category_creation_date = category_creation_date;
		this.category_creator = category_creator;
	}
	
	public long getCategory_id() {
		return category_id;
	}
	public void setCategory_id(long category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public String getCategory_descr() {
		return category_descr;
	}
	public void setCategory_descr(String category_descr) {
		this.category_descr = category_descr;
	}
	public String getCategory_creation_date() {
		return category_creation_date;
	}
	public void setCategory_creation_date(String category_creation_date) {
		this.category_creation_date = category_creation_date;
	}
	public String getCategory_creator() {
		return category_creator;
	}
	public void setCategory_creator(String category_creator) {
		this.category_creator = category_creator;
	}
	
	public String toString() {
		return "Category Id: " + getCategory_id() + "\tCategory Name: " + getCategory_name() + "\tCategory created On: " + getCategory_creation_date() + "\tCategory creator: " + getCategory_creator();
	}
	
	
}
