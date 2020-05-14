package com.sjxy.hotel.admin.dao;

import java.util.List;

import com.sjxy.hotel.admin.entity.Admin;

public interface AdminDao {
	//����Ա��½
	Admin login(String ad_username, String ad_password);
	//��ӹ���Ա
	public int add(Admin ad);
	//ɾ������Ա
	void delete(int id);
	//��ѯ����Ա
	List<Admin> pageList(int index, int size);
	//ģ����ѯ
	List<Admin> findByName(String name);
	//�޸Ĺ���Ա
	Admin findById(int id);
	void update(Admin b);
	
}
