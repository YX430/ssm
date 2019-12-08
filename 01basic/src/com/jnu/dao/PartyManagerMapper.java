package com.jnu.dao;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.jnu.domain.PartyManager;
import com.jnu.domain.PartyMember;

public interface PartyManagerMapper {
	
	/**
	 * ����������Ϣ����ҳδʵ��
	 * @param partymanager
	 */
	public List<PartyManager> managerFindAl();
	
	/**
	 * ����id���ҹ���Ա��Ϣ�����ڹ���Ա�޸�
	 * @param manager_id
	 * @return List<PartyManager>
	 */
	public List<PartyManager> managerFindElementById(String manager_id);
	
	/**
	 * ����id����һλ����Ա��Id
	 * @param manager_id
	 * @return String
	 */
    public String findIdByManagerId(String manager_id);
	
	/**
	 * ����id����һλ����Ա�����룬���ڹ���Ա��¼
	 * @param manager_id
	 * @return String
	 */
    public String findPasswordByManagerId(String manager_id);
    
    /**
	 * �޸Ĺ���Ա����
	 * @param manager_id
	 * @param newPassword
	 */
	public void managerModifyPassword(@Param("manager_id")String manager_id,
			@Param("new_manager_password")String newPassword);
	
	
	/**
	 * �޸Ĺ���Ա�绰����
	 * @param manager_id
	 * @param newPhoneNumber
	 */
	public void managerModifyPhoneNumber(@Param("manager_id")String manager_id,
								@Param("new_manager_phone") String newPhoneNumber);
	
	/**
	 * �޸Ĺ���Ա����
	 * @param manager_id
	 * @param newName
	 */
	public void managerModifyName(@Param("manager_id")String manager_id,
								@Param("new_manager_name") String newName);

    
    

}
