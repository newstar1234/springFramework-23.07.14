package com.example.ex02.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ex02.domain.vo.InfoDto;
import com.example.ex02.domain.vo.StudentVO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/ex/*")
@Log4j
public class SampleController {
	
	@RequestMapping(value = "/basic", method = {RequestMethod.GET, RequestMethod.POST })
	public void basic(HttpServletRequest req) {
		log.info("basic...." + req.getMethod());
	}
//	/ex/basic일때 basic.... 출력
	
	@RequestMapping
	public void basic2() {
		log.info("basic2...........");
	}
//	/ex 뒤에 아무것도 없을 때 basic2........... 출력
	
	@GetMapping("/basicOnlyGet")
	public void basic3() {
		log.info("basic3.....only get");
	}
//	/ex/basicOnlyGet 일때 basic3.....only get 출력
	
	@GetMapping("/ex01")
//	외부에서 전달된 파라미터의 매개변수 필드명과 자동으로 매핑한다.
//	void==> 요청한 경로의 jsp로 이동하겠다.
	public void ex01(InfoDto infoDto) {
		log.info("ex01..." + infoDto.getName() + ", " + infoDto.getAge());
	}
	
	@GetMapping("ex02")
//	외부에서 전달된 파라미터의 이름과 매개변수가  다를 경우 @RequestParam을 사용하여 어디로 전달받을지 알려준다.
	public void ex02 ( @RequestParam("data1") String name, @RequestParam("data2") int age) {
		log.info("ex02..." + name + ", " + age);
	}
	
	@GetMapping("/ex03")
	public String ex03(@RequestParam("data") ArrayList<String> datas) {
//		String==> 내가 원하는 경로의 jsp로 이동하겠다.
		log.info("datas:" + datas );
		return "ex03";
	}
	
	@GetMapping("/ex04")
//	만약 매개변수가 객체라면, 해당 클래스 타입의 앞 글자만 소문자로 변경된 값이 
//	화면에서 사용할 key 값이다.
//	예) 매개변수의 타입이 InfoDto라면, 화면에서 사용시 key 값은 infoDto가 된다.
//	만약에 key 값을 수정하거나 매개변수가 많아진다면,
//	직접 requestScope에 담아서 전달해야 한다.
//	이때 request 객체를 직접 불러오지 않고, Model 이라는 데이터 전달자를 사용하게 된다.
//	하지만 화면쪽에 전달할 데이터가 여러 개가 아니라면, @ModelAttribute()를 사용하여 화면에 전달해준다.
//	@ModelAttribute("화면에서 사용할 KEY")
	public String ex04(@ModelAttribute("dto") InfoDto infoDto) {
		log.info("===================");
		log.info("ex04......");
		log.info(infoDto.toString());
		log.info("===================");

		return "ex04";
	}
	
	@GetMapping("/ex05")
	public void ex05(InfoDto infoDto, @ModelAttribute("gender") String gender) {
		log.info("ex05........");
		log.info(infoDto.toString());
		log.info("gender :" + gender);
	}
	
	@GetMapping("/ex06")
//	Model 객체는 파라미터로 request 객체를 받는다.
//	따라서 여러 개의 데이터를 화면에 전달할 때
//	addAttribute(KEY, VALUE)을 사용한다.
//	화면에서는 model에 설정한 KEY 로 VALUE를 사용할 수 있다.
	public String ex06(InfoDto infoDto, String gender, Model model) {
		log.info("ex06........");
		log.info(infoDto.toString());
		log.info("gender :" + gender);
		
		model.addAttribute("dto", infoDto);
		model.addAttribute("gender", gender);
//		("gender", gender); => (key값, value값);
		return "ex/ex06";
	}
	
//	국어, 영어, 수학 model객체 만들기
	@GetMapping("/ex07")
//	외부에서 학생의 번호, 국어, 영어, 수학 점수를 모델 객체로 전달받는다.
//	파라미터명과 매개변수에 선언된 모델 객체의 필드명이 동일하면 자동으로 매핑된다.
//	리턴 시 알맞는 페이지로 이동이 되고, 모델 객체는 직접 KEY를 지정하지않아도
//	화면 쪽에서는 앞 글자만 소문자로 바뀐 값으로 해당 필드를 접근할 수 있다.
	public String ex07(StudentVO studentVO) {
		log.info("ex07------------");
		log.info(studentVO.toString());
		return "ex/ex07";
	}
	
	
}
