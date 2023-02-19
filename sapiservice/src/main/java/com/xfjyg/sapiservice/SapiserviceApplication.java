package com.xfjyg.sapiservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.xfjyg.sapiservice.mapper")
public class SapiserviceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SapiserviceApplication.class, args);
	}

}
