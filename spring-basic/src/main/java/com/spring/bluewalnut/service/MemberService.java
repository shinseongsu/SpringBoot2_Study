package com.spring.bluewalnut.service;

import com.spring.bluewalnut.vo.MemberVO;

public interface MemberService {
	public MemberVO Login(String userid) throws Exception;
}
