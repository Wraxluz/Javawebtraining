package com.sjxy.hotel.member.service;

import java.util.List;

import com.sjxy.hotel.member.entity.Member;

public interface MemberService {
	//添加会员
	int add(String me_name, String me_sex, String me_pwd, int me_phone, String me_addr, String me_email, int me_inte);
	//删除会员
	void delete(int meId);
	//查询会员
	List<Member> pageList(int index, int size);
	//会员名查询
	List<Member> findByName(String name);
	//修改会员
	Member findById(int id);
	void update(Member b);






}
