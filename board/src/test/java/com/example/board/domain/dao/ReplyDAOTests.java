package com.example.board.domain.dao;

import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.board.domain.vo.ReplyVO;
import com.example.board.mapper.ReplyMapperTests;

import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyDAOTests {
	
	private Long[] arBno = {1343L, 1342L, 1341L, 1340L, 1339L};
	
	@Autowired
	private ReplyDAO replyDAO;
	
	@Test
	public void daoTest() {
		log.info("=====================================");
		log.info(replyDAO);
		log.info("=====================================");
	}
	
//	@Test
//	public void registerTest() {
//		//5개의 게시글에 2개씩 댓글 달기
//		IntStream.rangeClosed(11, 20).forEach(i -> {
//			ReplyVO replyVO = new ReplyVO();
//			replyVO.setBno(arBno[i % 5]);
//			replyVO.setReply("댓글 테스트" + i);
//			replyVO.setReplier("작성자" + i);
//			
//			replyDAO.register(replyVO);
//		});
//	}

//	@Test
//	public void findByRNO_Test() {
//		log.info(replyDAO.findByRNO(16L));
//	}
	
//	@Test
//	public void removeTest() {
//		log.info(replyDAO.remove(17L));
//	}
	
//	@Test
//	public void removeAllByBNO_Test() {
//		log.info("=====================================");
//		log.info(replyDAO.removeAllByBno(1339L));
//	}
	
//	@Test
//	public void modifyTest() {
//		ReplyVO replyVO = replyDAO.findByRNO(15L);
//		replyVO.setReply("수정한 댓글입니다");
//		log.info("=====================================");
//		log.info(replyDAO.modify(replyVO));
//		log.info("=====================================");
//	}
	
	@Test
	public void findAllByBNO() {
		replyDAO.findAllByBNO(1342L).forEach(log::info);
	}
	
}
