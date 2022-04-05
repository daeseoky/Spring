package kr.co.ch04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * 날짜 : 2022/04/05
 * 이름 : 양대석
 * 내용 : Ch04.스프링 MVC 실습하기
 */

@Controller
public class MainController {

	@GetMapping("/hello")
	public String hello() {
		return "/hello";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "/welcome";
	}
	
	@GetMapping("/greeting")
	public String greeting() {
		return "/greeting";
	}
	
	@GetMapping("/redirect")
	public String redirect() {
		return "redirect:/sub1/hello";
	}
	
	@GetMapping("/forward")  //주소가 바뀌지 않고 이동
	public String forward() {
		return "forward:/sub2/hello";
	}
	
	
}