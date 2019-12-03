package com.jnu.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jnu.domain.PartyMember;

public interface PartyMemberMapper {
	
	public void savePartyMember(PartyMember partymember);
	
	
	/**
	 * 查找所有信息，分页未实现
	 * @param partymember
	 */
	public List<PartyMember> findAl();
	
	/**
	 * 根据id查找党员信息，用于管理员修改及用户修改
	 * @param user_id
	 * @return List<PartyMember>
	 */
	public List<PartyMember> findElementById(String user_id);
	
	/**
	 * 根据id查找一位党员的密码，用于用户登录
	 * @param user_id
	 * @return String
	 */
	public String findPasswordByUserId(String user_id);
	
	
	/**
	 * 修改用户密码
	 * @param user_id
	 * @param newPassword
	 */
	public void modifyPassword(@Param("user_id")String user_id,
			@Param("new111_password")String newPassword);
	
	
	/**
	 * 修改用户电话号码
	 * @param user_id
	 * @param newPhoneNumber
	 */
	public void modifyPhoneNumber(@Param("user_id")String user_id,
								@Param("new_user_phone") String newPhoneNumber);
	
}
