package com.example.board.domain.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.board.domain.vo.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardDAOTests {

	@Autowired
	BoardDAO boardDAO;
	
	@Test
	public void daoTest() {
		log.info(boardDAO);
	}
	
//	@Test
//	public void registerTest() {
//		BoardVO boardVO = new BoardVO();
//		
//		boardVO.setTitle("새로운 게시글 제목");
//		boardVO.setContent("새로운 게시글 내용");
//		boardVO.setWriter("newstar001");
//		
//		boardDAO.register(boardVO);
//	}
	
//	@Test
//	public void getTest() {
//		log.info(boardDAO.get(10L));
//	}
		
//	@Test
//	public void modifyTest() {
//		BoardVO boardVO = boardDAO.get(10L);
//		
//		if(boardVO == null) {log.info("NO BOARD!"); return;}
//		boardVO.setTitle("수정되어진 타이틀");
//		boardVO.setContent("수정되어진 게시글내용");
//		
//		log.info("UPDATE :" + boardDAO.modify(boardVO));
//	}
	
//	@Test
//	public void removeTest() {
//		BoardVO boardVO = boardDAO.get(10L);
//		if(boardVO == null) {log.info("NO BOARD!"); return;}
//		
//		log.info("DELETE :" + boardDAO.remove(boardVO.getBno()));
//	}
	
	@Test
	public void getListTest() {
		boardDAO.getList().forEach(log::info);
	}
}
