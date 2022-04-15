package com.mvc.board.model.dao;

import com.mvc.board.model.dto.LoginDto;

public interface LoginDao {
	String NAMESPACE = "LoingId.";
	
	public LoginDto login(LoginDto dto);
	
}
