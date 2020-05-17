package com.sjxy.hotel.admin.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.sjxy.hotel.admin.dao.AdminDao;
import com.sjxy.hotel.admin.entity.Admin;
import com.sjxy.hotel.util.BaseDao;

public class AdminDaoImpl extends BaseDao implements AdminDao {
	
	//登陆---查找 数据库
	@Override
	public Admin login(String ad_username,String ad_password){
		//初始化实体类对象
		Admin ad = null;
		//加载数据库驱动
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try{
			//创建数据库连接
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useUnicode=true&serverTimezone=GMT%2B8&characterEncoding=UTF-8","root","root");
			//创建Stateme对象,执行sql语句
			Statement st = conn.createStatement();
			//创建sql语句
			String sql = "select * from admininfo where admin_name ='"+ad_username+"'  and admin_pwd='"+ad_password+"'";
			//创建结果集对象，接收结果
			ResultSet rs = st.executeQuery(sql);
			//判断是否存在这个对象
			if(rs.next()){
				ad = new Admin(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	return ad;
	}
	//新增管理员
	public int add(Admin ad){
		int count = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try{
			//创建数据库连接
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useUnicode=true&serverTimezone=GMT%2B8&characterEncoding=UTF-8","root","root");
			//创建Stateme对象,执行sql语句
			String sql = "insert into studentinfo(" +
		               "admin_id,admin_name,admin_pwd,admin_per,admin_note)" +
		               " values(?,?,?,?,?)";
		    PreparedStatement ps = null;
		    try {
		            ps = conn.prepareStatement(sql);
		            ps.setString(1, ad.getAdmin_name());
		            ps.setString(2, ad.getAdmin_pwd());
		            ps.setString(3, ad.getAdmin_per());
		            ps.setString(4, ad.getAdmin_note());
		            return (ps.executeUpdate());

		     } catch (SQLException e) {
		            e.printStackTrace();
		     }
		}catch(SQLException e){
			e.printStackTrace();
		}
		return count;
	}
	//删除管理员
	@Override
	public void delete(int id){
		String sql = "delete from userinfo where admin_id=?";
		super.update(sql, id);
	}
	//查询管理员
	//分页查询
	@Override
	public List<Admin> pageList(int index,int size){
		List<Admin> adminList = new ArrayList<Admin>();
		String sql = "select * from bookinfo limit ?,?";
		//这里的query是继承的BaseDao中的
		super.query(sql,(index-1)*size,size);
		//循环结果集
		try {
			while(rs.next()){
				Admin admin = new Admin(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
				adminList.add(admin);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return adminList;
	}
	//模糊查询

	public List<Admin> findByName(String name){
		List<Admin> adminList = new ArrayList<Admin>();
		String sql = "select * from nfo where book_name like ?";
		super.query(sql, "%"+name+"%");
		try {
			while(rs.next()){
				Admin admin = new Admin(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
				adminList.add(admin);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return adminList;
	}
	//修改_查询对应数据
	@Override
	public Admin findById(int id){
		Admin admin = null;
		String sql = "select * from userinfo where admin_id=?";
		super.query(sql, id);
		try {
			if(rs.next()){
				admin = new Admin(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return admin;
	}
	
	//修改_修改
	@Override
	public void update(Admin b){
		//自增的话,mysql就不用将id字段再列出来了。oracle需要
		String sql = "update userinfo set admin_name=?,admin_pwd=?,"
        + "admin_per=?,admin_note=?";
		super.update(sql,b.getAdmin_name(),b.getAdmin_pwd(),b.getAdmin_per(),b.getAdmin_note());
		
	}
}
	