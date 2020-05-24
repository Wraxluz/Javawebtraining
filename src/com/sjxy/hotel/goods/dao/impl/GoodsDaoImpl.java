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
	//查询所有商品信息
	@Override
	public List<Goods> goodsList(){
		List<Goods> goodsList = new ArrayList<Goods>();
		String sql = "select * from goodsinfo";
		//这里的query是继承的BaseDao中的
		super.query(sql);
		//循环结果集
		try {
			while(rs.next()){
				Goods goods = new Goods(rs.getInt(1),rs.getString(2),rs.getString(3),
									rs.getInt(4),rs.getString(5),rs.getString(6));
				goodsList.add(goods);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return goodsList;
	}
	//模糊查询

	public List<Goods> findByNameMo(String name){
		List<Goods> goodsList = new ArrayList<Goods>();
		String sql = "select * from goodsinfo where goods_name like ?";
		super.query(sql, "%"+name+"%");
		try {
			while(rs.next()){
				Goods goods = new Goods(rs.getInt(1),rs.getString(2),rs.getString(3),
						rs.getInt(4),rs.getString(5),rs.getString(6));
				goodsList.add(goods);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return goodsList;
	}
	
	//添加商品信息
	@Override
	public int add(String goodsName,String goodsType,int goodsPrice,String goodsUnit,String goodsNote){
		int count = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try{
			//创建数据库连接
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel?useUnicode=true&serverTimezone=GMT%2B8&characterEncoding=UTF-8&useSSL=false","root","root");
			//创建Stateme对象,执行sql语句
			String sql = "insert into goodsInfo(" +
		               "goods_name,goods_type,goods_price," +
		               "con_unit,con_note)" +
		               " values(?,?,?,?,?)";
		    PreparedStatement ps = null;
		    try {
		            ps = conn.prepareStatement(sql);
		            ps.setString(1, goodsName);
		            ps.setString(2, goodsType);
		            ps.setInt(3, goodsPrice);
		            ps.setString(4, goodsUnit);
		            ps.setString(5, goodsNote);
		            
		            count = ps.executeUpdate();
		     } catch (SQLException e) {
		            e.printStackTrace();
		     }
		}catch(SQLException e){
			e.printStackTrace();
		}
		return count;
	}
	//删除商品
	public void delete(int id){
		String sql = "delete from goodsinfo where goods_id=?";
		super.update(sql, id);
	}
	//修改_查询对应数据
	@Override
	public Goods findById(int id){
		Goods goods = null;
		String sql = "select * from goodsinfo where goods_id=?";
		super.query(sql, id);
		try {
			if(rs.next()){
				goods = new Goods(rs.getInt(1),rs.getString(2),rs.getString(3),
						rs.getInt(4),rs.getString(5),rs.getString(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return goods;
	}
	
	//修改_修改
	@Override
	public void update(Goods b){
		//自增的话,mysql就不用将id字段再列出来了。oracle需要
		String sql = "update goodsinfo set goods_name=?,goods_type=?,goods_price=?," +
		               "con_unit=?,con_note=? where goods_id=?";
		super.update(sql, b.getGoods_name(),b.getGoods_type(),b.getGoods_price(),
				b.getGoods_unit(),b.getGoods_note(),b.getGoods_id());
		
	}
	
	//根据商品名称查找商品
	@Override
	public Goods findByName(String name){
		Goods goods = null;
		String sql = "select * from goodsinfo where goods_name=?";
		super.query(sql, name);
		try {
			if(rs.next()){
				goods = new Goods(rs.getInt(1),rs.getString(2),rs.getString(3),
						rs.getInt(4),rs.getString(5),rs.getString(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return goods;
	}

}
