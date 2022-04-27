package com.sample.dao;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.vo.MemberVO;

@Repository
public class MemberDAO {
	@Autowired
	private SqlSession sqlSession;
	
	public boolean signup(MemberVO vo) {
		try {
			MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
			if(mapper.signup(vo) != 0) return true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean login(MemberVO vo, HttpSession session) {
		try {
			MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
			if(mapper.login(vo)!=null) {
				session.setAttribute("userid", vo.getUserid());
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean logout(HttpSession session) {
		session.invalidate();
		return true;
	}
	public int checkid(String userid) {
		int result = 0;
		try {
			MemberMapper mapper = sqlSession.getMapper(MemberMapper.class);
			result=mapper.checkid(userid);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
