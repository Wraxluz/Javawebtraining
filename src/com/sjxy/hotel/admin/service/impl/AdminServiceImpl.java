package com.sjxy.hotel.admin.service.impl;


import java.util.List;

import com.sjxy.hotel.admin.dao.AdminDao;
import com.sjxy.hotel.admin.dao.impl.AdminDaoImpl;
import com.sjxy.hotel.admin.entity.Admin;
import com.sjxy.hotel.admin.service.AdminService;

public class AdminServiceImpl implements AdminService {
	//����dao��ʵ�������
	private AdminDao adDao = new AdminDaoImpl();
	
	//����Ա��½
	@Override
	public Admin login(String ad_username,String ad_password){
		Admin ad = adDao.login(ad_username, ad_password);
		return ad;
	}
	
	//��ӹ���Ա
	// @Override�����Լ�����Ƿ���ȷ�ĸ�д�˸��������еķ���
	@Override
	public int add(Admin ad){
		int count = adDao.add(ad);
		return count;
	}
	//��ҳ��ѯ
	@Override
	public List<Admin> pageList(int index,int size){
		List<Admin> adminList = adDao.pageList(index, size);
		return adminList;
	}	
	
	//ģ����ѯ
	@Override
	public List<Admin> findByName(String name){
		List<Admin> adminList = adDao.findByName(name);
		return adminList;
	}
	//ɾ��
	public void delete(int id){
		adDao.delete(id);
	}
	
	//�޸�_��ѯ��Ӧ������(����Ψһ�������в�ѯ)
	@Override
	public Admin findById(int id){
		Admin b = adDao.findById(id);
		return b;
	}
	
	//�޸�_�޸�
	@Override
	public void update(Admin b){
		adDao.update(b);
	}
}