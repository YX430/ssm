package com.jnu.service;
import java.util.List;

import com.jnu.domain.*;
public interface PartyMemberService {
	public void save(PartyMember partyMember);
	public List<PartyMember> findAll();
	public String getPassword(String user_id);
	public List<PartyMember> findElement(String user_id);
	public void modify_password(String user_id,String new_password);
	public void modify_phoneNumber(String user_id, String new_phoneNumber);
}
