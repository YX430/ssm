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
		//����sqlSessionFactoryBuilder
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		
		//����SqlMapConfig�ļ�
		InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
		
		//����factory
		SqlSessionFactory factory = builder.build(in);
		
		//��session
		SqlSession sqlSession = factory.openSession();
		
		//��ȡmapper�ӿڶ���
		PartyMemberMapper partyMemberMapper=sqlSession.getMapper(PartyMemberMapper.class);
		
		//����
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
		
		
		//����Ա�û����ֽ��в�ѯ
//		PartyMember member = sqlSession.selectOne("dao.PartyMemberMapper.findElementById","����");	
//		System.out.println(member.toString());
		
		//����һ���µ�����
		partyMemberMapper.savePartyMember(partyMember);
		sqlSession.commit();
		sqlSession.close();
	}
}
