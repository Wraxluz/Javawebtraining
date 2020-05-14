package com.sjxy.hotel.admin.service.impl;


import java.util.List;

import com.sjxy.hotel.admin.dao.AdminDao;
import com.sjxy.hotel.admin.dao.impl.AdminDaoImpl;
import com.sjxy.hotel.admin.entity.Admin;
import com.sjxy.hotel.admin.service.AdminService;

public class AdminServiceImpl implements AdminService {
	//创建dao层实现类对象
	private AdminDao adDao = new AdminDaoImpl();
	
	//管理员登陆
	@Override
	public Admin login(String ad_username,String ad_password){
		Admin ad = adDao.login(ad_username, ad_password);
		return ad;
	}
	
	//添加管理员
	// @Override帮助自己检查是否正确的复写了父类中已有的方法
	@Override
	public int add(Admin ad){
		int count = adDao.add(ad);
		return count;
	}
	//分页查询
	@Override
	public List<Admin> pageList(int index,int size){
		List<Admin> adminList = adDao.pageList(index, size);
		return adminList;
	}	
	
	//模糊查询
	@Override
	public List<Admin> findByName(String name){
		List<Admin> adminList = adDao.findByName(name);
		return adminList;
	}
	//删除
	public void delete(int id){
		adDao.delete(id);
	}
	
	//修改_查询对应的数据(根据唯一主键进行查询)
	@Override
	public Admin findById(int id){
		Admin b = adDao.findById(id);
		return b;
	}
	
	//修改_修改
	@Override
	public void update(Admin b){
		adDao.update(b);
	}
}