package com.sjxy.hotel.goods.service;

import java.util.List;

import com.sjxy.hotel.goods.entity.Goods;

public interface GoodsService {
	//��ѯ������Ʒ��Ϣ
	public List<Goods> goodsList();
	
	//�����Ʒ��Ϣ
	public int add(String goodsName,String goodsType,int goodsPrice,String goodsUnit,String goodsNote);
	
	//������Ʒ���Ʋ�����Ʒ
	public Goods findByName(String name);
	
	//ģ����ѯ��Ʒ
	List<Goods> findByNameMo(String name);
	
	//ɾ����Ʒ
	public void delete(int id);
	
	//�޸���Ʒ
	Goods findById(int id);
	void update(Goods b);
}
