package com.sample.mybaits.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.sample.mybaits.member.Member;
import com.sample.mybaits.service.MemberService;
@RequestMapping("/html/*")
@Controller
public class MemberController {
	@Autowired 
	MemberService service; 
	@RequestMapping(value="/memJoin", method=RequestMethod.POST) 
	public String memJoin(Model model, HttpServletRequest request) { 
		String memId = request.getParameter("memId"); 
		String memPw = request.getParameter("memPw"); 
//		String memMail = request.getParameter("memMail"); 
//		String memPhone1 = request.getParameter("memPhone1"); 
//		String memPhone2 = request.getParameter("memPhone2"); 
//		String memPhone3 = request.getParameter("memPhone3"); 
		service.memberRegister(memId, memPw); 
		model.addAttribute("memId", memId); 
		model.addAttribute("memPw", memPw); 
//		model.addAttribute("memMail", memMail); 
//		model.addAttribute("memPhone", memPhone1 + "-" + memPhone2 + "-" + memPhone3); 
		return "memJoinOK"; 
		} 
	@RequestMapping(value="/memLogin", method=RequestMethod.POST) 
	public String memLogin(Model model, HttpServletRequest request) { 
		String memId = request.getParameter("memId"); 
		String memPw = request.getParameter("memPw"); 
		Member member = service.memberSearch(memId, memPw); 
		try { 
			model.addAttribute("memId", member.getUserid()); 
			model.addAttribute("memPw", member.getUserpwd()); 
			} catch (Exception e){ 
				e.printStackTrace(); 
				} 
		return "memLoginOk"; 
		}


}
