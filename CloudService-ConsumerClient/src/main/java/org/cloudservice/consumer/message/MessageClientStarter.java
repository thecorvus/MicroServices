package org.cloudservice.consumer.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MessageClientStarter 
{
	/**
	 * --spring.profiles.active=service1,service2,service3
	 * @param args
	 */
    public static void main( String[] args )
    {
        SpringApplication.run(MessageClientStarter.class,args);
    }
}
