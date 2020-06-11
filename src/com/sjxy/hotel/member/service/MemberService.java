package com.sjxy.hotel.member.service;

import java.util.List;

import com.sjxy.hotel.member.entity.Member;

public interface MemberService {
	//��ӻ�Ա
	int add(String me_name, String me_sex, String me_pwd, int me_phone, String me_addr, String me_email, int me_inte);
	//ɾ����Ա
	void delete(int meId);
	//��ѯ��Ա
	List<Member> pageList(int index, int size);
	//��Ա����ѯ
	List<Member> findByName(String name);
	//�޸Ļ�Ա
	Member findById(int id);
	void update(Member b);






}
