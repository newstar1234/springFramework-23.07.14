package com.example.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.board.domain.vo.ReplyVO;

@Service
public interface ReplyService {
//	댓글 작성
	public boolean register(ReplyVO replyVO);
//	댓글 불러오기
	public ReplyVO findByRNO(Long rno);
//	댓글 삭제
	public boolean remove(Long rno);
//	게시글 내의 댓글 전체 삭제
	public boolean removeAll(Long bno);
//	댓글 수정
	public boolean modify(ReplyVO replyVO);
//	댓글 목록 가져오기
	public List<ReplyVO> findAllByBNO(Long bno);
}
