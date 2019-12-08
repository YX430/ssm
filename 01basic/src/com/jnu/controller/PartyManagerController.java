package com.jnu.controller;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.jnu.domain.PartyManager;
import com.jnu.domain.PartyMember;
import com.jnu.service.PartyManagerService;

@Controller
@RequestMapping("/partymanager")
public class PartyManagerController {
	
	@Resource
	public PartyManagerService partyManagerService;
	
	@RequestMapping("/list")
	@ResponseBody 					//����ת��json����
	public List<PartyManager> list() {
		List<PartyManager> list = partyManagerService.managerFindAll();
		return list;
	}
	
	@RequestMapping(value="/manager",method=RequestMethod.GET)
	public String show() {
		return "manager";
	}

	
	@RequestMapping("/login")
	public String input() {
		return "login-manager";
	}
	/**
	 * ��¼
	 * @param managerid
	 * @param password
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/login_result", method=RequestMethod.POST)
	public String login(@RequestParam("login-id") String managerid, 
			@RequestParam("login-password") String password, 
			HttpSession session) {
         String list = partyManagerService.getManagerPassword(managerid);
		 if(managerid!=null) {
			 if(password.equals(list)) {
				//����˺�����ƥ�䣬��¼�ɹ�����ת��succҳ�档������֮��Ŀ�����ǰ��ʵ��
				 return "succ";
			 }
			 else {
				 return "failed";
			 }
		 }
		 else {
			 return "failed";
	     }
	}
	
	//�޸�����
	@RequestMapping("/modifypwd")
	public String modifypwd() {
		return "modifypwd-manager";
	}
		
	/**
	* �޸�����
	* @param managerid
	* @param old_password
	* @param new_password
	* @param session
	* @return
	*/
	@RequestMapping(value="modify_result", method=RequestMethod.POST)
	public String modify_password(@RequestParam("login-managerid") String managerid,
		@RequestParam("old_password") String old_password,
		@RequestParam("new_password") String new_password,
		HttpSession session) {
			
		String list = partyManagerService.getManagerPassword(managerid);
			if(managerid!=null) {
				if(old_password.equals(list)) {
					//����˺�����ƥ�䣬��¼�ɹ�����ת��succҳ�档������֮��Ŀ�����ǰ��ʵ��
					if(new_password!=null) {//�������޷����ƣ�δ֪ԭ����Ҫ��ǰ�˿���һ��
						partyManagerService.manager_modifyPassword(managerid, new_password);
						return "succ";
					}
					else {
						return "failed";
					}
				}
				else {
					return "failed";
			    }
			}
			else {
				return "failed";
			}
		}

		
		//�޸Ĺ���Ա��Ϣ
		
		@RequestMapping("/modifyinfo")
		public String modifyPhone() {
			return "modifyinfo-manager";
		}
		
		@RequestMapping(value="modifyinfo_result", method=RequestMethod.POST)
		public String modify_info(@RequestParam("login-managerid") String managerid,
				@RequestParam("new_phoneNumber") String new_phoneNumber,
				@RequestParam("new_name") String new_name,
				HttpSession session) {
			String list1 = partyManagerService.getManagerId(managerid);
			
			if(managerid!=null&&managerid.equals(list1)) {
				if(new_phoneNumber!=null) {
					partyManagerService.manager_modifyPhoneNumber(managerid, new_phoneNumber);
				}

				if(new_name!=null) {
					partyManagerService.manager_modifyName(managerid, new_name);
				}
				return "succ";
			}
			else {
				return "failed";
			}
		}
		

}
