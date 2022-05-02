package com.fortirx.web_test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fortirx.web_test.dao.BoardDao;
import com.fortirx.web_test.dto.BoardDto;
import com.fortirx.web_test.form.BoardForm;
@Service
public class BoardService {
	  @Autowired
	    private BoardDao boardDao;
	 
	    public List<BoardDto> getBoardList(BoardForm boardForm) throws Exception {
	 
	        return boardDao.getBoardList(boardForm);
	    }
}
