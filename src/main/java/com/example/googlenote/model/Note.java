package com.example.googlenote.model;

public class Note {
	
	private long note_id;
	private String note_title;
	private String note_content;
	private boolean note_status;
	private String note_creation_date;
	
	public Note()
	{
		
	}
	
	public Note(long note_id, String note_title, String note_content, boolean note_status, String note_creation_date )
	{
		this.note_id = note_id;
		this.note_title = note_title;
		this.note_content = note_content;
		this.note_status = note_status;
		this.note_creation_date = note_creation_date;
	}
	public long getNote_id() {
		return note_id;
	}
	public void setNote_id(long note_id) {
		this.note_id = note_id;
	}
	public String getNote_title() {
		return note_title;
	}
	public void setNote_title(String note_title) {
		this.note_title = note_title;
	}
	public String getNote_content() {
		return note_content;
	}
	public void setNote_content(String note_content) {
		this.note_content = note_content;
	}
	public boolean isNote_status() {
		return note_status;
	}
	public void setNote_status(boolean note_status) {
		this.note_status = note_status;
	}
	public String getNote_creation_date() {
		return note_creation_date;
	}
	public void setNote_creation_date(String note_creation_date) {
		this.note_creation_date = note_creation_date;
	}
	
	public String toString()
	{
		return "Note Id: " + getNote_id() + "\tNote title: " + getNote_title() + "\tNote content: " + getNote_content() + "\tNote Status: " + isNote_status() + "\tNote creted on: " + getNote_creation_date();
	}
}
