package com.fortrix.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fortrix.dto.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	//@Autowired 
	//@Inject
	SqlSession sqlSession;

	
public String loginCheck(MemberDTO dto) {
	return sqlSession.selectOne
			("member.login", dto);
}

}
