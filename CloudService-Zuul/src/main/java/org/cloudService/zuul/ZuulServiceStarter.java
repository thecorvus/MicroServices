package org.cloudService.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulServiceStarter 
{
    public static void main( String[] args )
    {
        SpringApplication.run(ZuulServiceStarter.class, args);
    }
    
    
    @Bean
	public org.cloudService.zuul.filter.PFRTokenFilter PFRTokenFilter() {
		return new org.cloudService.zuul.filter.PFRTokenFilter();
	}

}
