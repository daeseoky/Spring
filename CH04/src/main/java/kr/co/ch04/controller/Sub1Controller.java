package kr.co.ch04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Sub1Controller {

	@RequestMapping(path = "/sub1/hello", method = RequestMethod.GET)  // RequestMapping은 요즘안씀
	public String hello() {
		return "/sub1/hello";
	}
	
	@GetMapping("/sub1/welcom")
	public String welcom() {
		return "/sub1/welcom";
	}
	
	@GetMapping("/sub1/greeting")
	public String greeting() {
		return "/sub1/greeting";
	}
	
	
}
