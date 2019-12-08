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
	@ResponseBody 					//用于转换json对象
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
	 * 登录
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
				//如果账号密码匹配，登录成功，跳转到succ页面。必填项之类的可以由前端实现
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
	
	//修改密码
	@RequestMapping("/modifypwd")
	public String modifypwd() {
		return "modifypwd-manager";
	}
		
	/**
	* 修改密码
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
					//如果账号密码匹配，登录成功，跳转到succ页面。必填项之类的可以由前端实现
					if(new_password!=null) {//该条件无法控制，未知原因，需要在前端控制一下
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

		
		//修改管理员信息
		
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
