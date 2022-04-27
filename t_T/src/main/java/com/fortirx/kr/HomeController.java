package com.fortirx.kr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	private SqlSessionFactory sqlFactory ;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) throws ClassNotFoundException,SQLException {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		String url ="jdbc:mysql://localhost:3306/user_table?serverTimezone=UTC";
		String sql = "SELECT * FROM membertb";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//SqlSession sqlSesion = sqlFactory.openSession();
		Connection con = DriverManager.getConnection(url,"root","omen");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		System.out.print(st.execute(sql));
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		ResultSet resultSet= preparedStatement.executeQuery();
		while(resultSet.next()) {
			System.out.print("sql_test_re"+"\t"+resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getString(3)+"\t"+resultSet.getString(6));
					}
		
		
		
		rs.close();
		st.close();
		con.close();
		
		return "home";
	}
	
}
