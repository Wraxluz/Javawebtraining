package com.sjxy.hotel.admin.dao;

import java.util.List;

import com.sjxy.hotel.admin.entity.Admin;

public interface AdminDao {
	//管理员登陆
	Admin login(String ad_username, String ad_password);
	//添加管理员
	public int add(Admin ad);
	//删除管理员
	void delete(int id);
	//查询管理员
	List<Admin> pageList(int index, int size);
	//模糊查询
	List<Admin> findByName(String name);
	//修改管理员
	Admin findById(int id);
	void update(Admin b);
	
}
