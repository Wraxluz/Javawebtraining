package com.sjxy.hotel.member.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sjxy.hotel.member.dao.MemberDao;
import com.sjxy.hotel.member.entity.Member;
import com.sjxy.hotel.util.BaseDao;

public class MemberDaoImpl extends BaseDao implements MemberDao {
	//��ӻ�Ա
	@Override
	public int add(String me_name, String me_sex, String me_pwd, int me_phone, String me_addr, String me_email, int me_inte) {
		int count = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try{
			//�������ݿ�����
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?useUnicode=true&serverTimezone=GMT%2B8&characterEncoding=UTF-8","root","root");
			//����Stateme����,ִ��sql���
			String sql = "insert into memberinfo(" +
		               "me_id,me_name,me_sex,me_pwd,me_phone" +
		               "me_addr,me_email,me_inte,me_level)"+
		               " values(?,?,?,?,?,?,?,?,?)";
		    PreparedStatement ps = null;
		    try {
		            ps = conn.prepareStatement(sql);
		            ps.setString(1, me_name);
		            ps.setString(2, me_sex);
		            ps.setString(3, me_pwd);
		            ps.setInt(4, me_phone);
		            ps.setString(5, me_addr);
		            ps.setString(6, me_email);
		            ps.setInt(7, me_inte);

		            return (ps.executeUpdate());

		     } catch (SQLException e) {
		            e.printStackTrace();
		     }
		}catch(SQLException e){
			e.printStackTrace();
		}
		return count;
	}
	//ɾ����Ա
	@Override
	public void delete(int id) {
		String sql = "delete from memberinfo where me_id=?";
		super.update(sql, id);
	}
	//��ѯ��Ա
	@Override
	public List<Member> pageList(int index, int size) {
		List<Member> memberList = new ArrayList<Member>();
		String sql = "select * from memberinfo limit ?,?";
		//�����query�Ǽ̳е�BaseDao�е�
		super.query(sql,(index-1)*size,size);
		//ѭ�������
		try {
			while(rs.next()){
				Member member = new Member(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getInt(8),rs.getString(9),rs.getDate(10),rs.getDate(11));
				memberList.add(member);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return memberList;
	}

	@Override
	public List<Member> findByName(String name) {
		List<Member> memberList = new ArrayList<Member>();
		String sql = "select * from memberinfo where me_name like ?";
		super.query(sql, "%"+name+"%");
		try {
			while(rs.next()){
				Member member = new Member(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getInt(8),rs.getString(9),rs.getDate(10),rs.getDate(11));
				memberList.add(member);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return memberList;
	}

	@Override
	public Member findById(int id) {
		Member member = null;
		String sql = "select * from memberinfo where me_id=?";
		super.query(sql, id);
		try {
			if(rs.next()){
				member = new Member(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getInt(8),rs.getString(9),rs.getDate(10),rs.getDate(11));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return member;
	}

	@Override
	public void update(Member b) {
		String sql = "update memberinfo set me_name=?,me_sex=?,"
		        + "me_pwd=?,me_phone=?,me_addr=?,me_email=?,"
				+"me_inte=?,me_level=?";
		super.update(sql,b.getMe_name(),b.getMe_sex(),b.getMe_pwd(),b.getMe_phone(),b.getMe_addr(), b.getMe_email(),b.getMe_inte(),b.getMe_level());
	}

}
