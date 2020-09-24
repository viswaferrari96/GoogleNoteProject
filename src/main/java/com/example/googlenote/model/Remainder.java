package com.example.googlenote.model;

public class Remainder {
	private long remainder_id;
	private String remainder_name;
	private String remainder_descr;
	private String remainder_type;
	private String remainder_creation_date;
	private String remainder_creator;
	
	public Remainder()
	{
		
	}
	
	public Remainder(long remainder_id, String remainder_name, String remainder_descr, String remainder_type, String remainder_creation_date, String remainder_creator)
	{
		this.remainder_id = remainder_id;
		this.remainder_name = remainder_name;
		this.remainder_descr = remainder_descr;
		this.remainder_type = remainder_type;
		this.remainder_creation_date = remainder_creation_date;
		this.remainder_creator = remainder_creator;
		
	}
	public long getRemainder_id() {
		return remainder_id;
	}
	public void setRemainder_id(long remainder_id) {
		this.remainder_id = remainder_id;
	}
	public String getRemainder_name() {
		return remainder_name;
	}
	public void setRemainder_name(String remainder_name) {
		this.remainder_name = remainder_name;
	}
	public String getRemainder_descr() {
		return remainder_descr;
	}
	public void setRemainder_descr(String remainder_descr) {
		this.remainder_descr = remainder_descr;
	}
	public String getRemainder_type() {
		return remainder_type;
	}
	public void setRemainder_type(String remainder_type) {
		this.remainder_type = remainder_type;
	}
	public String getRemainder_creation_date() {
		return remainder_creation_date;
	}
	public void setRemainder_creation_date(String remainder_creation_date) {
		this.remainder_creation_date = remainder_creation_date;
	}
	public String getRemainder_creator() {
		return remainder_creator;
	}
	public void setRemainder_creator(String remainder_creator) {
		this.remainder_creator = remainder_creator;
	}
}
