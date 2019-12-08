package com.jnu.service;
import java.util.List;
import com.jnu.domain.*;

public interface PartyManagerService {
	
	public List<PartyManager> managerFindAll();
	public String getManagerId(String manager_id);
	public String getManagerPassword(String manager_id);
	public List<PartyManager> managerFindElement(String manager_id);
	public void manager_modifyPassword(String manager_id,String new_password);
	public void manager_modifyPhoneNumber(String manager_id,String new_PhoneNumber);
	public void manager_modifyName(String manager_id,String new_name);
	

}
