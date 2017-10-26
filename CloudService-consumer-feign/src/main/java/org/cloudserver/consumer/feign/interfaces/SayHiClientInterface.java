package org.cloudserver.consumer.feign.interfaces;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "MessageClient")
public interface SayHiClientInterface {
	
	
	@RequestMapping("/message/sayHi")
	String sayHi();
	
}
