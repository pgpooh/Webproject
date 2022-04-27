package com.fortrix.controller;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fortrix.dto.MemberDTO;
import com.fortrix.service.MemberService;
import com.fortrix.service.MemberServiceImpl;


@Controller // 컨트롤러 빈으로 등록 
@RequestMapping("/member/*")
public class MemeberController {
	@Autowired
	 MemberServiceImpl memberService = new MemberServiceImpl();
	 
	private Logger logger = LogManager.getLogger(MemeberController.class);
	@Inject
	 // menu.do를 클릭하면 views/member/login.jsp로 이동 
	//@RequestHeader(value="User-Agent", defaultValue="myBrowser") String userAgent
	@RequestMapping(value= "login.do")
	 public String login() {
	//
	  return "member/login";
	}

	@RequestMapping(value= "login_check.do")
	public ModelAndView login_check( @RequestParam("userid") String id, @RequestParam("passwd") String pwd/*
									 * @ModelAttribute MemberDTO dto, HttpSession
									 * session,@RequestHeader(value="User-Agent", defaultValue="myBrowser") String
									 * userAgent, @RequestParam("userid") String id, @RequestParam("passwd") String
									 * pwd
									 */) throws Exception {
		
				

	 
	 MemberDTO dto1 = new MemberDTO();
	 dto1.setMb_id(id);
	 dto1.setMb_pw(pwd);

	 String name = memberService.loginCheck(dto1);
	 
	 ModelAndView mav = new ModelAndView();
	  if (name != null) { // 로그인 성공 시
	   mav.setViewName("home"); // 뷰의 이름
	   } else { // 로그인 실패 시
	     mav.setViewName("member/login"); 		
	     mav.addObject("message", "error");
	     }
	     return mav;
	   }
	   
	@RequestMapping("logout.do")
	public ModelAndView logout(HttpSession session, ModelAndView mav) {
	memberService.logout(session); 
	 mav.setViewName("member/login"); 
	 mav.addObject("message", "logout"); 
	  return mav;
	  }
}
