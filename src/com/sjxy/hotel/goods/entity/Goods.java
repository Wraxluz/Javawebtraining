package com.sjxy.hotel.goods.entity;

public class Goods {
	private int goods_id;
	private String goods_name;
	private String goods_type;
	private int goods_price;
	private String goods_unit;
	private String goods_note;
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
	public String getGoods_unit() {
		return goods_unit;
	}
	public void setGoods_unit(String goods_unit) {
		this.goods_unit = goods_unit;
	}
	public String getGoods_note() {
		return goods_note;
	}
	public void setGoods_note(String goods_note) {
		this.goods_note = goods_note;
	}
	public Goods(int goods_id, String goods_name, String goods_type, int goods_price, String goods_unit,
			String goods_note) {
		super();
		this.goods_id = goods_id;
		this.goods_name = goods_name;
		this.goods_type = goods_type;
		this.goods_price = goods_price;
		this.goods_unit = goods_unit;
		this.goods_note = goods_note;
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Goods [goods_id=" + goods_id + ", goods_name=" + goods_name + ", goods_type=" + goods_type
				+ ", goods_price=" + goods_price + ", goods_unit=" + goods_unit + ", goods_note=" + goods_note + "]";
	}
	
	
}
