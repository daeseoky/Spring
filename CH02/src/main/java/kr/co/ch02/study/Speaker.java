package kr.co.ch02.study;

import org.springframework.stereotype.Component;

@Component
public class Speaker {
	
	public void soundUp() {
		System.out.println("speaker soundUp");
	}
	
	public void soundDown() {
		System.out.println("speaker soundDown");
	}
}
