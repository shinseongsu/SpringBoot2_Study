package com.spring.bluewalnut.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.spring.bluewalnut.service.MemberServiceImpl;
import com.spring.bluewalnut.vo.MemberVO;

public class CustomBasicAuthService implements UserDetailsService {

	@Autowired
	private MemberServiceImpl memberService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		MemberVO vo = new MemberVO();
		
		try {
			vo = memberService.Login(username);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return vo == null ? null : new CustomUser(vo);
	}

}
