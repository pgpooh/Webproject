package com.fortrix.service;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fortrix.dao.MemberDAO;
import com.fortrix.dao.MemberDAOImpl;
import com.fortrix.dto.MemberDTO;

@Component
public class MemberServiceImpl implements MemberService{

	MemberDAOImpl memberDao = new MemberDAOImpl();
	@Override
	public String loginCheck(MemberDTO dto) {
		// TODO Auto-generated method stub
		String name = memberDao.loginCheck(dto);
		if(name != null) {
			//session.setAttribute("mb_id", dto.getMb_id());
			//session.setAttribute("mb_name", name);
		}
		//return memberDao.loginCheck(dto);
		return name;
	}

	@Override
	public void logout(HttpSession session) {
		// TODO Auto-generated method stub
		session.invalidate();
	}

}
