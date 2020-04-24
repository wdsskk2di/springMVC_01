package com.care.springmvc02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.care.member.Member;

@Controller
public class MyController3 {
	
	@RequestMapping("index01")
	public String memberIndex() {
		return "member3/index";
	}
	//에러. 페이지 연결 못함. com.care.springmvc01에 index 연결하는 컨트롤러가 없기 때문. 추가하면 사용 가능
	
	/*    **이렇게 값을 가져와 저장할 수도 있고
	@RequestMapping("result")
	public String result(@RequestParam("name") String name, @RequestParam("age") String age, @RequestParam("addr") String addr, Model model) {
		
		Member mem = new Member();
		mem.setName(name);		mem.setAge(age);	mem.setAddr(addr);
		model.addAttribute("mem", mem);
		
		return "member3/result";		
	}
	*/
	
	//  **가져오는 값이 Member와 같다면 매개변수를 Member로 해줄 수도 있다
	@RequestMapping("result")
	public String result(Member member, Model model) {
		System.out.println("name: "+member.getName());
		System.out.println("name: "+member.getAge());
		System.out.println("name: "+member.getAddr());
		//Member에 자동으로 들어가 있음을 알 수 있음
		
		model.addAttribute("mem",member);
		//Model에 member를 넣어서 값을 넘겨주기
		return "member3/result";
	}
}
