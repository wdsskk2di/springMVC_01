package com.care.mvc_ex04;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.member.Member;

@Controller
public class QuizController {
	
	@RequestMapping("mvc_ex04/index")	//mvc_ex04/index라고 경로를 정하면 아래 컨트롤러에서도 반드시 mvc_ex04/를 붙여줘야 한다
	public String quizIndex() {
		return "mvc04/index";	//return으로 부르는 경로는 절대 경로! 폴더명/파일명 이라고 써줘야 된다
	}
	
	@RequestMapping("mvc_ex04/result03")
	public String quizResult(Model model, HttpServletRequest request) {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");

		if(id.equals("1") && pwd.equals("2")) {	
			return "redirect:memberInfo";	//redirect는 mvc_ex04/없이 이동하려는 경로 이름 memberInfo만 써주면 된다
											//mvc_ex04/memberInfo라고 써버리면 컨트롤러는 mvc_ex04/mvc_ex04/memberInfo를 찾으려함
		} else {
			return "redirect:index";
		}
	}
	
	@RequestMapping("mvc_ex04/memberInfo")	
	public String memInfo() {
		return "mvc04/memberInfo";		
	}
	
	/*
	@PostMapping("mvc_ex04/infoResult")
	public String infoResult(HttpServletRequest request, Model model) {
		
		model.addAttribute("name",  request.getParameter("name"));
		model.addAttribute("age",  request.getParameter("age"));
		model.addAttribute("addr",  request.getParameter("addr"));
		
		return "mvc04/memberShow";
	}
	*/
	
	@PostMapping("mvc_ex04/infoResult")
	public String infoResult(Member member, Model model) {
		
		model.addAttribute("mem",  member);
		
		return "mvc04/memberShow";
	}

}