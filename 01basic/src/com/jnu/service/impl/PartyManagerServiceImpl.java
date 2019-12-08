package com.jnu.service.impl;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.jnu.dao.PartyManagerMapper;
import com.jnu.domain.PartyManager;
import com.jnu.service.PartyManagerService;

@Service("partyManagerService")
@Transactional
public class PartyManagerServiceImpl implements PartyManagerService {
	
	@Resource
	public PartyManagerMapper partyManagerMapper;
	
	public List <PartyManager> managerFindAll() {
		return partyManagerMapper.managerFindAl();
	}
	
	public List<PartyManager> managerFindElement(String manager_id) {
		return partyManagerMapper.managerFindElementById(manager_id);
	}
	
	public String getManagerId(String manager_id) {
		return partyManagerMapper.findIdByManagerId(manager_id);
	}
	
	public String getManagerPassword(String manager_id) {
		return partyManagerMapper.findPasswordByManagerId(manager_id);
	}
	
	public void manager_modifyPassword(String manager_id,String new_password) {
		partyManagerMapper.managerModifyPassword(manager_id, new_password);
	}
	
	public void manager_modifyPhoneNumber(String manager_id,String new_phoneNumber) {
		partyManagerMapper.managerModifyPhoneNumber(manager_id, new_phoneNumber);
	}
	
	public void manager_modifyName(String manager_id,String new_name) {
		partyManagerMapper.managerModifyName(manager_id, new_name);
	}

}
