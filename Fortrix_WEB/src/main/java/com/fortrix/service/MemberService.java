package com.fortrix.service;

import javax.servlet.http.HttpSession;

import com.fortrix.dto.MemberDTO;

public interface MemberService {
	public String loginCheck(MemberDTO dto);
	public void logout(HttpSession session);

}
