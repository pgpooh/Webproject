package com.sample.mybatis;
 

 
import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class MySQLConnectionTest {
    
    @Inject
    private DataSource ds;
    @Inject
    private SqlSessionFactory sqlSessionFactory;



    @Test
    public void testConnection() throws Exception {
 
		
		  try (Connection con = ds.getConnection()) {
		  
		  System.out.println("\n >>>>>>>>>> Connection 출력 : " + con + "\n");
		  
		  try (SqlSession session = sqlSessionFactory.openSession()){
			  System.out.println("\n >>>>>>>>>> Connection 출력 : " + session + "\n");
		  }
		  catch(Exception e ) {
			  e.printStackTrace();
		  }
		  } catch (Exception e) { e.printStackTrace(); }
		 
    }
    
}


