package com.example.board.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.board.domain.vo.ReplyVO;
import com.example.board.service.ReplyService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@RestController
@RequiredArgsConstructor
@RequestMapping("/replies/*")
@Log4j
public class ReplyController {

	private final ReplyService replyService;
	
//!	댓글 등록
//	header에 전달되는건 @RequestBody
	@PostMapping(value = "/new", consumes = "application/json", produces = {MediaType.TEXT_PLAIN_VALUE} )
	public ResponseEntity<String> create( @RequestBody ReplyVO replyVO) {
		log.info("create......:"+ replyVO);
		return replyService.register(replyVO) 
				? new ResponseEntity<>("success", HttpStatus.OK) 
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); 
	}
	
//!	게시글에 달린 댓글 전체 조회
//	url에 전달되는건 @PathVariable
//	header에 뭔가를 담아야할때는 ResonseEntity<>를 사용
	@GetMapping(value = "/{bno}/{page}", produces = {MediaType.APPLICATION_XML_VALUE} )
	public ResponseEntity<List<ReplyVO>> getList(@PathVariable("bno") Long bno, @PathVariable int page) {
		log.info("getList........:" + bno);
		return new ResponseEntity<> (replyService.findAllByBNO(bno), HttpStatus.OK);
	}
	
//!	댓글 1개 조회
//	데이터만 전달할 때는 ResponseEntity 꼭 사용할 필요는 없음
	@GetMapping(value = "/{rno}", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE} )
	public ReplyVO getReply(@PathVariable("rno") Long rno) {
		log.info("getReply........:" + rno);
		return replyService.findByRNO(rno);
	}
	
//!	댓글 삭제
	@DeleteMapping(value = "/{rno}", produces = {MediaType.TEXT_PLAIN_VALUE} )
	public String remove(@PathVariable Long rno) {
		log.info("remove.......: " + rno);
		return replyService.remove(rno) ? "success" : "fail"; 
	}
	
}
