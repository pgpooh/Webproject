package com.fortirx.web_test.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fortirx.web_test.dto.BoardDto;
import com.fortirx.web_test.form.BoardForm;

@Repository
public class BoardDao {
	@Autowired
    private SqlSession sqlSession;
 
    private static final String NAMESPACE = "Login";
 
    public List<BoardDto> getBoardList(BoardForm boardForm) throws Exception {
 
        return sqlSession.selectList("Login.Logintest");
    }
}
