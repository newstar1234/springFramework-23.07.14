package com.example.board.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.board.domain.vo.ReplyVO;

@Mapper
public interface ReplyMapper {
	
//	댓글 작성
	public int insert(ReplyVO replyVO);
//	댓글 불러오기
	public ReplyVO select(Long rno);
//	댓글 삭제
	public int delete(Long rno);
//	게시글 내의 댓글 전체 삭제
	public int deleteAll(Long bno);
//	댓글 수정
	public int update(ReplyVO replyVO);
}
