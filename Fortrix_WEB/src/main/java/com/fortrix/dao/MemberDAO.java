package com.fortrix.dao;

import com.fortrix.dto.MemberDTO;

public interface MemberDAO {
	String NAMESPACE = "member.";
	public String loginCheck(MemberDTO dto);
	
}
