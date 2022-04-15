package com.test.testweb;

import com.mvc.board.model.dao.LoginDao;
import com.mvc.board.model.dto.LoginDto;

public class LoginImpl implements LoginInf{

	private LoginDao dao;
	
	public LoginDto login(LoginDto dto) {
		return dao.login(dto);
	}
}
