package com.sjxy.hotel.room.service;

import java.util.List;

import com.sjxy.hotel.room.entity.Room;

public interface RoomService {
	// ��ѯ���з�����Ϣ
	public List<Room> roomList();
	
	//���ݷ���Ų��ҷ�����Ϣ
	public Room findById(int id);
	
	//���ݷ�����޸ķ�������
	public void updateRoomType(int roomId1,String roomType,String roomFloor);
	
	//���ݷ����ɾ����������
	public void delete(int id);
	
	//��ӿͷ�����
	public int add(int roomId,String roomType,String roomFloor);
	
	// ����¥����ҿͷ���Ϣ
	public List<Room> selectRoomFloor(String roomFloor);
}
