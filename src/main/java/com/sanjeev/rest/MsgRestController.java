package com.sanjeev.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/contact")
	public String contact() {
		return "Call us : 98 98 67 76 34";
	}
	
	@GetMapping("/logincheck")
	public String logIn() {
		return "login successfully";
	}
	
	
	
	@GetMapping("/hi")
	public String sayHi() {
		return "Hi , How are you ? ";
		
	}

	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello , How are you ? ";
		
	}

}
