package com.sjxy.hotel.member.entity;

import java.sql.Date;

public class Member {
	private int me_id;
	private String me_name;
	private String me_sex;
	private String me_pwd;
	private int me_phone;
	private String me_addr;
	private String me_email;
	private int me_inte;
	private String me_level;
	private Date me_endlive;
	private Date me_end;
	public Member() {
		super();
	}
	public Member(int me_id, String me_name, String me_sex, String me_pwd, int me_phone, String me_addr,
			String me_email, int me_inte, String me_level, Date me_endlive, Date me_end) {
		super();
		this.me_id = me_id;
		this.me_name = me_name;
		this.me_sex = me_sex;
		this.me_pwd = me_pwd;
		this.me_phone = me_phone;
		this.me_addr = me_addr;
		this.me_email = me_email;
		this.me_inte = me_inte;
		this.me_level = me_level;
		this.me_endlive = me_endlive;
		this.me_end = me_end;
	}
	public int getMe_id() {
		return me_id;
	}
	public void setMe_id(int me_id) {
		this.me_id = me_id;
	}
	public String getMe_name() {
		return me_name;
	}
	public void setMe_name(String me_name) {
		this.me_name = me_name;
	}
	public String getMe_sex() {
		return me_sex;
	}
	public void setMe_sex(String me_sex) {
		this.me_sex = me_sex;
	}
	public String getMe_pwd() {
		return me_pwd;
	}
	public void setMe_pwd(String me_pwd) {
		this.me_pwd = me_pwd;
	}
	public int getMe_phone() {
		return me_phone;
	}
	public void setMe_phone(int me_phone) {
		this.me_phone = me_phone;
	}
	public String getMe_addr() {
		return me_addr;
	}
	public void setMe_addr(String me_addr) {
		this.me_addr = me_addr;
	}
	public String getMe_email() {
		return me_email;
	}
	public void setMe_email(String me_email) {
		this.me_email = me_email;
	}
	public int getMe_inte() {
		return me_inte;
	}
	public void setMe_inte(int me_inte) {
		this.me_inte = me_inte;
	}
	public String getMe_level() {
		return me_level;
	}
	public void setMe_level(String me_level) {
		this.me_level = me_level;
	}
	public Date getMe_endlive() {
		return me_endlive;
	}
	public void setMe_endlive(Date me_endlive) {
		this.me_endlive = me_endlive;
	}
	public Date getMe_end() {
		return me_end;
	}
	public void setMe_end(Date me_end) {
		this.me_end = me_end;
	}
}
