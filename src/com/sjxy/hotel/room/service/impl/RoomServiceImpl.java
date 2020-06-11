package com.sjxy.hotel.room.service.impl;

import java.util.List;

import com.sjxy.hotel.room.dao.RoomDao;
import com.sjxy.hotel.room.dao.impl.RoomDaoImpl;
import com.sjxy.hotel.room.entity.Room;
import com.sjxy.hotel.room.service.RoomService;

public class RoomServiceImpl implements RoomService {

	// ��ѯ���з�����Ϣ
	@Override
	public List<Room> roomList() {
		RoomDao roomDao = new RoomDaoImpl();
		List<Room> roomList = roomDao.roomList();
		return roomList;
	}

	//���ݷ�����޸ķ�����Ϣ
	@Override
	public Room findById(int id) {
		RoomDao roomDao = new RoomDaoImpl();
		Room room = roomDao.findById(id);
		return room;
	}

	//���ݷ�����޸ķ�������
	@Override
	public void updateRoomType(int roomId1,String roomType,String roomFloor) {
		RoomDao roomDao = new RoomDaoImpl();
		roomDao.update(roomId1,roomType,roomFloor);
	}

	//���ݷ����ɾ����������
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
