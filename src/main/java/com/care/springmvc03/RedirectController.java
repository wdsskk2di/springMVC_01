package com.care.springmvc03;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RedirectController {
	
	@RequestMapping("index02")
	public String index() {
		return "redirect01/index";
	}
	
	@RequestMapping("result02")	//1.Http 2.Model 추가 3.Redirect 추가(사용 빈도 낮음)
	public String result(Model model, HttpServletRequest request, RedirectAttributes ra) {
		String id = request.getParameter("id");
		System.out.println("id: "+id);
		
		//model.addAttribute("test", "연습중");	//2.
		ra.addAttribute("test", "ra로 넘어온 값");  //3.
		
		if(id.equals("abc")) {
			return "redirect:rsOK";	//*해당 url을 찾아가라. -> 전달할게 있는 상황이라면? 아래 rsOK를 거쳐서 정보를 전달할 수 있음
			//return "redirect/rsOK";	**해당 경로를 직접 찾아가라. -> 전달할게 있는 상황이라면? 정보를 전달하지 못함. 단순 이동만..
		}else {
			return "redirect:rsNo";
		}		
	}
	
	@RequestMapping("rsOK")	//*해당 url로 오면
	public String rsOk(Model model) {
		model.addAttribute("name", "하나");
		return "redirect01/rsOK";	//*이 경로로 가라
	}
	
	@RequestMapping("rsNo")	//4.requestParam 추가
	public String rsNo(@RequestParam("test") String aaa, Model model, HttpServletRequest request) {	//
		System.out.println("rep: "+request.getAttribute("test"));	//2. null이 출력됨. 위 result에서 model에 저장한 값을 받아오지 못한다는 것
		System.out.println("rep: "+request.getParameter("test"));	//2. 3. 값이 출력됨! 위 result에서 model에 저장한 값을 받아올 수 있다.
		System.out.println("@RequestParam(\"test\") String aaa: "+aaa);	//4.
		return "redirect01/rsNo";
	}
}
