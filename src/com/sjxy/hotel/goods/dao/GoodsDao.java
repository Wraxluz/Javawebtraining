package com.sjxy.hotel.goods.dao;

import java.util.List;

import com.sjxy.hotel.goods.entity.Goods;

public interface GoodsDao {
	//������Ʒ
	int add(String goodsName,String goodsType,int goodsPrice,String goodsUnit,String goodsNote);
	
	//��ѯ������Ʒ��Ϣ
	public List<Goods> goodsList();
	
	//ɾ����Ʒ
	public void delete(int id);
	//ģ����ѯ��Ʒ
	List<Goods> findByNameMo(String name);
	//�޸�---�ҵ���Ӧ������(����Ψһ�������в�ѯ)�����޸�(�޸��������)
	Goods findById(int id);
	void update(Goods b);
	
	//������Ʒ���Ʋ�����Ʒ
	public Goods findByName(String name);

}
