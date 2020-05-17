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
	
	//��½---���� ���ݿ�
	@Override
	public Admin login(String ad_username,String ad_password){
		//��ʼ��ʵ�������
		Admin ad = null;
		//�������ݿ�����
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try{
			//�������ݿ�����
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useUnicode=true&serverTimezone=GMT%2B8&characterEncoding=UTF-8","root","root");
			//����Stateme����,ִ��sql���
			Statement st = conn.createStatement();
			//����sql���
			String sql = "select * from admininfo where admin_name ='"+ad_username+"'  and admin_pwd='"+ad_password+"'";
			//������������󣬽��ս��
			ResultSet rs = st.executeQuery(sql);
			//�ж��Ƿ�����������
			if(rs.next()){
				ad = new Admin(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	return ad;
	}
	//��������Ա
	public int add(Admin ad){
		int count = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try{
			//�������ݿ�����
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useUnicode=true&serverTimezone=GMT%2B8&characterEncoding=UTF-8","root","root");
			//����Stateme����,ִ��sql���
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
	//ɾ������Ա
	@Override
	public void delete(int id){
		String sql = "delete from userinfo where admin_id=?";
		super.update(sql, id);
	}
	//��ѯ����Ա
	//��ҳ��ѯ
	@Override
	public List<Admin> pageList(int index,int size){
		List<Admin> adminList = new ArrayList<Admin>();
		String sql = "select * from bookinfo limit ?,?";
		//�����query�Ǽ̳е�BaseDao�е�
		super.query(sql,(index-1)*size,size);
		//ѭ�������
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
	//ģ����ѯ

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
	//�޸�_��ѯ��Ӧ����
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
	
	//�޸�_�޸�
	@Override
	public void update(Admin b){
		//�����Ļ�,mysql�Ͳ��ý�id�ֶ����г����ˡ�oracle��Ҫ
		String sql = "update userinfo set admin_name=?,admin_pwd=?,"
        + "admin_per=?,admin_note=?";
		super.update(sql,b.getAdmin_name(),b.getAdmin_pwd(),b.getAdmin_per(),b.getAdmin_note());
		
	}
}
	