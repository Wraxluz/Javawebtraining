package com.sjxy.hotel.room.service;

import java.util.List;

import com.sjxy.hotel.room.entity.Room;

public interface RoomService {
	// 查询所有房间信息
	public List<Room> roomList();
	
	//根据房间号查找房间信息
	public Room findById(int id);
	
	//根据房间号修改房间类型
	public void updateRoomType(int roomId1,String roomType,String roomFloor);
	
	//根据房间号删除房间类型
	public void delete(int id);
	
	//添加客房类型
	public int add(int roomId,String roomType,String roomFloor);
	
	// 根据楼层查找客房信息
	public List<Room> selectRoomFloor(String roomFloor);
}
