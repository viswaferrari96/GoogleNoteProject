package com.example.googlenote.model;

import javax.persistence.*;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long user_id;
	@Column
	private String user_name;
	@Column
	private String user_added_date;
	@Column
	private String user_password;
	@Column
	private long user_mobile;
	
	public User()
	{
		
	}
	
	public User(long user_id, String user_name, String user_added_date, String user_password, long user_mobile)
	{
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_added_date = user_added_date;
		this.user_password = user_password;
		this.user_mobile = user_mobile;
	}
	
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_added_date() {
		return user_added_date;
	}
	public void setUser_added_date(String user_added_date) {
		this.user_added_date = user_added_date;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public long getUser_mobile() {
		return user_mobile;
	}
	public void setUser_mobile(long user_mobile) {
		this.user_mobile = user_mobile;
	}
	
	public String toString() {
		return "User Id: " + getUser_id() + "\tUser Name: " + getUser_name() + "\tUser Added On: " + getUser_added_date() + "\tUser Mobile: " + getUser_mobile();
	} 
}
