package com.example.board.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PageDto {

	private int startPage;
	private int endPage;
	private int realEnd;
	private boolean prev, next;

	private int total;
	private Criteria criteria;
	
	public PageDto(int total, Criteria criteria) {
		super();
		this.total = total;
		this.criteria = criteria;
		
//		ceil(실수 값) : 올림 처리, 페이지에 게시글이 하나라도 있다면, 올림을 하여 해당 페이지를 표시하기 위함.
		this.endPage = (int)(Math.ceil(criteria.getPageNum() / (double)criteria.getAmount())) * criteria.getAmount();
		this.startPage = endPage - criteria.getAmount() -1;
	}
	
}
