package com.sample.mybaits.dao;

import com.sample.mybaits.member.Member;

public interface IMemberDao {
	void memberInsert(String memId, String memPw, String memMail, String memPhone1, String memPhone2, String memPhone3); 
	Member memberSelect(String memId, String memPw);

}
