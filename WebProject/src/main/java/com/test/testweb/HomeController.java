package com.test.testweb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.board.model.dto.LoginDto;



/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	//private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	private Logger logger = Logger.getLogger(HomeController.class);
	
	private LoginInf login_inf;
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	
	public String home(LoginDto dto, Locale locale, Model model,@RequestHeader(value="User-Agent", defaultValue="myBrowser") String userAgent) throws Exception {
		//logger.info("Welcome home! The client locale is {}.", locale);
		
		  Class.forName("com.mysql.cj.jdbc.Driver"); 

		   // Connection con = DriverManager.getConnection("jdbc:mysqldb://127.0.0.1:3306/test", "root",     "omen");// 마리아DB
		   Connection con =     DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/user_table","root","omen"); 
		    System.out.println(con);
		    
		Date date = new Date();
	//    LoginDto login = login_inf.login(dto);
	    
		
		//String input = (String)request.getParameter("User-Agent");
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		new HomeController().test(userAgent);
		
		return "home";
	}
	@RequestMapping(value="/userlogin.do", method=RequestMethod.POST)
	public String userLogin(LoginDto dto,@RequestHeader(value="User-Agent", defaultValue="myBrowser") String userAgent, HttpServletRequest request) {
		logger.info("Info!!"+ userAgent);
		logger.info("test"+request.getParameter("login_id"));
		 LoginDto login = login_inf.login(dto);
	    
		HttpSession session = request.getSession();
		logger.info("test2"+session);
		LoginDto res = login_inf.login(dto);
		logger.debug("debug!!"+dto.getMb_id());
		return "login";
	}
	public void test(String str) {
		logger.debug("debug!!");
		logger.info("Info!!"+ str);
		logger.warn("warn!!");
		logger.error("error!!");
		
	}
	
}
