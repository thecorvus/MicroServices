package org.cloudservice.consumer.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class SayHiController {
	
	@Autowired
	public SayHiService sayHiService;
	
	
	
	@RequestMapping("/sayHi")
	public String sayHi(){
		return sayHiService.sayHi();
		
	}
	
	@Service
	class SayHiService{
		
		@Autowired
		public RestTemplate restTemplate;
		
		
		@HystrixCommand(fallbackMethod = "fackback")
		public String sayHi(){
			return restTemplate.getForObject("http://MessageClient/message/sayHi",String.class);
		}
		
		public String fackback(){
			return "time out for this sayHi service";
		}
		
	}
	
}
