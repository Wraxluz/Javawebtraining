package com.sjxy.hotel.member.service.impl;

import java.util.List;

import com.sjxy.hotel.member.dao.MemberDao;
import com.sjxy.hotel.member.dao.impl.MemberDaoImpl;
import com.sjxy.hotel.member.entity.Member;
import com.sjxy.hotel.member.service.MemberService;

public class MemberServiceImpl implements MemberService{
	MemberDao memberDao = new MemberDaoImpl();
	
	@Override
	public int add(String me_name, String me_sex, String me_pwd, int me_phone, String me_addr, String me_email, int me_inte) {
		int count = memberDao.add(me_name,me_sex,me_pwd,me_phone,me_addr,me_email,me_inte);
		return count;
	}

	@Override
	public void delete(int id) {
		memberDao.delete(id);
	}

	@Override
	public List<Member> pageList(int index, int size) {
		List<Member> pageList = memberDao.pageList(index, size);
		return pageList;
	}

	@Override
	public List<Member> findByName(String name) {
		List<Member> memberList = memberDao.findByName(name);
		return memberList;
	}

	@Override
	public Member findById(int id) {
		Member member = memberDao.findById(id);
		return member;
	}

	@Override
	public void update(Member b) {
		memberDao.update(b);
	}
	
}
