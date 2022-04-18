package com.fortrix.service;

import javax.servlet.http.HttpSession;

import com.fortrix.dao.MemberDAO;
import com.fortrix.dao.MemberDAOImpl;
import com.fortrix.dto.MemberDTO;

public class MemberServiceImpl implements MemberService{

	MemberDAOImpl memberDao;
	@Override
	public String loginCheck(MemberDTO dto, HttpSession session) {
		// TODO Auto-generated method stub
		String name = memberDao.loginCheck(dto);
		if(name != null) {
			session.setAttribute("mb_id", dto.getMb_id());
			session.setAttribute("mb_name", name);
		}
		return name;
	}

	@Override
	public void logout(HttpSession session) {
		// TODO Auto-generated method stub
		session.invalidate();
	}

}
