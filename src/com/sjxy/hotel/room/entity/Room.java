package com.sjxy.hotel.room.entity;

import java.math.BigDecimal;

public class Room {
	private int room_id;

	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	private String room_type;
	private String room_status;
	private String room_floor;
	private BigDecimal room_standardPrice;
	private BigDecimal room_discountPrice;
	private BigDecimal room_memberPrice;
	private BigDecimal room_vipPrice;
	private String room_note;
	public Room() {
		super();
	}
	public Room(int room_id, String room_type, String room_status, String room_floor, BigDecimal room_standardPrice,
			BigDecimal room_discountPrice, BigDecimal room_memberPrice, BigDecimal room_vipPrice, String room_note) {
		super();
		this.room_id = room_id;
		this.room_type = room_type;
		this.room_status = room_status;
		this.room_floor = room_floor;
		this.room_standardPrice = room_standardPrice;
		this.room_discountPrice = room_discountPrice;
		this.room_memberPrice = room_memberPrice;
		this.room_vipPrice = room_vipPrice;
		this.room_note = room_note;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public String getRoom_status() {
		return room_status;
	}
	public void setRoom_status(String room_status) {
		this.room_status = room_status;
	}
	public String getRoom_floor() {
		return room_floor;
	}
	public void setRoom_floor(String room_floor) {
		this.room_floor = room_floor;
	}
	public BigDecimal getRoom_standardPrice() {
		return room_standardPrice;
	}
	public void setRoom_standardPrice(BigDecimal room_standardPrice) {
		this.room_standardPrice = room_standardPrice;
	}
	public BigDecimal getRoom_discountPrice() {
		return room_discountPrice;
	}
	public void setRoom_discountPrice(BigDecimal room_discountPrice) {
		this.room_discountPrice = room_discountPrice;
	}
	public BigDecimal getRoom_memberPrice() {
		return room_memberPrice;
	}
	public void setRoom_memberPrice(BigDecimal room_memberPrice) {
		this.room_memberPrice = room_memberPrice;
	}
	public BigDecimal getRoom_vipPrice() {
		return room_vipPrice;
	}
	public void setRoom_vipPrice(BigDecimal room_vipPrice) {
		this.room_vipPrice = room_vipPrice;
	}
	public String getRoom_note() {
		return room_note;
	}
	public void setRoom_note(String room_note) {
		this.room_note = room_note;
	}
	@Override
	public String toString() {
		return "Room [room_id=" + room_id + ", room_type=" + room_type + ", room_status=" + room_status
				+ ", room_floor=" + room_floor + ", room_standardPrice=" + room_standardPrice + ", room_discountPrice="
				+ room_discountPrice + ", room_memberPrice=" + room_memberPrice + ", room_vipPrice=" + room_vipPrice
				+ ", room_note=" + room_note + "]";
	}
	
	
	
}
