package org.cloudservice.consumer.message.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class SayHiController {
	
	
	@RequestMapping("/sayHi")
	public String sayHi() throws InterruptedException{
		return "Hi" ;
	}
}
