package com.sjxy.hotel.goods.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sjxy.hotel.goods.dao.GoodsDao;
import com.sjxy.hotel.goods.entity.Goods;
import com.sjxy.hotel.util.BaseDao;

public class GoodsDaoImpl extends BaseDao implements GoodsDao{
	//��ѯ��Ʒ��Ϣ
	//��ҳ��ѯ
	@Override
	public List<Goods> pageList(int index,int size){
		List<Goods> goodsList = new ArrayList<Goods>();
		String sql = "select * from goodsinfo limit ?,?";
		//�����query�Ǽ̳е�BaseDao�е�
		super.query(sql,(index-1)*size,size);
		//ѭ�������
		try {
			while(rs.next()){
				Goods goods = new Goods(rs.getInt(1),rs.getString(2),rs.getString(3),
									rs.getInt(4),rs.getInt(5),rs.getString(6));
				goodsList.add(goods);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return goodsList;
	}
	//ģ����ѯ

	public List<Goods> findByName(String name){
		List<Goods> goodsList = new ArrayList<Goods>();
		String sql = "select * from goodsinfo where goods_name like ?";
		super.query(sql, "%"+name+"%");
		try {
			while(rs.next()){
				Goods goods = new Goods(rs.getInt(1),rs.getString(2),rs.getString(3),
						rs.getInt(4),rs.getInt(5),rs.getString(6));
				goodsList.add(goods);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return goodsList;
	}
	
	//�����Ʒ��Ϣ
	@Override
	public int add(Goods goods){
		int count = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try{
			//�������ݿ�����
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?useUnicode=true&serverTimezone=GMT%2B8&characterEncoding=UTF-8&useSSL=false","root","root");
			//����Stateme����,ִ��sql���
			String sql = "insert into goodsInfo(" +
		               "goods_name,goods_type,goods_price," +
		               "con_unit,con_note)" +
		               " values(?,?,?,?,?,?)";
		    PreparedStatement ps = null;
		    try {
		            ps = conn.prepareStatement(sql);
		            ps.setString(1, goods.getGoods_name());
		            ps.setString(2, goods.getGoods_type());
		            ps.setInt(3, goods.getGoods_price());
		            ps.setInt(4, goods.getCon_unit());
		            ps.setString(5, goods.getCon_note());
		            return (ps.executeUpdate());

		     } catch (SQLException e) {
		            e.printStackTrace();
		     }
		}catch(SQLException e){
			e.printStackTrace();
		}
		return count;
	}
	//ɾ����Ʒ
	public void delete(int id){
		String sql = "delete from goodsinfo where goods_id=?";
		super.update(sql, id);
	}
	//�޸�_��ѯ��Ӧ����
	@Override
	public Goods findById(int id){
		Goods goods = null;
		String sql = "select * from goodsinfo where goods_id=?";
		super.query(sql, id);
		try {
			if(rs.next()){
				goods = new Goods(rs.getInt(1),rs.getString(2),rs.getString(3),
						rs.getInt(4),rs.getInt(5),rs.getString(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return goods;
	}
	
	//�޸�_�޸�
	@Override
	public void update(Goods b){
		//�����Ļ�,mysql�Ͳ��ý�id�ֶ����г����ˡ�oracle��Ҫ
		String sql = "update goodsinfo set goods_name=?,goods_type=?,goods_price=?," +
		               "con_unit=?,con_note=?";
		super.update(sql, b.getGoods_name(),b.getGoods_price(),b.getGoods_type(),
				b.getCon_unit(),b.getCon_note());
		
	}

}
