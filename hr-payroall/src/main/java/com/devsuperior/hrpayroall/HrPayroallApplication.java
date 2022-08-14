package com.devsuperior.hrpayroall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@RibbonClient(name = "hr-worker")
@SpringBootApplication
public class HrPayroallApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrPayroallApplication.class, args);
	}

}
