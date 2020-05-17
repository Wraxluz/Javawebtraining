package com.sjxy.hotel.admin.entity;

public class Admin {
	private int admin_id;
	private String admin_name;
	private String admin_pwd;
	private String admin_per;
	private String admin_note;
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_pwd() {
		return admin_pwd;
	}
	public void setAdmin_pwd(String admin_pwd) {
		this.admin_pwd = admin_pwd;
	}
	public String getAdmin_per() {
		return admin_per;
	}
	public void setAdmin_per(String admin_per) {
		this.admin_per = admin_per;
	}
	public String getAdmin_note() {
		return admin_note;
	}
	public void setAdmin_note(String admin_note) {
		this.admin_note = admin_note;
	}
	public Admin() {
		super();
	}
	public Admin(int admin_id, String admin_name, String admin_pwd, String admin_per, String admin_note) {
		super();
		this.admin_id = admin_id;
		this.admin_name = admin_name;
		this.admin_pwd = admin_pwd;
		this.admin_per = admin_per;
		this.admin_note = admin_note;
	}
	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", admin_name=" + admin_name + ", admin_pwd=" + admin_pwd
				+ ", admin_per=" + admin_per + ", admin_note=" + admin_note + "]";
	}
	
}
