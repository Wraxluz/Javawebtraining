package com.sjxy.hotel.room.dao;

import java.util.List;

import com.sjxy.hotel.room.entity.Room;

public interface RoomDao {
	//��ѯ
	List<Room> pageList(int index, int size);
	List<Room> findByName(String name);
	
	//ɾ���ͷ�����
	public void delete(int id);
	
	//�޸Ŀͷ�����
	public Room findById(int id);
	
	//��ӿͷ�����
	public int add(int roomId,String roomType,String roomFloor);
	
	//���ݷ�����޸ķ�������
	public void update(int roomId1,String roomType,String roomFloor);
	
	//��ѯ���еĿͷ���Ϣ
	public List<Room> roomList();
	
	// ����¥����ҿͷ���Ϣ
	public List<Room> selectRoomFloor(String roomFloor);

}
