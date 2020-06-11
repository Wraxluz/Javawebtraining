package com.sjxy.hotel.room.service.impl;

import java.util.List;

import com.sjxy.hotel.room.dao.RoomDao;
import com.sjxy.hotel.room.dao.impl.RoomDaoImpl;
import com.sjxy.hotel.room.entity.Room;
import com.sjxy.hotel.room.service.RoomService;

public class RoomServiceImpl implements RoomService {

	// 查询所有房间信息
	@Override
	public List<Room> roomList() {
		RoomDao roomDao = new RoomDaoImpl();
		List<Room> roomList = roomDao.roomList();
		return roomList;
	}

	//根据房间号修改房间信息
	@Override
	public Room findById(int id) {
		RoomDao roomDao = new RoomDaoImpl();
		Room room = roomDao.findById(id);
		return room;
	}

	//根据房间号修改房间类型
	@Override
	public void updateRoomType(int roomId1,String roomType,String roomFloor) {
		RoomDao roomDao = new RoomDaoImpl();
		roomDao.update(roomId1,roomType,roomFloor);
	}

	//根据房间号删除房间类型
	@Override
	public void delete(int id) {
		RoomDao roomDao = new RoomDaoImpl();
		roomDao.delete(id);
	}

	@Override
	public int add(int roomId, String roomType, String roomFloor) {
		RoomDao roomDao = new RoomDaoImpl();
		int result = roomDao.add(roomId, roomType,roomFloor);
		return result;
	}

	@Override
	public List<Room> selectRoomFloor(String roomFloor) {
		RoomDao roomDao = new RoomDaoImpl();
		List<Room> roomList = roomDao.selectRoomFloor(roomFloor);
		return roomList;
	}

}
