package com.fortirx.web_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class MySQLConnectionTest {
	 static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	    static final String URL = "jdbc:mysql://127.0.0.1:3306/user_table?useSSL=false";
	    static final String USERNAME = "root";
	    static final String PASSWORD = "omen";
	 
	    @Test
	    public void getMySQLConnectionTest() {
	        
	        Connection conn = null;
	        Statement stmt = null;
	        
	        try {
	            
	            System.out.println("==================== MySQL Connection START ====================");
	            
	            Class.forName(DRIVER);
	            
	            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
	            stmt = conn.createStatement();
	 
	            String sql = "SELECT IDX, ID, NAME, PW FROM membertb";
	 
	            ResultSet rs = stmt.executeQuery(sql);
	            while (rs.next()) {
	                
	                String idx = rs.getString("IDX");
	                String id  = rs.getString("ID");
	                String name = rs.getString("NAME");
	                String pw = rs.getString("PW");
	 
	                System.out.print("idx : " + idx + ", ");
	                System.out.print("id: " + id + ", ");
	                System.out.print("name: " + name+", ");
	                System.out.println("pw: "+pw);
	            }
	 
	            rs.close();
	            stmt.close();
	            conn.close();
	 
	        } catch (SQLException se1) {
	            se1.printStackTrace();
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        } finally {
	            try {
	                if (stmt != null) {
	                    stmt.close();
	                }
	            } catch (SQLException se) {
	                se.printStackTrace();
	            }
	            try {
	                if (conn != null) {
	                    conn.close();
	                }
	            } catch (SQLException se) {
	                se.printStackTrace();
	            }
	        }
	        
	        System.out.println("==================== MySQL Connection END ====================");
	    }
}
