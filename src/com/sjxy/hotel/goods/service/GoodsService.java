package com.sjxy.hotel.goods.service;

import java.util.List;

import com.sjxy.hotel.goods.entity.Goods;

public interface GoodsService {
	//查询所有商品信息
	public List<Goods> goodsList();
	
	//添加商品信息
	public int add(String goodsName,String goodsType,int goodsPrice,String goodsUnit,String goodsNote);
	
	//根据商品名称查找商品
	public Goods findByName(String name);
	
	//模糊查询商品
	List<Goods> findByNameMo(String name);
	
	//删除商品
	public void delete(int id);
	
	//修改商品
	Goods findById(int id);
	void update(Goods b);
}
