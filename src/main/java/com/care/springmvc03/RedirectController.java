package com.care.springmvc03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
	
	@RequestMapping("index02")
	public String index() {
		return "redirect01/index";
	}
}
