package com.jnu.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.jnu.dao.PartyMemberMapper;
import com.jnu.domain.PartyMember;

public class MyBatisTest {

	@Test
	public void test() throws IOException {
		//创建sqlSessionFactoryBuilder
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		
		//加载SqlMapConfig文件
		InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
		
		//创建factory
		SqlSessionFactory factory = builder.build(in);
		
		//打开session
		SqlSession sqlSession = factory.openSession();
		
		//获取mapper接口对象
		PartyMemberMapper partyMemberMapper=sqlSession.getMapper(PartyMemberMapper.class);
		
		//操作
		PartyMember partyMember = new PartyMember(); 
		partyMember.setActivist_date("2011");
		partyMember.setCandidate_date("2012");
		partyMember.setIs_prepared_member(true);	
		partyMember.setLecture_score(100);
		partyMember.setUnit_id("NYU");
		partyMember.setUser_id("Harry");
		partyMember.setUser_name("HarryPotter");
		partyMember.setUser_password("413413");
		partyMember.setUser_phone("15918779272");
		partyMember.setUser_idcard("440681200020202020");
		
		
		//按党员用户名字进行查询
//		PartyMember member = sqlSession.selectOne("dao.PartyMemberMapper.findElementById","伯贤");	
//		System.out.println(member.toString());
		
		//插入一条新的数据
		partyMemberMapper.savePartyMember(partyMember);
		sqlSession.commit();
		sqlSession.close();
	}
}
