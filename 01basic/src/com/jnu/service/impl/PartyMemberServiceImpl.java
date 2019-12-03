package com.jnu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jnu.dao.PartyMemberMapper;
import com.jnu.domain.PartyMember;
import com.jnu.service.PartyMemberService;

@Service("partyMemberService")
@Transactional
public class PartyMemberServiceImpl implements PartyMemberService {

	@Resource
	public PartyMemberMapper partyMemberMapper;
	
	public void save(PartyMember partyMember) {
		// TODO Auto-generated method stub
		partyMemberMapper.savePartyMember(partyMember);
//		int i=100/0;
		partyMemberMapper.savePartyMember(partyMember);
	}

	
	public List <PartyMember> findAll() {
		return partyMemberMapper.findAl();
	}
	
	public String getPassword(String user_id) {
		return partyMemberMapper.findPasswordByUserId(user_id);
	}
	
	public List<PartyMember> findElement(String user_id) {
		return partyMemberMapper.findElementById(user_id);
	}


	public void modify_password(String user_id, String new_password) {
		partyMemberMapper.modifyPassword(user_id,new_password);
	}
	
	public void modify_phoneNumber(String user_id, String new_phoneNumber) {
		partyMemberMapper.modifyPhoneNumber(user_id, new_phoneNumber);
	}
}
