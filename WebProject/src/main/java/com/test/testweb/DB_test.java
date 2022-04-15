package com.test.testweb;

import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.Test;

public class DB_test {
	@Test
	public void test() throws Exception {
	    //Class.forName("org.mariadb.jdbc.Driver"); // 마리아DB
	    Class.forName("com.mysql.cj.jdbc.Driver"); 

	   // Connection con = DriverManager.getConnection("jdbc:mysqldb://127.0.0.1:3306/test", "root",     "omen");// 마리아DB
	   Connection con =     DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/user_table","root","omen"); 
	    System.out.println(con);
	    }
}
