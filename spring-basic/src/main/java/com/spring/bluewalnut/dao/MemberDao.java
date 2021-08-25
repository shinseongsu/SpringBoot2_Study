package com.spring.bluewalnut.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.bluewalnut.vo.MemberVO;

@Repository
public class MemberDao {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public MemberVO Login(String username) throws Exception {
		return mybatis.selectOne("BasicAuth.Login", username);
	}

}
