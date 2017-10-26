package org.cloudserver.consumer.feign.controller;

import org.cloudserver.consumer.feign.interfaces.SayHiClientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignClientController {
	
	@Autowired
	SayHiClientInterface MessageClient;
	
    @RequestMapping("/hi")
    public String sayHi() {
        return MessageClient.sayHi();
    }
}
