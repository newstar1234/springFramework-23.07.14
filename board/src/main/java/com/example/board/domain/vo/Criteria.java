package com.example.board.domain.vo;

import org.springframework.web.util.UriComponentsBuilder;

import lombok.Data;

@Data
public class Criteria {
	private int pageNum;
	private int amount;
	private String type;
	private String keyword;
	
	public Criteria() {
		this(1,10);
	}

	public Criteria(int pageNum, int amount) {
		super();
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
	public String getParams() {
		UriComponentsBuilder builder = UriComponentsBuilder.fromPath("").queryParam("pageNum", this.pageNum);
		return builder.toUriString();
	}

	public Criteria(int pageNum, int amount, String type, String keyword) {
		super();
		this.pageNum = pageNum;
		this.amount = amount;
		this.type = type;
		this.keyword = keyword;
	}
	
	public String[] getTypes() {
//		"ABC".split("") --> 3칸 배열 ([A],[B],[C])
		return type == null ? new String [] {} : type.split("");
	}
	
	
}
