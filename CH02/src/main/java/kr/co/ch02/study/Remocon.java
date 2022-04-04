package kr.co.ch02.study;

import org.springframework.stereotype.Component;

@Component
public class Remocon {
	
	public void powerOn() {
		System.out.println("remocon powerOn!");
		
	}
	public void powerOff() {
		System.out.println("remocon powerOff!");
		
	}
	public void chUp() {
		System.out.println("remocon chUp!");
		
	}
	public void chDown() {
		System.out.println("remocon chDown!");
		
	}

}
