package com.jnu.test;

import org.apache.catalina.core.ApplicationContext;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jnu.dao.PartyMemberMapper;
import com.jnu.domain.PartyMember;
import com.jnu.service.PartyMemberService;

public class MyBatisSpringTest {
	@Test
	public void test() {
		//º”‘ÿspring≈‰÷√
		ClassPathXmlApplicationContext ac= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//
		PartyMemberMapper partyMemberMapper = (PartyMemberMapper)ac.getBean("partyMemberMapper");
//		
		PartyMember partyMember = new PartyMember(); 
		partyMember.setActivist_date("2011");
		partyMember.setCandidate_date("2012");
		partyMember.setIs_prepared_member(true);	
		partyMember.setLecture_score(100);
//		partyMember.setUnit_id("NYU");
		partyMember.setUser_id("Harry");
		partyMember.setUser_name("HarryPotter");
		partyMember.setUser_password("413413");
		partyMember.setUser_phone("15918779272");
		partyMember.setUser_idcard("440681200020202020");

		PartyMemberService partyMemberService = (PartyMemberService) ac.getBean("partyMemberService");
//		partyMemberService.save(partyMember);
//		System.out.print(partyMemberService.findAll());
		System.out.print(partyMemberService.getPassword("Harry"));
		
//		partyMemberMapper.savePartyMember(partyMember);
//		partyMemberMapper.findElementById("HarryPorter");
		
	}

}
