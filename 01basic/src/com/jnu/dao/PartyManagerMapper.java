package com.jnu.dao;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.jnu.domain.PartyManager;
import com.jnu.domain.PartyMember;

public interface PartyManagerMapper {
	
	/**
	 * 查找所有信息，分页未实现
	 * @param partymanager
	 */
	public List<PartyManager> managerFindAl();
	
	/**
	 * 根据id查找管理员信息，用于管理员修改
	 * @param manager_id
	 * @return List<PartyManager>
	 */
	public List<PartyManager> managerFindElementById(String manager_id);
	
	/**
	 * 根据id查找一位管理员的Id
	 * @param manager_id
	 * @return String
	 */
    public String findIdByManagerId(String manager_id);
	
	/**
	 * 根据id查找一位管理员的密码，用于管理员登录
	 * @param manager_id
	 * @return String
	 */
    public String findPasswordByManagerId(String manager_id);
    
    /**
	 * 修改管理员密码
	 * @param manager_id
	 * @param newPassword
	 */
	public void managerModifyPassword(@Param("manager_id")String manager_id,
			@Param("new_manager_password")String newPassword);
	
	
	/**
	 * 修改管理员电话号码
	 * @param manager_id
	 * @param newPhoneNumber
	 */
	public void managerModifyPhoneNumber(@Param("manager_id")String manager_id,
								@Param("new_manager_phone") String newPhoneNumber);
	
	/**
	 * 修改管理员姓名
	 * @param manager_id
	 * @param newName
	 */
	public void managerModifyName(@Param("manager_id")String manager_id,
								@Param("new_manager_name") String newName);

    
    

}
