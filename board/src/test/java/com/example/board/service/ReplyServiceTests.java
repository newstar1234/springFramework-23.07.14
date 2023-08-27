package com.example.board.service;

import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.board.domain.vo.ReplyVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyServiceTests {
	
	private Long[] arBno = {1343L, 1342L, 1341L, 1340L, 1339L};
	
	@Autowired
	private ReplyService replyService;
	 
	@Test
	public void serviceTest() {
		log.info("=====================================");
		log.info(replyService);
		log.info("=====================================");
	}
	
//	@Test
//	public void registerTest() {
//		//5개의 게시글에 2개씩 댓글 달기
//		IntStream.rangeClosed(21, 30).forEach(i -> {
//			ReplyVO replyVO = new ReplyVO();
//			replyVO.setBno(arBno[i % 5]);
//			replyVO.setReply("테스트댓글" + i);
//			replyVO.setReplier("글쓴이" + i);
//			
//			replyService.register(replyVO);
//		});
//	}

//	@Test
//	public void findByRNO_Test() {
//		log.info(replyService.findByRNO(30L));
//	}
	
//	@Test
//	public void removeTest() {
//		log.info(replyService.remove(30L));
//	}
	
//	@Test
//	public void removeAll_Test() {
//		log.info("=====================================");
//		log.info(replyService.removeAll(1341L));
//	}
	
//	@Test
//	public void modifyTest() {
//		ReplyVO replyVO = replyService.findByRNO(23L);
//		replyVO.setReply("2023.08.27");
//		log.info("=====================================");
//		log.info(replyService.modify(replyVO));
//		log.info("=====================================");
//	}
	
//	@Test
//	public void findAllByBNO() {
//		replyService.findAllByBNO(1343L).forEach(log::info);
//	}
}
