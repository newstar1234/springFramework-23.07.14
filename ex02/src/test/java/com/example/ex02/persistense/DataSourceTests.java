package com.example.ex02.persistense;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DataSourceTests {
	
	@Autowired
	private DataSource datasource;
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void testConnction() {
		
		try(
			SqlSession sqlSession = sqlSessionFactory.openSession(true);
			Connection connection = sqlSession.getConnection();
				) {
			log.info(sqlSession);
			log.info(connection);
		}catch(Exception e) {
			fail(e.getMessage());
		}
		
		
		
		
//		try(Connection connection =datasource.getConnection()) {
//			log.info(connection);
//		}catch (Exception e) {
//			fail(e.getMessage());
//		}
	}
}
