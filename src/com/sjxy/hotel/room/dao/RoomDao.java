package com.sjxy.hotel.room.dao;

import java.util.List;

import com.sjxy.hotel.room.entity.Room;

public interface RoomDao {
	//²éÑ¯
	List<Room> pageList(int index, int size);
	List<Room> findByName(String name);
	//Ìí¼Ó
	int add(Room room);
	//É¾³ý
	public void delete(int id);
	//ÐÞ¸Ä
	Room findById(int id);
	void update(Room b);

}
