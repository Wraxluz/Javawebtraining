package com.sjxy.hotel.member.dao;

import java.util.List;

import com.sjxy.hotel.member.entity.Member;

public interface MemberDao {

	int add(Member me);

	void delete(int id);

	List<Member> pageList(int index, int size);

	List<Member> findByName(String name);

	Member findById(int id);

	void update(Member b);

}
