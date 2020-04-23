package com.care.springmvc01;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController2 {
	
	@RequestMapping("/member2/index")
	public String memberIndex() {
		return "/member2/index";	
	}
	
	//**@RequestMapping은 넘겨주는 값이 적으면, value 없이 직접 경로 이름을 써줘도 되지만
	@RequestMapping("/member2/result")	
	public String memberResult(HttpServletRequest req, Model model) {
		String name = req.getParameter("name");	//req로 name이라는 param값 가져와서 변수 name에 저장
		String age = req.getParameter("age");	//req로 age이라는 param값 가져와서 변수 age에 저장
		
		model.addAttribute("name", req.getMethod()+" => "+name);	//이름, 넘겨주는 방식 + name에 저장된 값
		model.addAttribute("age", req.getMethod()+" => "+age);	//이름, 넘겨주는 방식 + age에 저장된 값
		
		return "/member2/result";	//result.jsp로 값을 넘겨줌
	}	
	
	//**속성 2개부터는 value 지정해줘야 오류 안남
//	@RequestMapping(value = "/member2/result", method = RequestMethod.POST) //포스트 방식
	@PostMapping("/member2/result")
	public String memberResult2(@RequestParam("name") String name, @RequestParam("age") String age, Model model) {
		//@RequestParam("name") String name == param으로 넘어온 값의 이름이(name=??) name과 같으면 변수 name에 그 값(??)을 넣는다.
		model.addAttribute("name",name+"(포스트)");
		model.addAttribute("age",age+"(포스트)");
		
		return "member2/result";
	}

}
