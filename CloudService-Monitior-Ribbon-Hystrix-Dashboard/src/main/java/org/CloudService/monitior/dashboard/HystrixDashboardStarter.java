package org.CloudService.monitior.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringCloudApplication
@EnableHystrixDashboard
public class HystrixDashboardStarter 
{
	/**
	 * http://localhost:8775/hystrix
	 * http://localhost:8765/hystrix.stream
	 * http://blog.didispace.com/spring-cloud-starter-dalston-5-1/
	 * @param args
	 */
    public static void main( String[] args )
    {
        SpringApplication.run(HystrixDashboardStarter.class, args);
    }
}
