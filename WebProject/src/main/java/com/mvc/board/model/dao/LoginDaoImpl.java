package com.mvc.board.model.dao;

import org.mybatis.spring.SqlSessionTemplate;

import com.mvc.board.model.dto.LoginDto;

public class LoginDaoImpl implements LoginDao {
	
	private SqlSessionTemplate sqlSession;
	
	public LoginDto login(LoginDto dto) {
		LoginDto res = null;
		
		try {
			res = sqlSession.selectOne(NAMESPACE+"login",dto);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return res;
	}

}
