package com.example.board.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
	
//	댓글 등록
	@PostMapping(value = "/new", consumes = "application/json", produces = {MediaType.TEXT_PLAIN_VALUE} )
	public ResponseEntity<String> create( @RequestBody ReplyVO replyVO) {
		log.info("create......:"+ replyVO);
		return replyService.register(replyVO) 
				? new ResponseEntity<>("success", HttpStatus.OK) 
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); 
	}
	
	
	
}
