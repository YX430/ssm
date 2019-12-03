package com.jnu.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jnu.domain.PartyMember;

public interface PartyMemberMapper {
	
	public void savePartyMember(PartyMember partymember);
	
	
	/**
	 * ����������Ϣ����ҳδʵ��
	 * @param partymember
	 */
	public List<PartyMember> findAl();
	
	/**
	 * ����id���ҵ�Ա��Ϣ�����ڹ���Ա�޸ļ��û��޸�
	 * @param user_id
	 * @return List<PartyMember>
	 */
	public List<PartyMember> findElementById(String user_id);
	
	/**
	 * ����id����һλ��Ա�����룬�����û���¼
	 * @param user_id
	 * @return String
	 */
	public String findPasswordByUserId(String user_id);
	
	
	/**
	 * �޸��û�����
	 * @param user_id
	 * @param newPassword
	 */
	public void modifyPassword(@Param("user_id")String user_id,
			@Param("new111_password")String newPassword);
	
	
	/**
	 * �޸��û��绰����
	 * @param user_id
	 * @param newPhoneNumber
	 */
	public void modifyPhoneNumber(@Param("user_id")String user_id,
								@Param("new_user_phone") String newPhoneNumber);
	
}
