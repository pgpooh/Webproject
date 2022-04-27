package com.sample.mybaits.service;

import com.sample.mybaits.member.Member;

public interface IMemberService {
	void memberRegister(String memId, String memPw); 
	Member memberSearch(String memId, String memPw);



}
