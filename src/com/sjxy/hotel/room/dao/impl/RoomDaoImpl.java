package com.sjxy.hotel.room.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sjxy.hotel.room.dao.RoomDao;
import com.sjxy.hotel.room.entity.Room;
import com.sjxy.hotel.util.BaseDao;

public class RoomDaoImpl extends BaseDao implements RoomDao{
	//查询商品信息
	//分页查询
	@Override
	public List<Room> pageList(int index,int size){
		List<Room> roomList = new ArrayList<Room>();
		String sql = "select * from roominfo limit ?,?";
		//这里的query是继承的BaseDao中的
		super.query(sql,(index-1)*size,size);
		//循环结果集
		try {
			while(rs.next()){
				Room room = new Room(rs.getInt(1),rs.getString(2),rs.getString(3),
									rs.getString(4),rs.getBigDecimal(5),rs.getBigDecimal(6),
									rs.getBigDecimal(7),rs.getBigDecimal(8),rs.getString(9));
				roomList.add(room);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return roomList;
	}
	//模糊查询

	public List<Room> findByName(String id){
		List<Room> roomList = new ArrayList<Room>();
		String sql = "select * from roominfo where room_id like ?";
		super.query(sql, "%"+id+"%");
		try {
			while(rs.next()){
				Room room = new Room(rs.getInt(1),rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getBigDecimal(5),rs.getBigDecimal(6),
						rs.getBigDecimal(7),rs.getBigDecimal(8),rs.getString(9));
				roomList.add(room);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return roomList;
	}
	
	//添加商品信息
	@Override
	public int add(Room room){
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
			String sql = "insert into roomInfo(" +
		               "room_id,room_type,room_status," +
		               "room_floor,room_standardPrice,room_discountPrice," +
		               "room_memberPrice,room_vipPrice,room_note)"+
		               " values(?,?,?,?,?,?)";
		    PreparedStatement ps = null;
		    try {
		            ps = conn.prepareStatement(sql);
		            ps.setInt(1, room.getRoom_id());
		            ps.setString(2, room.getRoom_type());
		            ps.setString(3, room.getRoom_status());
		            ps.setString(4, room.getRoom_floor());
		            ps.setBigDecimal(5, room.getRoom_standardPrice());
		            ps.setBigDecimal(6, room.getRoom_discountPrice());
		            ps.setBigDecimal(7, room.getRoom_memberPrice());
		            ps.setBigDecimal(8, room.getRoom_vipPrice());
		            ps.setString(9, room.getRoom_note());
		            return (ps.executeUpdate());

		     } catch (SQLException e) {
		            e.printStackTrace();
		     }
		}catch(SQLException e){
			e.printStackTrace();
		}
		return count;
	}
	//删除客房
	public void delete(int id){
		String sql = "delete from roominfo where goods_id=?";
		super.update(sql, id);
	}
	//修改_查询对应数据
	@Override
	public Room findById(int id){
		Room room = null;
		String sql = "select * from roominfo where room_id=?";
		super.query(sql, id);
		try {
			if(rs.next()){
				room = new Room(rs.getInt(1),rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getBigDecimal(5),rs.getBigDecimal(6),
						rs.getBigDecimal(7),rs.getBigDecimal(8),rs.getString(9));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return room;
	}
	
	//修改_修改
	@Override
	public void update(Room b){
		//自增的话,mysql就不用将id字段再列出来了。oracle需要
		String sql = "update roominfo set room_id=?,room_type=?,room_status=?," +
		               "room_floor=?,room_standardPrice=?,room_discountPrice=?," +
		               "room_memberPrice=?,room_vipPrice=?,room_note=?";
		super.update(sql, b.getRoom_id(),b.getRoom_type(),b.getRoom_status(),b.getRoom_floor(),
				b.getRoom_standardPrice(),b.getRoom_discountPrice(),b.getRoom_memberPrice(),b.getRoom_vipPrice(),b.getRoom_note());
		
	}
}
