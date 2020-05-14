package com.sjxy.hotel.goods.dao;

import java.util.List;

import com.sjxy.hotel.goods.entity.Goods;

public interface GoodsDao {
	//������Ʒ
	int add(Goods goods);
	//��ѯ��Ʒ
	List<Goods> pageList(int index, int size);
	//ɾ����Ʒ
	public void delete(int id);
	//ģ����ѯ��Ʒ
	List<Goods> findByName(String name);
	//�޸�---�ҵ���Ӧ������(����Ψһ�������в�ѯ)�����޸�(�޸��������)
	Goods findById(int id);
	void update(Goods b);

}
