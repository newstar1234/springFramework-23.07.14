package com.example.board.mapper;

import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.board.domain.vo.ReplyVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	
	private Long[] arBno = {1343L, 1342L, 1341L, 1340L, 1339L};
	
	@Autowired
	ReplyMapper replyMapper;
	
	@Test
	public void mapperTest() {
		log.info(replyMapper);
	}
	
//	@Test
//	public void insertTest() {
//		//5개의 게시글에 2개씩 댓글 달기
//		IntStream.rangeClosed(1, 10).forEach(i -> {
//			ReplyVO replyVO = new ReplyVO();
//			replyVO.setBno(arBno[i % 5]);
//			replyVO.setReply("댓글 테스트" + i);
//			replyVO.setReplier("작성자" + i);
//			
//			replyMapper.insert(replyVO);
//		});
//	}
	
	@Test
	public void selectTest() {
		log.info(replyMapper.select(10L));
	}
}
