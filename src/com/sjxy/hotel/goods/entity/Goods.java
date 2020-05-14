package com.sjxy.hotel.goods.entity;

public class Goods {
	private int goods_id;
	private String goods_name;
	private String goods_type;
	private int goods_price;
	private int con_unit;
	private String con_note;
	public Goods() {
		super();
	}
	public Goods(int goods_id, String goods_name, String goods_type, int goods_price, int con_unit, String con_note) {
		super();
		this.goods_id = goods_id;
		this.goods_name = goods_name;
		this.goods_type = goods_type;
		this.goods_price = goods_price;
		this.con_unit = con_unit;
		this.con_note = con_note;
	}
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public String getGoods_type() {
		return goods_type;
	}
	public void setGoods_type(String goods_type) {
		this.goods_type = goods_type;
	}
	public int getGoods_price() {
		return goods_price;
	}
	public void setGoods_price(int goods_price) {
		this.goods_price = goods_price;
	}
	public int getCon_unit() {
		return con_unit;
	}
	public void setCon_unit(int con_unit) {
		this.con_unit = con_unit;
	}
	public String getCon_note() {
		return con_note;
	}
	public void setCon_note(String con_note) {
		this.con_note = con_note;
	}
}
