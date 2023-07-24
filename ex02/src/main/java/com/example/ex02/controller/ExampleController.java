package com.example.ex02.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class ExampleController {
//	이름을 입력하고 출근 또는 퇴근 버튼 클릭한다.
//	출근 시간은 09:00 이며, 퇴근 시간 18:00 이다.
//	출근 버튼 클릭 시 9시가 넘으면 지각으로 처리하고,
//	퇴근 버튼 클릭 시 18시전이라면 퇴근이 아닌 업무시간으로 처리한다.

//	모든 jsp는 work 경로 안에 생성하며 아래와 같이 분기별로 jsp 문서를 한 개씩 작성한다.
	
//	- getToWork.jsp //출근시 지각처리
//	- leaveWord.jsp //퇴근시 아직 근무시간
//	- late.jsp
//	- work.jsp
	
	@GetMapping("/checkIn")
	public String checkIn() {
		return "/work/checkIn";
	}
	
	@GetMapping("/getToWork")
	public String getToWork(@ModelAttribute("name") String name) {
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		
		boolean lateCondition = hour >= 9 && minute > 0;
		
		if(lateCondition) { //지각했을 때 
			return "work/late";
		}
		return "work/getToWork";
	}
	
	@GetMapping("/leaveWork")
	public String leaveWork(@ModelAttribute("name") String name) {
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		
		boolean leaveWorkCondition = hour >= 18 && minute >= 0;
		
		if(leaveWorkCondition) { //퇴근시간 도래
			return "work/leaveWork";
		}// 퇴근시간 이전이니까 아직 근무시간
		return "work/work";
	}
}
