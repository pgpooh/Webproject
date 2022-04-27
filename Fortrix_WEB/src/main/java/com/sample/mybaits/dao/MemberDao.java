package com.sample.mybaits.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.sample.mybaits.member.Member;

@Component
public class MemberDao implements IMemberDao{
	
private HashMap dbMap;
	
	public MemberDao() {
		dbMap = new HashMap();
	}
	

	public void memberInsert(String memId, String memPw) {
		System.out.println("memberInsert()");
		System.out.println("memId : " + memId);
		System.out.println("memPw : " + memPw);
//		System.out.println("memMail : " + memMail);
//		System.out.println("memPhone : " + memPhone1 + "-" + memPhone2 + "-" + memPhone3);
//		
		Member member = new Member();
		member.setUserid(memId);
		member.setUserpwd(memPw);
//		member.setMemMail(memMail);
//		member.setMemPhone1(memPhone1);
//		member.setMemPhone2(memPhone2);
//		member.setMemPhone3(memPhone3);
		
		dbMap.put(memId, member);
		
		Set keys = dbMap.keySet();
		Iterator iterator = keys.iterator();
		
		while(iterator.hasNext()) {
			Object key = iterator.next();
			Member mem = (Member) dbMap.get(key);
			System.out.print("memberId:" + mem.getUserid() + "\t");
			System.out.println("|memberPw:" + mem.getUserpwd() + "\t");
//			System.out.println("|memberMail:" + mem.getMemMail() + "\t");
//			System.out.println("|memberPhone:" + mem.getMemPhone1() + "-" + mem.getMemPhone2() + "-" + mem.getMemPhone3() + "\n");
		}
	}

	public Member memberSelect(String memId, String memPw) {
		Member member = (Member) dbMap.get(memId);
		return member;
	}


	@Override
	public void memberInsert(String memId, String memPw, String memMail, String memPhone1, String memPhone2,
			String memPhone3) {
		// TODO Auto-generated method stub
		
	}



}
