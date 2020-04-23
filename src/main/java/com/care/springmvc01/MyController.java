package com.care.springmvc01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("aaa")	//주소창에 localhost:8088/aaa라고 치면 뜬다
	public String memberIndex() {
		return "/member/index";	//   /WEB-INF/views/member/indet.jsp 파일이라는 의미가 된다.

	}
	
	@RequestMapping(value = "/logout")
	public String memberLogout(Model model) {
		model.addAttribute("logout","로그아웃");
		
		//DB연동 등이 필요하다면 여기서 DB연동 후 결과값을 model에 담고 return으로 보내주는 식으로 처리하면 된다
		
		return "/member/logout";
	}
	
}
