package com.fortirx.web_test.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.fortirx.web_test.dto.BoardDto;
import com.fortirx.web_test.form.BoardForm;

@Repository
public class BoardDao {
	@Resource(name = "sqlSession")
    private SqlSession sqlSession;
 
    private static final String NAMESPACE = "com.fortrix.web_test.boardMapper";
 
    public List<BoardDto> getBoardList(BoardForm boardForm) throws Exception {
 
        return sqlSession.selectList(NAMESPACE + ".getBoardList");
    }
}
