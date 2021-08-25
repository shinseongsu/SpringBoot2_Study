package com.spring.bluewalnut.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.bluewalnut.dao.MemberDao;
import com.spring.bluewalnut.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDao memberDao;
	
	@Override
	public MemberVO Login(String userid) throws Exception {
		return memberDao.Login(userid);
	}
	
}