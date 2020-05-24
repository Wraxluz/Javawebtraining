package com.sjxy.hotel.goods.dao;

import java.util.List;

import com.sjxy.hotel.goods.entity.Goods;

public interface GoodsDao {
	//新增商品
	int add(String goodsName,String goodsType,int goodsPrice,String goodsUnit,String goodsNote);
	
	//查询所有商品信息
	public List<Goods> goodsList();
	
	//删除商品
	public void delete(int id);
	//模糊查询商品
	List<Goods> findByNameMo(String name);
	//修改---找到对应的数据(根据唯一主键进行查询)进行修改(修改这个对象)
	Goods findById(int id);
	void update(Goods b);
	
	//根据商品名称查找商品
	public Goods findByName(String name);

}
