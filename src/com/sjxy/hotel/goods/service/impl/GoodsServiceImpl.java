package com.sjxy.hotel.goods.service.impl;

import java.util.List;

import com.sjxy.hotel.goods.dao.GoodsDao;
import com.sjxy.hotel.goods.dao.impl.GoodsDaoImpl;
import com.sjxy.hotel.goods.entity.Goods;
import com.sjxy.hotel.goods.service.GoodsService;

public class GoodsServiceImpl implements GoodsService{

	@Override
	public List<Goods> goodsList() {
		GoodsDao goodsDao = new GoodsDaoImpl();
		List<Goods> goodsList = goodsDao.goodsList();
		return goodsList;
	}

	@Override
	public int add(String goodsName,String goodsType,int goodsPrice,String goodsUnit,String goodsNote) {
		GoodsDao goodsDao = new GoodsDaoImpl();
		int count = goodsDao.add(goodsName,goodsType,goodsPrice,goodsUnit,goodsNote);
		return count;
	}

	@Override
	public Goods findByName(String name) {
		GoodsDao goodsDao = new GoodsDaoImpl();
		Goods goods = goodsDao.findByName(name);
		return goods;
	}

	@Override
	public List<Goods> findByNameMo(String name) {
		GoodsDao goodsDao = new GoodsDaoImpl();
		List<Goods> goodsList = goodsDao.findByNameMo(name);
		return goodsList;
	}

	@Override
	public void delete(int id) {
		GoodsDao goodsDao = new GoodsDaoImpl();
		goodsDao.delete(id);
	}

	@Override
	public Goods findById(int id) {
		GoodsDao goodsDao = new GoodsDaoImpl();
		Goods goods = goodsDao.findById(id);
		return goods;
	}

	@Override
	public void update(Goods b) {
		GoodsDao goodsDao = new GoodsDaoImpl();
		goodsDao.update(b);
	}
	
}
