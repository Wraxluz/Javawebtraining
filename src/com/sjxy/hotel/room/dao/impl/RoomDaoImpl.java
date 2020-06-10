package com.sjxy.hotel.room.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sjxy.hotel.room.dao.RoomDao;
import com.sjxy.hotel.room.entity.Room;
import com.sjxy.hotel.util.BaseDao;

public class RoomDaoImpl extends BaseDao implements RoomDao{
	//��ѯ������Ϣ
	public List<Room> roomList(){
		List<Room> roomList = new ArrayList<Room>();
		String sql = "select * from roominfo";
		rs = super.query(sql);
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
	
	//��ҳ��ѯ
	@Override
	public List<Room> pageList(int index,int size){
		List<Room> roomList = new ArrayList<Room>();
		String sql = "select * from roominfo limit ?,?";
		//�����query�Ǽ̳е�BaseDao�е�
		super.query(sql,(index-1)*size,size);
		//ѭ�������
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
	//ģ����ѯ

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
	
	//��ӷ�����Ϣ
	@Override
	public int add(int roomId,String roomType,String roomFloor){
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
			String sql = "insert into roomInfo values (?,?,'��������',?,0,0,0,0,'��������')";
		    PreparedStatement ps = null;
		    try {
		            ps = conn.prepareStatement(sql);
		            ps.setInt(1, roomId);
		            ps.setString(2, roomType);
		            ps.setString(3, roomFloor);
		            return (ps.executeUpdate());

		     } catch (SQLException e) {
		            e.printStackTrace();
		     }
		}catch(SQLException e){
			e.printStackTrace();
		}
		return count;
	}
	//ɾ���ͷ�����
	public void delete(int id){
		String sql = "delete from roominfo where room_id=?";
		super.update(sql, id);
	}
	//�޸�_��ѯ��Ӧ����
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
	
	//�޸�_�޸�
	@Override
	public void update(int roomId1,String roomType,String roomFloor){
		//�����Ļ�,mysql�Ͳ��ý�id�ֶ����г����ˡ�oracle��Ҫ
		String sql = "update roominfo set room_type=? ,room_floor = ? where room_id=?";
		super.update(sql, roomType,roomFloor,roomId1);
	}

	@Override
	public List<Room> selectRoomFloor(String roomFloor) {
		Room room = null;
		List<Room> roomList = new ArrayList<Room>();
		String sql = "select * from roominfo where room_floor=?";
		rs = super.query(sql, roomFloor);
		try {
			while(rs.next()){
				room = new Room(rs.getInt(1),rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getBigDecimal(5),rs.getBigDecimal(6),
						rs.getBigDecimal(7),rs.getBigDecimal(8),rs.getString(9));
				roomList.add(room);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return roomList;
	}
}
