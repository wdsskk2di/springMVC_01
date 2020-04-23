package com.care.springmvc01;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController2 {
	
	@RequestMapping("/member2/index")
	public String memberIndex() {
		return "/member2/index";	
	}
	
	@RequestMapping("/member2/result")
	public String memberResult(HttpServletRequest req, Model model) {
		String name = req.getParameter("name");	//req로 name이라는 param값 가져와서 변수 name에 저장
		String age = req.getParameter("age");	//req로 age이라는 param값 가져와서 변수 age에 저장
		
		model.addAttribute("name", req.getMethod()+" => "+name);	//이름, 넘겨주는 방식 + name에 저장된 값
		model.addAttribute("age", req.getMethod()+" => "+age);	//이름, 넘겨주는 방식 + age에 저장된 값
		
		return "/member2/result";	//result.jsp로 값을 넘겨줌
	}

}
