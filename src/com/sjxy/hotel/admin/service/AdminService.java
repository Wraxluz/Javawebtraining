package com.sjxy.hotel.admin.service;

import java.util.List;

import com.sjxy.hotel.admin.entity.Admin;

public interface AdminService {

	Admin login(String ad_username, String ad_password);

	int add(Admin ad);

	Admin findById(int id);

	void update(Admin b);
	
	void delete(int id);

	List<Admin> pageList(int index, int size);

	List<Admin> findByName(String name);
}
