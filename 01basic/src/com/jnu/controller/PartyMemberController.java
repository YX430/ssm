package com.jnu.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jnu.domain.PartyMember;
import com.jnu.service.PartyMemberService;

@Controller
@RequestMapping("/partymember")
public class PartyMemberController {
	@Resource
	public PartyMemberService partyMemberService;
	
	@RequestMapping("/list")
	@ResponseBody 					//用于转换json对象
	public List<PartyMember> list() {
		List<PartyMember> list = partyMemberService.findAll();
		return list;
	}
	
	@RequestMapping("/login")
	public String input() {
		return "login";
	}
	
	/**
	 * 登录
	 * @param userId
	 * @param password
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/login_result", method=RequestMethod.POST)
	public String login(@RequestParam("login-userid") String userId, 
			@RequestParam("login-password") String password, 
			HttpSession session) {
		String list = partyMemberService.getPassword(userId);

		if(userId!=null&&password.equals(list)) {
			//如果账号密码匹配，登录成功，跳转到succ页面。必填项之类的可以由前端实现
			return "succ";
		}
			//如果账号密码不匹配，登录失败，跳转到failed页面
		else return "failed";
	}
	
	
	//根据id查询对象
	@RequestMapping("/search")
	public String search() {
		return "search";
	}
	
	
	/**返回查询结果
	 * @param userName
	 * @param session
	 * @return
	 */
	@RequestMapping(value="check", method=RequestMethod.POST)
	@ResponseBody
	public List<PartyMember> check(@RequestParam("login-userid") String userName,
			HttpSession session) {
		List<PartyMember> partyMember = partyMemberService.findElement(userName);
		return partyMember;
	}
	
	//修改密码
		@RequestMapping("/modifypwd")
		public String modifypwd() {
			return "modifypwd";
		}
		
		
	/**
	 * 修改密码
	 * @param userid
	 * @param old_password
	 * @param new_password
	 * @param session
	 * @return
	 */
	@RequestMapping(value="modify", method=RequestMethod.POST)
	public String modify_password(@RequestParam("login-userid") String userid,
			@RequestParam("old_password") String old_password,
			@RequestParam("new_password") String new_password,
			HttpSession session) {
		
		String list = partyMemberService.getPassword(userid);

		if(userid!=null&&old_password.equals(list)) {
			//如果账号密码匹配，登录成功，跳转到succ页面。必填项之类的可以由前端实现
			partyMemberService.modify_password(userid, new_password);
			return "succ";
		}
		
		return "failed";
	}
	
	//修改电话号码 
	
	@RequestMapping("/modifyPhone")
	public String modifyPhone() {
		return "modifyPhone";
	}
	
	@RequestMapping(value="modifyphone", method=RequestMethod.POST)
	public String modify_password(@RequestParam("login-userid") String userid,
			@RequestParam("new_phoneNumber") String new_phoneNumber,
			HttpSession session) {
		
			partyMemberService.modify_phoneNumber(userid, new_phoneNumber);
			return "succ";
	}
}
