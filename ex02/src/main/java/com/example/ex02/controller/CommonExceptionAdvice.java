package com.example.ex02.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

import lombok.extern.log4j.Log4j;

@ControllerAdvice
@Log4j
public class CommonExceptionAdvice {
//	@ExceptionHandler(Exception.class)
//	public String except(Exception e, Model model) {
//		log.error("Exception.............." + e.getMessage());
//		model.addAttribute("exception", e);
//		log.error(model.toString());
//		return "error/500";
//	}
//	
//	@ExceptionHandler(NoHandlerFoundException.class)
//	@ResponseStatus(HttpStatus.NOT_FOUND)
//	public String except404(NoHandlerFoundException e) {
//		return "error/404";
//	}
	
}
