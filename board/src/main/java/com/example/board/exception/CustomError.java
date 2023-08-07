package com.example.board.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


// error 404, 405, 500 처리방법
@Controller
public class CustomError {
	
	@GetMapping("/error")
	public String goErrorPage() {
		return "error/error";
	}

}
