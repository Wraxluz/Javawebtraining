package com.sjxy.hotel.member.dao;

import java.util.List;

import com.sjxy.hotel.member.entity.Member;

public interface MemberDao {

	void delete(int id);

	List<Member> pageList(int index, int size);

	List<Member> findByName(String name);

	Member findById(int id);

	void update(Member b);

	int add(String me_name, String me_sex, String me_pwd, int me_phone, String me_addr, String me_email, int me_inte);

}
