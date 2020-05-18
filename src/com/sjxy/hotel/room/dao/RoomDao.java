package com.sjxy.hotel.room.dao;

import java.util.List;

import com.sjxy.hotel.room.entity.Room;

public interface RoomDao {
	//��ѯ
	List<Room> pageList(int index, int size);
	List<Room> findByName(String name);
	//���
	int add(Room room);
	//ɾ��
	public void delete(int id);
	//�޸�
	Room findById(int id);
	void update(Room b);

}
