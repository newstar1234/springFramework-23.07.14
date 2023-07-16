package com.example.ex01.mapper;

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
public class TimeMapperTests {
	@Autowired
	private TimeMapper timemapper;
	
//	@Test
//	public void testGetTime() {
//		log.info(timemapper.getClass().getName());
//		log.info(timemapper.getTime());
//	}
//	
	@Test
	public void testGetTime2() {
		log.info(timemapper.getClass().getName());
		log.info(timemapper.getTime2());
	}
}
