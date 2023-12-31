package com.example.board.mapper;

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
public class BoardMapperTests {
	@Autowired
	private BoardMapper boardMappper;
	
//	@Test
//	public void getListTest() {
//		boardMappper.getList().forEach(log::info);
//	}
	
//	@Test
//	public void insertTest() {
//		BoardVO board = new BoardVO();
//		board.setTitle("새로 작성한 글 제목05");
//		board.setContent("새로 작성한 내용05");
//		board.setWriter("user05");
//		
//		boardMappper.insert(board);
//		
//		log.info(board);
//	}
	
//	@Test
//	public void readTest() {
//		BoardVO baordVO = boardMappper.read(5L);
//		log.info(baordVO);
//	}
	
	@Test
	public void deleteTest() {
		Long bno = 2L;
		BoardVO boardVO = boardMappper.read(bno);
		if(boardMappper.read(bno) != null) {
			log.info("DELETE COUNT :" + boardMappper.delete(bno));	
			return;
		}
		log.info("NO BOARD!");
	}
	
//	@Test
//	public void updateTest() {
//		BoardVO boardVO = boardMappper.read(1L);
//		if(boardVO != null) {
//			
//			boardVO.setTitle("수정된 제목");
//			boardVO.setContent("수정된 내용");
//			boardVO.setWriter("user00");
//			
//			log.info("UPDATE COUNT :" + boardMappper.update(boardVO));
//			return;
//		}
//		log.info("NO BOARD!");
//	}
	
	
}
