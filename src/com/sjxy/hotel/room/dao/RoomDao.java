package com.sjxy.hotel.room.dao;

import java.util.List;

import com.sjxy.hotel.room.entity.Room;

public interface RoomDao {
	//查询
	List<Room> pageList(int index, int size);
	List<Room> findByName(String name);
	
	//删除客房类型
	public void delete(int id);
	
	//修改客房类型
	public Room findById(int id);
	
	//添加客房类型
	public int add(int roomId,String roomType,String roomFloor);
	
	//根据房间号修改房间类型
	public void update(int roomId1,String roomType,String roomFloor);
	
	//查询所有的客房信息
	public List<Room> roomList();
	
	// 根据楼层查找客房信息
	public List<Room> selectRoomFloor(String roomFloor);

}
