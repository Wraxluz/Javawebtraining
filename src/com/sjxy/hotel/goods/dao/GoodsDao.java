package com.sjxy.hotel.goods.dao;

import java.util.List;

import com.sjxy.hotel.goods.entity.Goods;

public interface GoodsDao {
	//新增商品
	int add(Goods goods);
	//查询商品
	List<Goods> pageList(int index, int size);
	//删除商品
	public void delete(int id);
	//模糊查询商品
	List<Goods> findByName(String name);
	//修改---找到对应的数据(根据唯一主键进行查询)进行修改(修改这个对象)
	Goods findById(int id);
	void update(Goods b);

}
