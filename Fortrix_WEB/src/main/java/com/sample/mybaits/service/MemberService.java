package com.sample.mybaits.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.mybaits.dao.MemberDao;
import com.sample.mybaits.member.Member;

@Service
public class MemberService implements IMemberService{
	@Autowired 
	MemberDao dao; 

	@Override 
	public void memberRegister(String memId, String memPw) { 
		System.out.println("memberRegister()");
		System.out.println("memId : " + memId); 
		System.out.println("memPw : " + memPw); 
//		System.out.println("memMail : " + memMail); 
//		System.out.println("memPhone : " + memPhone1 + "-" + memPhone2 + "-" + memPhone3); 
		dao.memberInsert(memId, memPw); 
		} 
	
	@Override
	public Member memberSearch(String memId, String memPw) { 
		System.out.println("memberSearch()"); 
		System.out.println("memId : " + memId); 
		System.out.println("memPw : " + memPw); 
		Member member = dao.memberSelect(memId, memPw); 
		return member; 
		}

}
