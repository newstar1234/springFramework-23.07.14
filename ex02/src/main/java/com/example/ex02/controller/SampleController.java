package com.example.ex02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/ex/*")
@Log4j
public class SampleController {
	
	@RequestMapping(value = "/basic", method = {RequestMethod.GET, RequestMethod.POST })
	public void basic() {
		log.info("basic....");
	}
}
