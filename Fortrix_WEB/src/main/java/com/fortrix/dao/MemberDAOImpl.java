package com.fortrix.dao;

import org.apache.ibatis.session.SqlSession;

import com.fortrix.dto.MemberDTO;

public class MemberDAOImpl {
SqlSession sqlSession;

public String loginCheck(MemberDTO dto) {
	return sqlSession.selectOne("member.login_check", dto);
}

}
