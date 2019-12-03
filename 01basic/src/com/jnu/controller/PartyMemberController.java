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
	@ResponseBody 					//����ת��json����
	public List<PartyMember> list() {
		List<PartyMember> list = partyMemberService.findAll();
		return list;
	}
	
	@RequestMapping("/login")
	public String input() {
		return "login";
	}
	
	/**
	 * ��¼
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
			//����˺�����ƥ�䣬��¼�ɹ�����ת��succҳ�档������֮��Ŀ�����ǰ��ʵ��
			return "succ";
		}
			//����˺����벻ƥ�䣬��¼ʧ�ܣ���ת��failedҳ��
		else return "failed";
	}
	
	
	//����id��ѯ����
	@RequestMapping("/search")
	public String search() {
		return "search";
	}
	
	
	/**���ز�ѯ���
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
	
	//�޸�����
		@RequestMapping("/modifypwd")
		public String modifypwd() {
			return "modifypwd";
		}
		
		
	/**
	 * �޸�����
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
			//����˺�����ƥ�䣬��¼�ɹ�����ת��succҳ�档������֮��Ŀ�����ǰ��ʵ��
			partyMemberService.modify_password(userid, new_password);
			return "succ";
		}
		
		return "failed";
	}
	
	//�޸ĵ绰���� 
	
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
